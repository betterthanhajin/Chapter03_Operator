package ch03_1_operator_expression;

public class BitOperation {

	public static void main(String[] args) {
	
		/**
		 * ��Ʈ������( | , & , ^, ~, << , >>)
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
		
		System.out.println("10����:" + (a & b));
		System.out.println("10����:" + (a | b));
		
		System.out.println("3<<2:" + (3<<2));
		System.out.println("1<<7:" + (1<<7));
		System.out.println("128>>5:" + (128>>5));
		System.out.println("3>>2:" + (3>>2));
		
		
		/*
		 * ��Ʈ������ Ȱ��*
		 * 
		 * x,y��ǥ / ����cmyk
		 * ip(Mask)
		 * ��Ʈ��ġ�� �޸����������ؼ�
		 * 
		 * 
		 */
		
		
		
		
	}
}
