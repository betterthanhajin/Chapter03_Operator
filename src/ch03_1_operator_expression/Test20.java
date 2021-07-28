package ch03_1_operator_expression;

public class Test20 {

	public static void main(String[] args) {
		int num1 = 0 , num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0 && (num2 += 10)> 0);
		System.out.println(result);
		System.out.printf("num1=%d , num2=%d\n", num1 , num2);
		
		result =((num1 += 10) > 0 || (num2 += 10) > 0);
		System.out.println(result);
		System.out.printf("num1=%d , num2=%d\n", num1 , num2);
	}
}
