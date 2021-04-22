package receipts;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt2 {		//daiso -8by

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
//		String k21_item1 = "3중필터 일회용마스크 50매 대형 블랙 화이트";
//		String k21_itemCode1 = "1031615";
//		int k21_itemPrice1 = 33000;
//		int k21_itemQty1 = 10;
//
//		String k21_item2 = "라탄 패턴 바구니";
//		String k21_itemCode2 = "11008152";
//		int k21_itemPrice2 = 1000;
//		int k21_itemQty2 = 2;
//		
//		String k21_item3 = "센스 다용도 저안트레이 24cm 2호 1개";
//		String k21_itemCode3 = "1020800";
//		int k21_itemPrice3 = 1000;
//		int k21_itemQty3 = 1;

		String k21_item1 = "퓨어메딕 비말차단용마스크(최고급형)";
		String k21_itemCode1 = "1031615";
		int k21_itemPrice1 = 3000;
		int k21_itemQty1 = 1;
		
		String k21_item2 = "슬라이드식 명찰(가로형)         ";
		String k21_itemCode2 = "11008152";
		int k21_itemPrice2 = 1000;
		int k21_itemQty2 = 2;
		
		String k21_item3 = "매직흡착 인테리어후크(알루미늄타입)";
		String k21_itemCode3 = "1020800";
		int k21_itemPrice3 = 1000;
		int k21_itemQty3 = 1;
		
		DecimalFormat k21_format = new DecimalFormat("###,###,###");			// 금액 등 수 표시 형식
		Calendar k21_cal1 = Calendar.getInstance();								// 현재 시간 저장(+14일 용)
		k21_cal1.add(Calendar.DATE, 14);										// 14일 더해 교환, 환불 가능일 계산
		SimpleDateFormat k21_sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");	// 시간 출력 포맷
		SimpleDateFormat k21_sdf1 = new SimpleDateFormat("MM월dd일");			// 일자 출력 포맷
		
		System.out.printf("%22s\n", "\"국민가게, 다이소\"");
		System.out.printf("%s\n", "(주)아성다이소_분당서현점");
		System.out.printf("%s\n", "전화:031-702-6016");
		System.out.printf("%s\n", "본사:서울 강남구 남부순환로 2748 (도곡동)");
		System.out.printf("%s\n", "대표:박정부, 신호섭 213-81-52063");
		
		String k21_address = "경기도 성남시 분당구 분당로53번길 11 (서현동)";
		System.out.printf("매장:%s\n", k21_address);							
		
		System.out.printf("=========================================\n");
		System.out.printf("      소비자중심경영(CCM) 인증기업\n");
		System.out.printf("    ISO 9001 품질경영시스템 인증기업\n");
		System.out.printf("=========================================\n");
		System.out.printf("      교환/환불 14일(%s)이내,\n", k21_sdf1.format(k21_cal1.getTime()));	//환불가능일
		System.out.printf("     (전자)영수증, 결제카드 지참 후 \n"
				+ "            구입매장에서 가능\n");
		System.out.printf("   포장/가격 택 훼손시 교환/환불 불가\n");
		System.out.printf("     체크카드 취소 시 최대 7일 소요\n");
		System.out.printf("=========================================\n");
		Calendar k21_cal = Calendar.getInstance();								// 현재 시간 다시 받기
		System.out.printf("[POS %s] %27s\n", "1058231", k21_sdf.format(k21_cal.getTime()));	// 매출 시간, 포스번호 출력
		System.out.printf("=========================================\n");
		int k21_itemAmount1 = k21_itemPrice1 * k21_itemQty1;					// 1번 아이템 금액 계산
		int k21_itemAmount2 = k21_itemPrice2 * k21_itemQty2;					// 2번 아이템 금액 계산
		int k21_itemAmount3 = k21_itemPrice3 * k21_itemQty3;					// 3번 아이템 금액 계산
		
		gettingBytes k21_by = new gettingBytes();									// gettingBytes 클래스 사용선언
		String k21_item1Str = k21_by.gettingSpaces(k21_item1, 10);						// 14번째 자리에서 자른 문자열1
		String k21_item2Str = k21_by.gettingSpaces(k21_item2, 10);						// 14번째 자리에서 자른 문자열2						
		String k21_item3Str = k21_by.gettingSpaces(k21_item3, 10);						// 14번째 자리에서 자른 문자열3
	
		// 아이템1, 단가1, 수량1, 가격 1 출력
		System.out.printf("%s %7s %2d %9s\n", k21_item1Str, k21_format.format(k21_itemPrice1), 
				k21_itemQty1, k21_format.format(k21_itemAmount1));
		System.out.printf("[%s]\n", k21_itemCode1);			// 품목번호1 출력
		// 아이템2, 단가2, 수량2, 가격 2 출력
		System.out.printf("%s %7s %2d %9s\n", k21_item2Str, k21_format.format(k21_itemPrice2), 
				k21_itemQty2, k21_format.format(k21_itemAmount2));
		System.out.printf("[%s]\n", k21_itemCode2);			// 품목번호2 출력
		// 아이템3, 단가3, 수량3, 가격 3 출력
		System.out.printf("%s %7s %2d %9s\n", k21_item3Str, k21_format.format(k21_itemPrice3), 
				k21_itemQty3, k21_format.format(k21_itemAmount3));
		System.out.printf("[%s]\n", k21_itemCode3);			//품목번호3 출력
		
		int k21_amountSum = k21_itemAmount1+k21_itemAmount2+k21_itemAmount3;		// 아이템 3개 금액 총합
		int k21_beforeTax = (int) Math.floor(k21_amountSum/11.0*10.0);						// 과세금액 계산(소수점 버림)
		System.out.printf("%16s %20s\n", "과세합계", k21_format.format(k21_beforeTax));		// 과세 합계 출력
		System.out.printf("%17s %20s\n", "부가세", k21_format.format(k21_amountSum-k21_beforeTax));	// 부가세=매출액-과세합계
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s %32s\n", "판매합계", k21_format.format(k21_amountSum));		// 총 매출액
		System.out.printf("=========================================\n");
		String k21_credit = "1234567890101112";										// 임의의 카드번호
		System.out.printf("%s %32s\n", "신용카드", k21_format.format(k21_amountSum));	// 카드 매출액
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%s %22.6s**********\n", "우리카드", k21_credit);				// 카드 6자리 이후 *출력
		String k21_approval = "승인금액 " + k21_format.format(k21_amountSum);			// 총 승인금액 
		System.out.printf("승인번호 %s(0) %16s\n", "77982843", k21_approval);			// 승인 금액 출력
		System.out.printf("=========================================\n");
		System.out.printf("%25s 분당서현점\n", k21_sdf.format(k21_cal.getTime()));		// 매출 시간 출력
		System.out.printf("상품 및 기타 문의 : 1522-4400\n");
		System.out.printf("멤버십 및 샵다이소 관련 문의 : 1599-2211\n");
		System.out.printf("            2112820610158231\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf(" \u25C8 다이소 멤버십 앱 또는 홈페이지에 \n"
				+ "   접속하셔서 회원가입 후 다양한 혜택을 \n"
				+ "   누려보세요! \u25C8\n");
	}
}