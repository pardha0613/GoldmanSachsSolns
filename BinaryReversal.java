package algos;

import java.math.BigDecimal;

public class BinaryReversal {

	public static int BinaryReversal(int n) {
		
		//Approach1
		String s = Integer.toBinaryString(n);
		//Approach2 in finding the binary representation of string
		String s2 = "";
		while (n > 0)
	    {
	        s2 =  ( (n % 2 ) == 0 ? "0" : "1") +s2;
	        n = n / 2;
	    }
		//System.out.println(s2);
		StringBuilder sb = new StringBuilder();
		
		
		while (sb.length()<8-s.length()) {
			sb.append('0');
		}
		
		sb.append(s);
		String s1 = sb.reverse().toString();
		
		int n1 = binaryToDecimal(s1);
		return n1;
		
	}
	
	private static int binaryToDecimal(String s1) {
		int dec_value =0;
		int base_value = 1;// initializing the base value to 1
		for(int i=s1.length()-1;i>=0;i--) {
			
			if(s1.charAt(i)=='1')
				dec_value+=base_value;
			base_value=base_value*2;
		}
		return dec_value;
	}

	public static void main(String[] args) {
		System.out.println(BinaryReversal(47));
	}
}
