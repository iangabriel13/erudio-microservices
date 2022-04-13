package br.com.erudio.math;

import org.springframework.stereotype.Service;

@Service
public class SimpleMath {

	public Double sum(Double numberOne, Double numberTwo) throws Exception {
		return numberOne + numberTwo;
	}

	public Double sub(Double numberOne, Double numberTwo) throws Exception {
		return numberOne - numberTwo;
	}

	public Double mult(Double numberOne, Double numberTwo) throws Exception {
		return numberOne * numberTwo;
	}

	public Double div(Double numberOne, Double numberTwo) throws Exception {
		return numberOne / numberTwo;
	}

	public Double med(Double numberOne, Double numberTwo) throws Exception {
		return (numberOne + numberTwo) / 2;
	}

	public Double raiz(Double numberOne) throws Exception {
		return (Double) Math.sqrt(numberOne);
	}

}
