package Java_Selenium_Special_Methods;

import org.apache.commons.codec.binary.Base64;

public class Tutorial_Class_18_EncodingAndecodingStrings {

	public static void main(String[] args) {

		String str = "muratdlgr@gmail.com";

		byte[]	encodeString= Base64.encodeBase64(str.getBytes());

		System.out.println("encoded string: " + new String(encodeString));

		byte[] decodedString= Base64.decodeBase64(encodeString);
		
		System.out.println("decoded string: " + new String(decodedString));
	
	}

}
