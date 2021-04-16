package receipts;

import java.io.UnsupportedEncodingException;

public class gettingBytes {
	
	public String gettingSpaces(String str, int len, int bytes) throws UnsupportedEncodingException {
		if(str.length() > len) {
			str = str.substring(0, len); 
		}

		int num = bytes*2 - str.getBytes("EUC-KR").length;
	    if (str.getBytes().length < 41) {
	    	for (int i = 0; i < 41-str.getBytes().length; i++) {
	    		str = str+" ";
	    		
	    	}
	    }
		return str;
	}
}
