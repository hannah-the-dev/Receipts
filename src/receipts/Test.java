package receipts;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		String[] k19_item = { "가a", "(G)LH원형유리화병 10호", "상투과자E", "더블링 나일론 깡 롤빗", "해피홈 SAFE 핸드워시",
				"농심 신라면120g*5", "(대)국내산삼겹살찌개용", "오뚜기 진비빔면 156g", "GAP 죽장사과 4-6입/국내산", "순 유기농 바나나(봉)",
				"피코크 탄두리 닭가슴살", "(달콤)순살닭강정(g)", "DZ주니어양말3족C_BK", "DZ주니어양말3족C_WH", "프리미엄생연어초밥",
				"피코크 들깨미역국500g", "남양 맛있는우유GT 저지방", "녹차원흑당시럽10입입", "진라면소컵(매)65g*6", "케라시스 앰플 트리트먼트",
				"푸르밀 미숫가루우유", "자일로스", "CJ 비비고칩 20G", "아일랜드드레싱공백없이한글만", "피코크 사골곰탕500",
				"노브랜드냉동삼겹살바", "동원DHA참치36호100g*3", "노브랜드 냉동닭안심1kg", "표고버섯(팩)"
				};	// 상품명 목록
				
		int[] k19_price = { 7500, 6900, 5980, 3300, 5500,
				3380, 6610, 2750, 10800, 4980,
				2480, 7920, 4980, 4980, 7130,
				12980, 1990, 4980, 3210, 6950,
				5960, 4980, 1980, 1950, 4480,
				9900, 2850, 5980, 9900
				};	// 상품가격 목록
		int[] k19_amount = { 2, 1, 1, 1, 2,
				1, 1, 1, 1, 1, 
				1, 1, 2, 1, 1,
				4, 1, 1, 1, 1,
				2, 2, 1, 1, 1,
				1, 3, 1, 2
				};	// 상품수량 목록
		
		boolean[] k19_taxFree = { false, false, false, false, false, 
				false, true, false, true, true, 
				true, false, false, false, false, 
				false, true, false, false, false, 
				false, false, false, false, false,
				true, false, true, true
				};	// 면세여부 목록

		SimpleDateFormat k19_sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm"); // 날짜 출력 형식
		SimpleDateFormat k19_underSdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); // 날짜 출력 형식
		SimpleDateFormat k19_barcodeSdf = new SimpleDateFormat("YYYYMMdd"); // 날짜 출력 형식
		Date k19_date = new Date(); // 현재 날짜
		String k19_nowTime = k19_sdf.format(k19_date); // 날짜 출력 형식 적용한 현재 날짜
		DecimalFormat k19_df = new DecimalFormat("###,###,###,###,###"); // 숫자 출력 형식
		int k19_taxPrice = 0;	// 과세품목 총합계
		int k19_freePrice = 0;	// 면세품목 총합계
		int k19_totalPrice = 0;	// 전체 합계액
		int k19_netPrice; // 공급가액
		int k19_tax; // 부가세
		
		// 영수증 상단 출력
		System.out.printf("             이마트 죽전점 (031)888-1234\n");
		System.out.printf("    emart    206-86-50913 강희석\n"); // 지점
		System.out.printf("             용인 수지구 포은대로 552\n"); // 전화번호
		System.out.printf("영수증 미지참시 교환/환불 불가\n"); // 본사
		System.out.printf("정상 상품에 한함, 30일 이내(신선 7일)\n"); // 대표, 사업자번호
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n"); // 주소
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n\n"); // 주소
		System.out.printf("[구 매]%-21s", k19_nowTime); // 현재시간 출력
		System.out.printf("POS:0011-9861\n"); // 현재시간 출력
		System.out.printf("-----------------------------------------\n");
		System.out.printf(" 상 품 명            단 가  수량   금  액\n");
		System.out.printf("-----------------------------------------\n");

		// 상품 출력
		for (int i = 0; i < k19_item.length; i++) {	// 상품 목록 전체 출력
			if (k19_taxFree[i]) {	// 면세상품인 경우
				System.out.printf("*");	// 면세표시 출력
				k19_freePrice += (k19_price[i] * k19_amount[i]);	// 면세가격 합산
			} else {	// 과세상품인 경우
				System.out.printf(" ");	// 공백 출력
				k19_taxPrice += (k19_price[i] * k19_amount[i]);	// 과세가격 합산
			}
			System.out.printf("%s%9.9s%2d%11.11s\n", k19_stringByBytes(k19_item[i], 9),	// 상품명(8자)
					k19_df.format(k19_price[i]), k19_amount[i], 	// 상품 가격, 상품 수량
					k19_df.format(k19_price[i] * k19_amount[i]));	// 상품 합계 가격
			if ((i + 1) % 5 == 0) {	// 상품 5개마다 구분선 출력
				System.out.printf("-----------------------------------------\n");
			}
		}
		
		// 금액 출력
		k19_totalPrice = k19_freePrice + k19_taxPrice;	// 전체 합계 = 면세 가격 + 과세 가격
		k19_netPrice = k19_getNetPrice(k19_taxPrice);	// 과세상품 공급가액 계산
		k19_tax = k19_taxPrice - k19_netPrice;	// 부가세 = 가격 - 공급가액
		System.out.printf("\n               총 품목 수량%14d\n", k19_item.length); // 총 상품 수량
		System.out.printf("            (*)면 세  물 품%14.14s\n", k19_df.format(k19_freePrice)); // 숫자 출력 형식 사용 면세상품 총액
		System.out.printf("               과 세  물 품%14.14s\n", k19_df.format(k19_netPrice)); // 숫자 출력 형식 사용 과세상품 총액
		System.out.printf("               부   가   세%14.14s\n", k19_df.format(k19_tax)); // 숫자 출력 형식 사용 부가세
		System.out.printf("               합        계%14.14s\n", k19_df.format(k19_totalPrice)); // 숫자 출력 형식 사용 총 합계액
		System.out.printf("결 제 대 상 금 액%24.24s\n", k19_df.format(k19_totalPrice)); // 숫자 출력 형식 사용 결제금액
		System.out.printf("-----------------------------------------\n");
		System.out.printf("0012 KEB 하나       541707**0408/35860658\n"); // 카드정보
		System.out.printf("카드결제(IC)        %18.18s\n", "일시불 / " + k19_df.format(k19_totalPrice)); // 숫자 출력 형식 사용 결제 금액
		System.out.printf("-----------------------------------------\n");

		// 영수증 하단 출력
		System.out.printf("          [신세계포인트 적립]\n"); // 포인트정보
		System.out.printf("홍*두 고객님의 포인트 현황입니다.\n");
		System.out.printf("금회발생포인트       9350**9995       164\n");
		System.out.printf("누계(가용)포인트         5,637(    5,473)\n");
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("    구매금액기준 무료주차시간 자동부여\n");	// 주차정보
		System.out.printf("차량번호 :                       34저****\n");
		System.out.printf("입차시간 :            %s\n", k19_underSdf.format(k19_date));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("캐셔:084599 양00                     1150\n"); // 캐셔정보
		System.out.printf("      lllllllllllllllllllllllllllll\n"); // 바코드
		System.out.printf("      lllllllllllllllllllllllllllll\n");
		System.out.printf("      %s/00119861/00164980/31\n", k19_barcodeSdf.format(k19_date));
	}

	public static int k19_getNetPrice(int k19_iPrice) {	// 공급가액 구하는 메소드
		double k19_taxRate = 10.0 / 11.0;	// 부가세율 10%, 부동소수점 오류 방지 -> 소비자가격 * 10.0 / 11.0 
		double k19_netPrice = k19_iPrice * k19_taxRate;	// 공급가액 = 총 가격 / (1 + 부가세율)
		return (int) k19_netPrice;	// 정수값 공급가액 리턴
	}
	
	// 한글 포함된 문자열 자르기
	public static String k19_stringByBytes(String k19_inputString, int k19_stringLen) {
		byte[] k19_intoByte = k19_inputString.getBytes();	// 바이트로 받아온 상품명
		int k19_cutByte = 0;	// 잘라낼 인덱스
		int k19_maxByteLen = k19_stringLen * 3; // 최대 바이트 = 한글 3바이트 * 지정 글자수
		int k19_maxWidth = 18; // 최대 칸 너비 지정
		int k19_byteLen = 0; // 문자열 너비(한글 2, 그 외 1)

		for (int i = 0; i < k19_inputString.length(); i++) {	// 문자열 전체
			if (Character.getType(k19_inputString.charAt(i)) == 5) {	// 한글일 경우
				k19_cutByte += 3;	// 잘라낼 인덱스 + 3바이트
			} else {
				k19_cutByte += 1;	// 잘라낼 인덱스 + 1바이트
			}
			if (k19_cutByte >= k19_maxByteLen)	// 최대 바이트수 보다 같거나 크면 탈출
				break;
		}
		
		// 바이트 수로 잘라낸 문자열 생성
		String k19_cutItem = new String(k19_intoByte, 0, k19_cutByte);

		// 문자 너비 체크
		k19_byteLen = k19_getWidth(k19_cutItem);
		
		while (k19_byteLen > k19_maxWidth) {	// 최대 너비보다 클 때
			if (k19_byteLen >= k19_maxWidth) {	// 최대 너비보다 같거나 큰 경우
				k19_cutItem = k19_cutItem.substring(0, k19_cutItem.length() - 1);	// 마지막 글자 삭제			
				k19_byteLen = k19_getWidth(k19_cutItem);	// 문자 너비 다시 체크
			}
		}
		
		// 칸 너비 맞춤
		if (k19_byteLen <= k19_maxWidth) { // 칸 너비보다 작은 경우
			for (int i = 0; i < k19_maxWidth - k19_byteLen; i++) { // 최대칸 너비보다 작은 만큼
				k19_cutItem += " "; // 공백 추가
			}
		}
		return k19_cutItem; // 새로운 상품이름 반환
	}
	
	// 문자열 너비 체크 메소드
	public static int k19_getWidth(String k19_cutItem) {
		int k19_byteLen = 0;
		for (int i = 0; i < k19_cutItem.length(); i++) {	// 문자열 전체
			if (Character.getType(k19_cutItem.charAt(i)) == 5) { // 한글인 경우
				k19_byteLen += 2; // 바이트길이 + 2
			} else { // 한글이 아닌 경우
				k19_byteLen += 1; // 바이트길이 + 1
			}
		}
		return k19_byteLen;
	}
}
