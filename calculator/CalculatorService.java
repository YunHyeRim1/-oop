package calculator;

public class CalculatorService {
	
	int add(CalculatorDTO calculator) {
		return calculator.getNumber1() + calculator.getNumber2();
	}
	int minus(CalculatorDTO calculator) {
		return calculator.getNumber1() - calculator.getNumber2();
	}
	int multiply(CalculatorDTO calculator) {
		return calculator.getNumber1() * calculator.getNumber2();
	}
	int divide(CalculatorDTO calculator) {
		return calculator.getNumber1() / calculator.getNumber2();
	}
	int modulo(CalculatorDTO calculator) {
		return calculator.getNumber1() % calculator.getNumber2();
	}
}
