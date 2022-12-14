package khv.healthlenge.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import khv.healthlenge.domain.dto.item.ItemDetailDTO;
import khv.healthlenge.domain.dto.item.ItemListDTO;
import khv.healthlenge.domain.dto.itemLike.ItemLikeEntityListDTO;
import khv.healthlenge.domain.dto.itemLike.ItemLikeInsertDTO;
import khv.healthlenge.domain.entity.itemLikes.ItemLikeEntity;
import khv.healthlenge.domain.entity.itemLikes.ItemLikeEntityRepository;
import khv.healthlenge.domain.entity.items.Category;
import khv.healthlenge.domain.entity.items.Item;
import khv.healthlenge.domain.entity.items.ItemRepository;
import khv.healthlenge.domain.entity.member.Member;
import khv.healthlenge.domain.entity.member.MemberRepository;
import khv.healthlenge.service.StoreService;

@Service
public class StoreServiceProcess implements StoreService {
	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private ItemLikeEntityRepository itemLikeEntityRepository;
	
	@Override
	public String storeCategory(Model model) {

		model.addAttribute("storeList", itemRepository.findAll().stream()
					.map(ItemListDTO::new).collect(Collectors.toList()));
		return "/store/index";
	}
	
	//μμΈν
	@Override
	public String detail(Model model, long no) {
		model.addAttribute("itemDetail", 
				itemRepository.findById(no).map(ItemDetailDTO::new).get()
				);
		return "store/itemDetial";
	}
	
	@Override
	public ModelAndView storeIndexList(ModelAndView mv, int divNo, String email) {
		
		Category categorise[]= Category.values();
		
		if(divNo == 6) {
			Member member= memberRepository.findByEmail(email).get();
			
			mv.addObject("itemlist", itemLikeEntityRepository.findAllByMember(member)
							.stream().map(ItemLikeEntityListDTO::new).toList());
			mv.setViewName("/layout/store/like");
			return mv;
			
		}else {
			Category category= categorise[divNo];
			
//		faqEntityRepository.findAllByDiv(div).forEach(System.out::println);
//		List<FaqListDTO> result= faqEntityRepository.findAllByDiv(div).stream()
//				.map(FaqListDTO::new).collect(Collectors.toList());
			
			mv.addObject("itemlist", itemRepository.findAllByCategorys(category).stream()
			.map(ItemListDTO::new).collect(Collectors.toList()));
		}
		
		mv.setViewName("/layout/store/list");
		return mv;
	}
	
	//μ’μμ! λλ₯΄λ©΄ μλνλλ° DB μ μ₯μ true, μ­μ μ false! 
	@Override
	public Boolean itemLike(ItemLikeInsertDTO dto) {
		Member member= memberRepository.findByEmail(dto.getEmail()).get();
		//Item item= itemRepository.findById(dto.getIno()).get(); λ΄κ° ν κ²
		Item item= Item.builder().ino(dto.getIno()).build(); //μ μλμ΄ νμ  κ²
		Optional<ItemLikeEntity> result= itemLikeEntityRepository.findByMemberAndItems(member, item);
		
		if(result.isEmpty()) {
			dto.priceCal(dto.getCount(), dto.getPrice());
			//itemLikeEntityRepository.save(dto.);
			System.out.println("μ€ν");
			return true;
		}
		
		itemLikeEntityRepository.deleteById(result.get().getIlNo());
		
		return false;
	}

}
