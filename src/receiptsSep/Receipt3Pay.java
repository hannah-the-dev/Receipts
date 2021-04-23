package receiptsSep;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt3Pay {
	GettingBytes by = new GettingBytes();					// gettingBytes 사용 선언
	DecimalFormat k21_format = new DecimalFormat("###,###,###"); 			//출력 포맷 지정

	public void printPayInfo(int k21_dutyFree, int k21_duty) {
//		SimpleDateFormat k21_sdfb = new SimpleDateFormat("yyyyMMdd");	// 바코드용 날짜 포맷 지정

		String k21_credit = "123456789010";											// 카드 번호
		//카드 번호 가리기, 카드 이름 잘림
		System.out.printf("%s %14s/%s\n", "0021 KEB 하나카드", by.gettingAnonymous(k21_credit,7,8), "12345678");	
		// 카드 결제 정보, 금액
		System.out.printf("%-12s %21s\n", "카드결제(IC)", "일시불 / " + k21_format.format(k21_duty+k21_dutyFree));	
		System.out.printf("-----------------------------------------\n");
	}
	public void printPoints(int k21_dutyFree, int k21_duty) {
		// 현재 시스템 시간 인스턴스 받아오기
		Calendar k21_cal = Calendar.getInstance();								
		k21_cal.add(Calendar.MINUTE, -90);										// 90분 전에 입차했다고 가정
		SimpleDateFormat k21_sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	// 날짜 포맷 지정

		System.out.printf("          [신세계포인트 적립]\n");
		// 이름의 중간자만 가리고 싶을 때 사용
		System.out.printf("%s 고객님의 포인트 현황입니다.\n", by.gettingAnonymous("안설란",2,2));	
		int k21_point = (int)((k21_duty+k21_dutyFree)/1000);
		int k21_pointBefore = 5000;
		System.out.printf("금회발생포인트 %18s %7s\n", 
				by.gettingAnonymous("9350009558",5,6), 
				k21_format.format(k21_point));	// 포인트 = 합계/1000
		System.out.printf("누계(가용)포인트 %12s(%10s)\n", 
				k21_format.format(k21_point + k21_pointBefore), 
				k21_format.format(k21_pointBefore));	// 가용 포인트 + 금회 발생 포인트 = 누계 포인트
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("   구매금액기준 무료주차시간 자동 부여\n");
		System.out.printf("차량번호 : %25.3s****\n", "12가1234");							// 차량 번호 가리기
		System.out.printf("입차시간 : %30s\n", k21_sdf.format(k21_cal.getTime()));		// 입차시간(90분 전)
		System.out.printf("-----------------------------------------\n");
		
	}
}
