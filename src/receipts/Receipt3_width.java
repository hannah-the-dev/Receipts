package receipts;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt3_width {		//emart  full: %34s

	public static void main(String[] args) {
		String[] item = {
//				"매일허쉬초콜릿드링크", "빙그레바나나맛우유", "매일아침에오렌지주스", "서울우유서울우유저지방900ml", "스타벅스더블샷에스프레소&크림(200ml*4캔)",
//				"서울우유체다슬라이스치즈(300g2개입)600g", "소와나무체다치즈클래식204g", "필라델피아소프트필라델피아크림치즈플레인200g", "상하치즈더블업모짜렐라슬라이스 240g", "그라나파다노150g",
//				"피코크페페론치노홀25g(파우치)", "CJ백설자일로스설탕(하얀) 1kg", "하인즈스위트랠리쉬769ml", "레벤스바움유기농오레가노15g", "르네디종홀그레인머스타드 190g",
//				"노브랜드채끝스테이크육포200g", "양송이크림스프 270g", "CJ스팸클래식1,200g(200g*6입)", "농심둥지냉면 비빔냉면 162gx4입", "농심사천짜파게티4입",
//				"큐원유러피언와플믹스500g", "(주)복음자리45도과일잼 딸기 350g", "CJ백설퓨어올리브오일 500ml", "샘표연두275ml*2", "CJ투썸요거트파우더320g",
//				"삼양핵불닭소스200g", "청정원명란크림파스타소스350g", "꽃게탕면412g(4입)", "오리온오그래놀라바검은콩120g", "하인즈리듀스드케찹369g" 

				"[JAJU/자주] 노바 여성용 EVA 욕실화 2P",
				"[JAJU/자주] 자주 쓰는 고무장갑 3P_그레이",
				"[JAJU/자주] 플라워 가든 피치스킨 차렵이불_D_네이비",
				"피지 파워시트세제 30매",
				"퍼실 파워젤 1.5L*2 드럼퍼실 파워젤 1.5L*2",
				"퍼실 파워젤 1.5L*2 일반퍼실 파워젤 1.5L*2",
				"다우니프리미엄 세탁세제 2L(블루)",
				"프리미엄 세탁세제 2L(핑크)",
				"다우니 프리미엄 세탁세제 2L(실내건조)",
				"다우니프리미엄 세탁세제 폼형 24입(블루)",
				
				"고농축 섬유유연제 엑스퍼트 2L(스포츠)",
				"다우니퍼퓸 초고농축 섬유유연제 2L(블랙 미스티크)",
				"다우니퍼퓸 초고농축 섬유유연제 2L(코튼 퓨어 러브)",
				"다우니퍼퓸 초고농축 섬유유연제 2L(스프링 가든 러브)",
				"르샤트라 섬유유연제1.6L(라벤더부케)",
				"LG생활건강아우라 딜라이트 2.3L(스윗만다린)",
				"LG생활건강아우라 딜라이트 2.3L(매그놀리아)",
				"LG생활건강아우라 딜라이트2.3L(플로럴)",
				"엄마의선택 구연산1KG",
				"랩신 홈백신 욕실용 900ML",
				
				"랩신 홈백신 주방용 900ML",
				"[헨켈] 브레프 파워 액티브 레몬 2P",
//				"[헨켈] 브레프 파워 액티브 오션 2P",
				"[헨켈] 브레프 파워 액티브 파인 2P",
				"헨켈브레프 파워액티브 라벤더 2P",
				"LG생활건강[홈스타] 뿌리는 곰팡이 싹 900ml",
				"[홈스타] 욕실세정용 900ML",
				"LG생활건강[홈스타] 강력세정 주방용 900ml",
				"LG생활건강[홈스타] 착붙는 락스 스프레이 900ml",
				"르샤트라",
				"f"
				
//				"[JAJU/자주] 이지케어 리넨 랩 스커트_OATMEAL",
//				"[JAJU/자주] 슬림핏 립 반팔 티셔츠_WHITE",
//				"[JAJU/자주] 이지케어 리넨 와이드 팬츠_BEIGE",
//				"[JAJU/자주] 오션 양면 각질 제거 등밀이 타월_네이비",
//				"[JAJU/자주] 슬림핏 립 반팔 티셔츠_LEMON",
//				"[JAJU/자주] 에어 스트링 반팔 원피스_BEIGE",
//				"[JAJU/자주] 오가닉 시어서커 체크 3부 팬츠_BLACK",
//				"[JAJU/자주] 오가닉 코튼 시어서커 베개 커버_70x50_옐로",
//				"[JAJU/자주] 접촉 냉감 쫀득 쿠션_물개",
//				"[JAJU/자주] 이지케어 리넨 스트링 반팔 원피스_BLACK",
//				
//				"[JAJU/자주] 리넨 루즈핏 칠부 티셔츠_WHITE",
//				"[JAJU/자주] 발이 편한 충격 흡수 양면 매트_120X44_멀티도트",
//				"[JAJU/자주] 단단한 엠보형 면봉 200P",
//				"[JAJU/자주] 하트 코튼 팬티 5P",
//				"[JAJU/자주] 명인이 만든 김부각",
//				"[JAJU/자주] 달콤바삭 누룽지과자",
//				"[JAJU/자주] 노바 남성용 EVA 욕실화 2P",
//				"[JAJU/자주]점보달고나",
//				"[JAJU/자주] 손잡이 야채탈수기 16CM",
//				"[JAJU/자주] 분리되는 4겹 멀티 화장솜 100P",
				
//				"다우니프리미엄 세탁세제 폼형 24입(핑크)",
//				"다우니프리미엄 세탁세제 폼형 24입(실내건조)",
//				"유한젠 스포츠 표백제 2.3L",
//				"암앤해머 트로피컬 세탁세제 2.21L",
//				"암앤해머 클린버스트 세탁세제 2.21L",
//				"비트액체 2.4L*2 겸용",
//				"피지 파워젤 세제 오리지널2.7L",
//				"피지 파워젤 세제 프레쉬2.7L
//				"리큐 진한겔 플러스 2.4L*2.4L(일반/드럼겸용)",
//				"고농축 섬유유연제 엑스퍼트 2L(실내건조)",
				
//				"LG생활건강아우라 바이럭스 실내건조 2L(자스민)",
//				"LG생활건강아우라 바이럭스 실내건조 2L(라임)",
//				"LG생활건강아우라 건조기시트 120매(윌유메리미)",
//				"LG생활건강아우라 건조기시트 120매(스윗만다린)",
//				"LG생활건강아우라 건조기시트 120매(매그놀리아)",
//				"순샘 베이킹피톤치드 1.6L 리필",
//				"순샘 구연산 자몽 1.6L 리필",
//				"LG생활건강자연퐁 뿌리는주방세제 500ML*2+AURA 200ML",
//				"[애경] 엄마의선택 베이킹소다 3KG",
//				"엄마의선택 100% 과탄산소다 1KG",
				
		};				// 구매 품목 저장 array
//		int[] k21_price = {
//				1500, 1700, 2500, 1800, 2500,
//				7800, 3200, 6300, 4250, 5100,
//				3800, 4400, 5000, 4480, 6700,
//				6500, 6370, 3400, 7560, 1300,
//				3500, 4750, 6830, 9210, 3420,
//				4500, 3480, 6400, 3420, 5300
//		};				// 구매 단가
		int[] k21_price = {
				150000, 17000, 200500, 1800000, 2000500,
				7800, 3200, 6300000, 425000, 510000,
				3800, 4400000, 500000, 9990000, 6700,
				6500, 6370, 3400, 7560, 1300,
				3500, 4750, 6830, 9210, 3420,
				4500, 3480, 6400, 100, 1
		};				// 구매 단가
//		int[] k21_price = {
//				150000, 17000, 2000, 800, 1500,
//				7800, 3200, 6000, 42000, 50000,
//				3800, 4400000, 50000, 99000, 6700,
//				6500, 6370, 3400, 7560, 1300,
//				3500, 4750, 6830, 9210, 3420,
//				4500, 3480, 6400, 100, 1
//		};				// 구매 단가
		int[] k21_qty = {
				1, 3, 1, 2, 10,
				2, 1, 1, 1, 2,
				3, 1, 1, 3, 4,
				3, 3, 1, 4, 1,
				2, 2, 1, 1, 4,
				5, 1, 3, 1, 1
		};				// 품목당 구매 개수
		boolean[] k21_tax = {
				true, true, true, true, true,
				true, false, true, true, false,
				true, true, false, true, true,
				true, true, true, true, false,
				true, true, false, true, true,
				false, true, true, true, true,
		};				// 구매 품목 부가세 부여 여부

		DecimalFormat k21_format = new DecimalFormat("###,###,###"); 			//출력 포맷 지정
		Calendar k21_cal = Calendar.getInstance();								// 현재 시스템 시간 인스턴스 받아오기
		SimpleDateFormat k21_sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	// 날짜 포맷 지정
		SimpleDateFormat k21_sdfb = new SimpleDateFormat("yyyyMMdd");	// 바코드용 날짜 포맷 지정
		
		System.out.printf("  emart   이마트 죽전점 (031)888-1234\n");
		System.out.printf("  emart   206-86-50913 강희석\n");
		System.out.printf("  emart   용인 수지구 포은대로 552\n\n");
		System.out.printf("영수증 미지참시 교환/환불 불가\n");
		System.out.printf("정상상품에 한함, 30일 이내(신선7일)\n");
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n\n");
		
		System.out.printf("[구매]%.16s      POS:%s\n", k21_sdf.format(k21_cal.getTime()), "0011-9861");
		// 구매 시간은 초단위까지 표시, 포스 번호 표시
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%-16s %s %4s %6s\n", "  상 품 명", "단 가", "수량", "금 액");
		System.out.printf("-----------------------------------------\n");
		
		int k21_dutyFree = 0;			// 면세 품목 합계 저장용
		int k21_duty = 0;				// 과세 품목 합계 저장용
		int k21_counter = 0;			// 총 수량 계산용
		gettingBytes by = new gettingBytes();					// gettingBytes 사용 선언
		
		for (int k21_i = 0; k21_i < item.length; k21_i++) {		// 품목 개수만큼 반복
			if (k21_tax[k21_i] == false) { 						// 해당 품목 면세품목일 경우
				System.out.printf("*");						// * 출력
				k21_dutyFree += k21_qty[k21_i] * k21_price[k21_i];	// dutyFree에 합산
			}
			else {												// 면세 품목이 아닐 경우
				System.out.printf(" ") ;						// 공란 출력
				k21_duty += k21_qty[k21_i] * k21_price[k21_i];	// duty에 합산
			}
			String k21_itemTrimmed = by.gettingSpaces(item[k21_i], 8);	// gettingSpaces가 반환하는 문자열 itemTrimmed 선언
			System.out.printf("%s%10s%3d%11s\n", k21_itemTrimmed, k21_format.format(k21_price[k21_i]), 
					k21_qty[k21_i], k21_format.format(k21_qty[k21_i] * k21_price[k21_i]));
			// 반환된 품목명은 10자리이므로 그대로 표시, 단가, 수량, 금액 순서대로 반복문으로 한줄씩 불러옴
			// 숫자 포맷 적용시 String으로 인식함 주의
			k21_counter += k21_qty[k21_i]; 			// 품목별 수량 합산
				
			if (k21_i % 5 == 4 && k21_i != item.length-1)		// 5줄 출력 후 구분자 인쇄
				System.out.printf("-----------------------------------------\n");
		}
		
		int k21_beforeTax = (int) Math.floor(k21_duty/11.0*10);		// 과세액 계산 버림 처리
		// 한글이 1자 적으면 그만큼 자리수 늘려줘야 맞음
		System.out.printf("\n%22s %13s\n", "총 품목 수량", k21_format.format(item.length));		// 총 품목 수량
		System.out.printf("%23s %13s\n", "(*)면 세  물 품", k21_format.format(k21_dutyFree));		// 면세 총액
		System.out.printf("%23s %13s\n", "과 세  물 품", k21_format.format(k21_beforeTax));	// 과세 총액
		System.out.printf("%24s %13s\n", "부   가   세", k21_format.format(k21_duty - k21_beforeTax));	// 세액
		System.out.printf("%25s %13s\n", "합        계", k21_format.format(k21_duty+k21_dutyFree));		// 합계(=과세(세후)+면세)
		System.out.printf("%-20s %14s\n", "결 제 대 상 금 액", k21_format.format(k21_duty+k21_dutyFree));	// 결제대상금액 = 합계액
		System.out.printf("-----------------------------------------\n");
		String k21_credit = "123456789010";											// 카드 번호
		System.out.printf("%s %14s/%s\n", "0021 KEB 하나카드", by.gettingAnonymous(k21_credit,7,8), "12345678");		//카드 번호 가리기, 카드 이름 잘림
		System.out.printf("%-12s %21s\n", "카드결제(IC)", "일시불 / " + k21_format.format(k21_duty+k21_dutyFree));			// 카드 결제 정보, 금액
		System.out.printf("-----------------------------------------\n");
		System.out.printf("          [신세계포인트 적립]\n");
		System.out.printf("%s 고객님의 포인트 현황입니다.\n", by.gettingAnonymous("안설란",2,2));			// 이름의 중간자만 가리고 싶을 때 사용
		int k21_point = (int)((k21_duty+k21_dutyFree)/1000);
		int k21_pointBefore = 5000;
		System.out.printf("금회발생포인트 %18s %7s\n", by.gettingAnonymous("9350009558",5,6), k21_format.format(k21_point));	// 포인트 = 합계/1000
		System.out.printf("누계(가용)포인트 %12s(%10s)\n", k21_format.format(k21_point + k21_pointBefore), k21_format.format(k21_pointBefore));	// 가용 포인트 + 금회 발생 포인트 = 누계 포인트
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("   구매금액기준 무료주차시간 자동 부여\n");
		System.out.printf("차량번호 : %25.3s****\n", "12가1234");							// 차량 번호 가리기
		System.out.printf("입차시간 : %30s\n", k21_sdf.format(k21_cal.getTime()));		// 입차시간: 입차시간 확인 로직 불분명, 인스턴스 시간 전체 출력
		System.out.printf("-----------------------------------------\n");
		System.out.printf("캐셔:%s %.1s00 %24d\n", "011202", "최수지", 1150);// 캐셔 번호, 이름 일부 인쇄
		System.out.printf("      %s/%d/%d/%d",k21_sdfb.format(k21_cal.getTime()),12345678,12345678,31);
	}
}

