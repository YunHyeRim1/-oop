package calculator;

public class CalculatorController {
	int execute(CalculatorDTO param) {
		CalculatorService service = new CalculatorService();
	
		int result = 0;
		String opcode = param.getOpcode();
		
		if(opcode.equals("+")) {
			result = service.add(param);
		}else if(opcode.equals("-")) {
			result = service.minus(param);
		}else if(opcode.equals("*")) {
			result = service.multiply(param);
		}else if(opcode.equals("/")) {
			result = service.divide(param);
		}else if(opcode.equals("%")) {
			result = service.modulo(param);
		}
		
		return result;
	}
}
