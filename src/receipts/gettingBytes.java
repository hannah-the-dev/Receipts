package receipts;

public class gettingBytes {
	public String gettingBytes(String str, int bytes) {
		byte[] by = str.getBytes();
		int count = 0;
		
		for (int i = 0; i < bytes; i++) {
			if ((by[i] & 0x80) == 0x80)
				count++; // 핵심 코드
		}
		if ((by[bytes - 1] & 0x80) == 0x80 && (count % 2) == 1)
			bytes--; // 핵심코드
		System.out.println("["+ new String(by, 0, bytes)+"]");
		return new String(by, 0, bytes);
	}
	
	public int gettingWidth(String str) {
		char[] chr = str.toCharArray();
		int count = 0;
		for (int i = 0; i < chr.length; i++) {
			if ((chr[i] & 0X80) == 0X80) {
				count++;
			}
		}
		return count;
	}
	
	public String gettingSpaces(String str, int width, int bytes) {
		String temp = str;
		width = (width * 2 > bytes) ? bytes : width;
		
		int spaces = bytes - width*2;
		
		for (int i = 0; i < width; i++) {
			temp += " ";
		}
		
		System.out.println("["+temp+"]");
		return temp;
		
	}
}
