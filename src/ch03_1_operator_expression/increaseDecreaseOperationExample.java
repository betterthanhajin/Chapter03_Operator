package ch03_1_operator_expression;

public class increaseDecreaseOperationExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z = 0;
		
		System.out.println("---------");
		x++;
		++x;
		System.out.printf("x=%d\n" , x);
		
		System.out.println("---------");
		y--;
		--y;
		System.out.printf("y=%d\n" , y);
		
		System.out.println("---------");
		z = x++;
		System.out.printf("z=%d\n" , z);
		System.out.printf("x=%d\n" , x);
		
		System.out.println("---------");
		z = ++x;
		System.out.printf("z=%d\n" , z);
		System.out.printf("x=%d\n" , x);
		
		System.out.println("---------");
		z = ++x + y++;
		System.out.printf("z=%d\n" , z);
		System.out.printf("x=%d\n" , x);
		System.out.printf("y=%d\n" , y);
	}

}
