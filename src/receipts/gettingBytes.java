package receipts;

public class gettingBytes {
	public String gettingSpaces(String words, int bytes) throws StringIndexOutOfBoundsException{
		words += "             ";
		words = words.substring(0, bytes);
		String[] singles = words.split("");
		int width = 0;
		int cutHere = 0;
		for (String single : singles) {
			if (single.getBytes().length == 1) {
				width ++ ;
				cutHere ++;
			} else {
				width +=2;
				cutHere ++;
			}
			if (width >= 28) {//28
				break;
				}
			}
		
		String answer = words.substring(0, cutHere);
		return answer;
	}
}
