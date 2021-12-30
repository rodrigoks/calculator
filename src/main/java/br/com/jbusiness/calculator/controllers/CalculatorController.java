package br.com.jbusiness.calculator.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.jbusiness.calculator.converters.NumberConverter;
import br.com.jbusiness.calculator.exceptions.UnsuportedMathException;
import br.com.jbusiness.calculator.operations.MathOperations;

@RestController
public class CalculatorController {
	
	MathOperations oper = new MathOperations();

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws UnsuportedMathException {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
			throw new UnsuportedMathException("Please set a numeric value");
		return oper.sum(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws UnsuportedMathException {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
			throw new UnsuportedMathException("Please set a numeric value");
		return oper.sub(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mult(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws UnsuportedMathException {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
			throw new UnsuportedMathException("Please set a numeric value");
		return oper.mult(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double div(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws UnsuportedMathException {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
			throw new UnsuportedMathException("Please set a numeric value");
		return oper.div(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/med/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double med(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws UnsuportedMathException {
		if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo))
			throw new UnsuportedMathException("Please set a numeric value");
		return oper.med(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "/square/{number}", method = RequestMethod.GET)
	public Double square(@PathVariable("number") String number) throws UnsuportedMathException {
		if(!NumberConverter.isNumeric(number))
			throw new UnsuportedMathException("Please set a numeric value");
		return oper.square(number);
	}
	
}