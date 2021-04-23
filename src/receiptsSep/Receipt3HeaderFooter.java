package receiptsSep;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt3HeaderFooter {
	DecimalFormat k21_format = new DecimalFormat("###,###,###"); 			//출력 포맷 지정
	Calendar k21_cal = Calendar.getInstance();								// 현재 시스템 시간 인스턴스 받아오기
	SimpleDateFormat k21_sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	// 날짜 포맷 지정
	SimpleDateFormat k21_sdfb = new SimpleDateFormat("yyyyMMdd");	// 바코드용 날짜 포맷 지정
	GettingBytes by = new GettingBytes();					// gettingBytes 사용 선언

	final String branch = "죽전점";
	final String tel = "(031)888-1234"; 
	final String address = "용인 수지구 포은대로 552";
	final String bizRegNum = "206-86-50913";
	final String representitive = "강희석";
	
	public void printHeader() {
		System.out.printf("  emart   이마트 %s %s\n", branch, tel);
		System.out.printf("  emart   %s %s\n", bizRegNum, representitive);
		System.out.printf("  emart   %s\n\n", address);
		System.out.printf("영수증 미지참시 교환/환불 불가\n");
		System.out.printf("정상상품에 한함, 30일 이내(신선7일)\n");
		System.out.printf("※일부 브랜드매장 제외(매장 고지물참조)\n");
		System.out.printf("교환/환불 구매점에서 가능(결제카드 지참)\n\n");
		
		System.out.printf("[구매]%.16s      POS:%s\n", k21_sdf.format(k21_cal.getTime()), "0011-9861");
		// 구매 시간은 초단위까지 표시, 포스 번호 표시
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%-16s %s %4s %6s\n", "  상 품 명", "단 가", "수량", "금 액");
		System.out.printf("-----------------------------------------\n");
	}
	public void printFooter() {
		System.out.printf("캐셔:%s %.1s00 %24d\n", "011202", by.gettingAnonymous("최수지", 2, 3, '0'), 1150);// 캐셔 번호, 이름 일부 인쇄
		System.out.printf("      %s/%d/%d/%d",k21_sdfb.format(k21_cal.getTime()),12345678,12345678,31);				//계산시간
	}
}
