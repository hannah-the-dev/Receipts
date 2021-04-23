package receiptsSep;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import receipts.gettingBytes;

public class Receipt3Items {
	ReceiptCV cv = new ReceiptCV();
	public int[] printItems(int k21_numberOfItems) {			// item 개수만큼 반복
		DecimalFormat k21_format = new DecimalFormat("###,###,###"); 			//출력 포맷 지정
		
		int k21_dutyFree = 0;			// 면세 품목 합계 저장용
		int k21_duty = 0;				// 과세 품목 합계 저장용
		int k21_counter = 0;			// 총 수량 계산용

		gettingBytes by = new gettingBytes();					// gettingBytes 사용 선언

		for (int k21_i = 0; k21_i < k21_numberOfItems; k21_i++) {		
			if (cv.k21_tax[k21_i] == false) { 						// 해당 품목 면세품목일 경우
				System.out.printf("*");						// * 출력
				k21_dutyFree += cv.k21_qty[k21_i] * cv.k21_price[k21_i];	// dutyFree에 합산
			}
			else {												// 면세 품목이 아닐 경우
				System.out.printf(" ") ;						// 공란 출력
				k21_duty += cv.k21_qty[k21_i] * cv.k21_price[k21_i];	// duty에 합산
			}
			// gettingSpaces가 반환하는 문자열 itemTrimmed 선언
			String k21_itemTrimmed = by.gettingSpaces(cv.k21_item[k21_i], 8);	
			System.out.printf("%s%10s%3d%11s\n", k21_itemTrimmed, k21_format.format(cv.k21_price[k21_i]), 
					cv.k21_price[k21_i], k21_format.format(cv.k21_price[k21_i] * cv.k21_price[k21_i]));
			// 반환된 품목명은 10자리이므로 그대로 표시, 단가, 수량, 금액 순서대로 반복문으로 한줄씩 불러옴
			// 숫자 포맷 적용시 String으로 인식함 주의
			k21_counter += cv.k21_price[k21_i]; 			// 품목별 수량 합산
				
			if (k21_i % 5 == 4 && k21_i != cv.k21_item.length-1)		// 5줄 출력 후 구분자 인쇄
				System.out.printf("-----------------------------------------\n");
		}
		int[] calBase = {k21_counter, k21_dutyFree, k21_duty};
		return calBase;
	}
}
