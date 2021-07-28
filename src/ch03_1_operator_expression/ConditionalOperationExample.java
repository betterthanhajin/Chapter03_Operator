package ch03_1_operator_expression;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade;
		grade = (score > 90) ? 'A':((score > 80) ? 'B':'C');
		System.out.printf("%d점은 %등급입니다.\n" ,score,grade);

	}

}
