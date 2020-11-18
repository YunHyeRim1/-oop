package calculator;

public class CalculatorController {
	int execute(CalculatorDTO param) {
		CalculatorService service = new CalculatorServiceImpl();
	
		int result = 0;
		String opcode = param.getOpcode();
		
		if(opcode.equals("+")) {
			result = service.add(param);
		}else if(opcode.equals("-")) {
			result = service.minus(param);
		}else if(opcode.equals("*")) {
			result = service.multi(param);
		}else if(opcode.equals("/")) {
			result = service.divid(param);
		}else if(opcode.equals("%")) {
			result = service.modul(param);
		}
		
		return result;
	}
}
