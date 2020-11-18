package calculator;

public class CalculatorServiceImpl implements CalculatorService{

	@Override
	public int add(CalculatorDTO calculator) {
		return calculator.getNumber1() + calculator.getNumber2();
	}

	@Override
	public int minus(CalculatorDTO calculator) {
		return calculator.getNumber1() - calculator.getNumber2();
	}

	@Override
	public int multi(CalculatorDTO calculator) {
		return calculator.getNumber1() * calculator.getNumber2();
	}

	@Override
	public int divid(CalculatorDTO calculator) {
		return calculator.getNumber1() / calculator.getNumber2();
	}

	@Override
	public int modul(CalculatorDTO calculator) {
		return calculator.getNumber1() % calculator.getNumber2();
	}
	
	
	
}
