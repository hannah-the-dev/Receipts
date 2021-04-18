package receipts;

public class gettingBytes {				//bytes: 보여주고 싶은 문자열의 너비
	public String gettingSpaces(String k21_words, int k21_bytes) throws StringIndexOutOfBoundsException{
		k21_words += "                  ";			// words 문자열이 짧을 경우 에러 방지하기 위해 공백 추가
		String[] k21_charactors = k21_words.split(""); // words에 포함된 문자로 배열 구성 
		int k21_width = 0;								// 보이는 너비(전자=2, 반자1)
		int k21_cutHere = 0;							// 해당 너비에서 글자수(전자, 반자 모두 1)
		for (String k21_charactor : k21_charactors) {  // 각 글자가
			if (k21_charactor.getBytes().length == 1) {	// 1바이트 문자일 경우
				k21_width ++ ;							// width는 1추가
				k21_cutHere ++;							// cutHere는 1추가
			} else {									// 1바이트 문자가 아닐 경우(한글 3바이트)
				k21_width +=2;							// width 는 2추가
				k21_cutHere ++;							// cutHere는 1추가
			}
			if (k21_width >= k21_bytes * 2) {		// width가 보여주고 싶은 문자열의 너비*2와 같거나 커지면
				break;									// break, 
				}
			}
		
		String k21_answer = k21_words.substring(0, k21_cutHere);
		return k21_answer;
	}
	public String gettingAnonymous(String k21_original, int start, int end) {
		int k21_len = k21_original.length();				// 길이 변수 생성
		String k21_answer = k21_original.charAt(0)+"";		// 첫글자로 리턴문구 첫자 초기화
		
		for (int k21_i = 1; k21_i < start-1; k21_i++) {		// start 전까지는 원 문자 그대로 저장
			k21_answer += k21_original.charAt(k21_i)+"";	
		}
		for (int k21_i = start; k21_i < end+1; k21_i++) {	// start부터 end 까지는 * 저장
			k21_answer += "*";	
		}
		k21_answer += k21_original.substring(end);			// end 이후 문자 그대로 저장
		
		return k21_answer;
	}
}
