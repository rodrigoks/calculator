package br.com.jbusiness.calculator;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!isNumeric(numberOne) || !isNumeric(numberTwo))
			throw new Exception();
		return returnToDouble(numberOne) + returnToDouble(numberTwo);
	}
	
	private Double returnToDouble(String strNumber) {
		strNumber = strNumber.replaceAll(",", ".");
		if (isNumeric(strNumber)) return Double.parseDouble(strNumber);
        return 0D;
	}

	private boolean isNumeric(String strNumber) {
		if(strNumber == null) return false;
		strNumber = strNumber.replaceAll(",", ".");
		return strNumber.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
}