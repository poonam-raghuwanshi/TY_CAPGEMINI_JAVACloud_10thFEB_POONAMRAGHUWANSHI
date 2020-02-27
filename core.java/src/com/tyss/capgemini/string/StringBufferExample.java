package com.tyss.capgemini.string;

public class StringBufferExample {
	public static void main(String[] args) {
		String string = "Some String";
		StringBuffer stringBuffer = new StringBuffer(string);
		System.out.println(stringBuffer.getClass());

		System.out.println(stringBuffer.length());

		// append()-this method is not present inside string.
		stringBuffer.append("Buffer");
		System.out.println(stringBuffer);

		System.out.println(stringBuffer.reverse());
		System.out.println(stringBuffer.reverse());

		stringBuffer.replace(0, 1, "s");
		System.out.println(stringBuffer);

		stringBuffer.insert(5, "ABC");
		System.out.println(stringBuffer);

		int index = stringBuffer.indexOf("AB");
		System.out.println(index);
		
		stringBuffer.delete(5, 8);
		System.out.println(stringBuffer);
		
		
	}
}
