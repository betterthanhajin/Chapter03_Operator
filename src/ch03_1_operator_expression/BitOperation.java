package ch03_1_operator_expression;

public class BitOperation {

	public static void main(String[] args) {
	
		/**
		 * 비트연산자( | , & , ^, ~, << , >>)
		 * 
		 *          or      and       xor
		 ***********************************
		 *
		 *
		 *
		 *
		 */
		int a = 9;
		int b = 11;
		
//		String str = "71";
//		int num = Integer.parseInt(str);
		
		// 1001 -> 9
		// 1011 - > 11
//	&	1001 -> 9
//  ||  1011 -> 11
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		
		System.out.println("10진수:" + (a & b));
		System.out.println("10진수:" + (a | b));
		
		System.out.println("3<<2:" + (3<<2));
		System.out.println("1<<7:" + (1<<7));
		System.out.println("128>>5:" + (128>>5));
		System.out.println("3>>2:" + (3>>2));
		
		
		/*
		 * 비트연산의 활용*
		 * 
		 * x,y좌표 / 색상cmyk
		 * ip(Mask)
		 * 비트합치기 메모리절약을위해서
		 * 
		 * 
		 */
		
		
		
		
	}
}
