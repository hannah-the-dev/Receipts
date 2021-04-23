package receiptsSep;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt3Amount {
	DecimalFormat k21_format = new DecimalFormat("###,###,###"); 			//출력 포맷 지정
	Calendar k21_cal = Calendar.getInstance();								// 현재 시스템 시간 인스턴스 받아오기
	SimpleDateFormat k21_sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");	// 날짜 포맷 지정
	public void printAmount(int k21_dutyFree, int k21_duty, int numberOfItems) {
		
		int k21_beforeTax = (int) Math.floor(k21_duty/11.0*10);		// 과세액 계산 버림 처리
		// 한글이 1자 적으면 그만큼 자리수 늘려줘야 맞음
		System.out.printf("\n%22s %13s\n", 	"총 품목 수량", 	k21_format.format(numberOfItems));		// 총 품목 수량
		System.out.printf("%23s %13s\n", 	"(*)면 세  물 품", 	k21_format.format(k21_dutyFree));		// 면세 총액
		System.out.printf("%23s %13s\n", 	"과 세  물 품", 	k21_format.format(k21_beforeTax));	// 과세 총액
		System.out.printf("%24s %13s\n", 	"부   가   세", 	k21_format.format(k21_duty - k21_beforeTax));	// 세액
		System.out.printf("%25s %13s\n", 	"합        계", 	k21_format.format(k21_duty+k21_dutyFree));		// 합계(=과세(세후)+면세)
		System.out.printf("%-20s %14s\n", 	"결 제 대 상 금 액",k21_format.format(k21_duty+k21_dutyFree));	// 결제대상금액 = 합계액
		System.out.printf("-----------------------------------------\n");
	}
}
