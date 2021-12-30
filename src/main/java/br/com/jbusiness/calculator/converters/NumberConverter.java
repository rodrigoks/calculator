package br.com.jbusiness.calculator.converters;

import org.springframework.stereotype.Service;

@Service
public class NumberConverter {

	public Double returnToDouble(String strNumber) {
		strNumber = strNumber.replaceAll(",", ".");
		if (isNumeric(strNumber)) return Double.parseDouble(strNumber);
        return 0D;
	}

	public boolean isNumeric(String strNumber) {
		if(strNumber == null) return false;
		strNumber = strNumber.replaceAll(",", ".");
		return strNumber.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
}
