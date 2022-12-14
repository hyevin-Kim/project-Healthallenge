# Healthlenge
건강한 삶을 위해 건강상품을 판매하는 홈페이지 입니다.

## 목차
1. 프로젝트 개요 
	1. 서비스 설명
	2. 사용 기술
	3. 수행 일정
2. 서비스 설계
	1. exerd
	2. 회원 페이지
	3. 관리자 페이지
	<!--4. 챌린저스&좋아요&인증-->
	5. 상품&장바구니
	<!--6. 포인트&후기-->

### 프로젝트 개요
![최종-004](https://user-images.githubusercontent.com/86452195/187162787-5a857a80-0f6c-42bf-8b67-4768eefb7a4c.png)

### 서비스 설계
1. exerd
    ![최종-008](https://user-images.githubusercontent.com/86452195/187162970-b06c8b92-c181-4e79-bdc1-654e0b525306.png)

2. 회원 페이지
    1. 회원가입
        1. 이메일, 비밀번호,  닉네임
        2. 이메일 인증, 이메일, 닉네임 입력 후 회원가입 가능
    2. 회원 로그인
        1. 이메일과 비밀번호를 통해 로그인 
        2. 비밀번호 분실 -> 가입 시 등록했던 이메일 인증을 통해 비밀번호 재설정
    3. 마이페이지
        1. 로그인 후 우측 상단에 '내 열정 확인'클릭
        2. 계정 설정, 챌린지 기록보기, 주문내역, 성취기록 보기 고정
    4. 회원정보 수정
        1. 계정 설정 페이지에서 비밀번호 인증 후 개인정보 수정 가능
        2. 닉네임 수정 가능
    5. 회원 탈퇴
        1. 계정 설정 페이지에서 회원탈퇴 가능
    <!-- 6. 클래스 다이어그램 과 컨트롤, 세부 서비스 목록 사진 -->
3. 관리자 페이지
    1. 관리자 권한 확인 후 좌측에 '관리자' 클릭
        1. 상품, 챌린지, 메인페이지 이벤트 배너 이미지 관리 가능합니다.
    2. 홈 이벤트 관리
        1. 메인페이지 이벤트 배너 이미지 관리, 메인 페이지에 보여지는 카테고리 관리가능
        2. 이미지 등록, 삭제, 순서 조정 가능
    3. 챌린지 관리
        1. 챌린지 관리 가능
        2. 챌린지 대표 이미지, 상세 설명, 기간, 목표 금액
        3. 등록, 삭제, 수정 가능
    4. 상품 관리
        1. 상품 관리 가능
        2. 상품 등록, 삭제, 수정 가능     
    <!--5. 공지사항
        1. 우측에 '공지사항' 클릭
        2. 관리자들만의 공지사항 게시판으로 중요사항 공유 가능-->
<!--4. 챌린저스&좋아요&인증
    1. 여러 명의 회원이 같은 챌린지에 참가해서 85%이상 달성시 참가비 전액 환급, 85%미만 달성시 달성률 만큼 환급. 85%미만 달성 자가 환급 받지 못한 금액은 상금이 되어 100% 달성된 회원에게 상금으로 부여
    2. 챌린지 목록
        1. 전체 챌린지 카드 형태로 확인 가능
        2. 카테고리 별로 확인 가능
    3. 챌린지 글 보기
        1. 챌린지 제목, 기간, 참여인원, 다른 사람 후기, 내용 순으로 표시됨
    4. 챌린지 좋아요
        1. 챌린지 글 보기에서 좋아요 버튼 클릭시 빨간색으로 변하며 좋아요에 선택됨.
        2. 좋아요를 다시 클릭하면 좋아요에서 삭제되며 원래 css로 변경됨.
    5. 챌린지 참여하기
        1. '시작 전'으로 되어있는 챌린지 '참여하기' 클릭시 참여취소 버튼 생성
            1. 버튼 클릭 후 목표 금액 결제 페이지로 이동
            2. 결제 후 다시 챌린지 글 보기 페이지로 이동
        2. '시작 전'으로 되어있는 챌린지 '참여취소' 클릭시 참여취소되고 '참여하기'버튼 생성 
            1. 버튼 클릭 후 결제 취소 페이지로 이동
            2. 결제 취소 후 다시 챌린지 글 보기 페이지로 이동
    6. 참여한 챌린지(시작한) 인증 글 작성
        1. 참여한 챌린지 페이지에서 챌린지 글 보기 후 '진행중'인 챌린지에 한해서 인증 글 작성 가능
            1. 1번 작성 후 수정 불가
    7. 챌린지 검색
        1. 제목/내용 중 하나 선택 후 검색-->
5. 상품&장바구니 
    1. 상품을 보고 구매할 수 있습니다.
    2. 상품 목록
        1. 전체 상품을 카드 형태로 확인 가능
        2. 카테고리 별로 확인 가능
    3. 상품 글 보기
        1. 상품이름, 가격, 할인금액, 최종 가격, 구매할 수량표시
    4. 상품 장바구니
        1. 장바구니 넣기
            1. 상품 글 페이지에서 원하는 수량을 선택 후 '찜하기' 버튼 클릭시 빨간색으로 변하며 장바구니에 추가됨
            2. 변경된 '찜하기' 버튼 다시 클릭시 원래 색으로 변하며 장바구니에서 사라짐.
        2. 장바구니 목록
            1. 장바구니에 넣은 상품 보기 가능
            2. 선택된 상품 총 결제 금액 확인 가능
            3. 선택한 상품 구매 가능
    5. 상품 구매
        1. '구매하기'버튼 클릭시 주소 입력할 수 있는 페이지 이동
        2. 주소 입력 후 '결제'버튼 클릭시 카카오페이로 결제할 수 있음
        3. 결제 완료 후 구매내역 목록 페이지로 이동
<!--6. 포인트&후기 
    1. 상품을 받고, '구매결정' 버튼 클릭시 포인트 부여됨
    2. '구매결정' 버튼 클릭시 '후기 작성하기'버튼 활성화
        1. 후기 작성
        2. 후기 수정
        3. 후기 보기-->
