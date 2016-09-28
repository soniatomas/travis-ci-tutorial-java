package io.github.joaomlneto.travis_ci_tutorial_java;

public class CalculatorDriver {

	public static void main(String[] args) {
		SimpleCalculator calc = new SimpleCalculator();
		System.out.println(calc.mul(calc.mul(calc.mul(calc.mul(10,3),7), 13), 37));
	
	}

}
