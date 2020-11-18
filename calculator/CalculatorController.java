package calculator;

import bmi.*;
import user.*;

public class CalculatorController {
	public int execute(CalculatorDTO calculator) {
		CalculatorService service = new CalculatorServiceImpl();
	
		int result = 0;
		String opcode = calculator.getOpcode();	
		if(opcode.equals("+")) {
			result = service.add(calculator);
		}else if(opcode.equals("-")) {
			result = service.minus(calculator);
		}else if(opcode.equals("*")) {
			result = service.multi(calculator);
		}else if(opcode.equals("/")) {
			result = service.divid(calculator);
		}else if(opcode.equals("%")) {
			result = service.modul(calculator);
		}
		return result;
	}

}
