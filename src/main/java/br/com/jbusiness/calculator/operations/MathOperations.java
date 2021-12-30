package br.com.jbusiness.calculator.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jbusiness.calculator.converters.NumberConverter;

@Service
public class MathOperations {
	
	@Autowired
	NumberConverter converter;

	public Double sum(String firstNumber, String secondeNumber) {
		return converter.returnToDouble(firstNumber) + converter.returnToDouble(secondeNumber); 
	}
	
	public Double sub(String firstNumber, String secondeNumber) {
		return converter.returnToDouble(firstNumber) - converter.returnToDouble(secondeNumber); 
	}
	
	public Double mult(String firstNumber, String secondeNumber) {
		return converter.returnToDouble(firstNumber) * converter.returnToDouble(secondeNumber); 
	}
	
	public Double div(String firstNumber, String secondeNumber) {
		return converter.returnToDouble(firstNumber) / converter.returnToDouble(secondeNumber); 
	}
	
	public Double med(String firstNumber, String secondeNumber) {
		return (converter.returnToDouble(firstNumber) * converter.returnToDouble(secondeNumber)) / 2; 
	}
	
	public Double square(String number) {
		return Math.sqrt(converter.returnToDouble(number));
	}
	
}
