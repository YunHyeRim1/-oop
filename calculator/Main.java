package calculator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CalculatorDTO calculator = new CalculatorDTO();
		CalculatorController controller = new CalculatorController();
		CalculatorService service = new CalculatorServiceImpl();
		
		System.out.println("계산기 시작");
		System.out.println("숫자 1을 입력하세요.");
		calculator.setNumber1(scanner.nextInt());
		
		System.out.println("연산자 입력 +, -, *, /, %");
		calculator.setOpcode(scanner.next());
		
		System.out.println("숫자 2를 입력하세요.");
		calculator.setNumber2(scanner.nextInt());
		
		System.out.println("답: "+controller.execute(calculator));

		
		scanner.close();
	}
}
