package day04;

import java.util.Scanner;

import day04.Calculator;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
	   
		System.out.println("숫자를 입력하세요");
		int number1 = scanner.nextInt();
		calculator.setNumber1(number1);
		
		int number2 = scanner.nextInt();
		calculator.setNumber2(number2);
		
		int sum = number1 + number2;
	    System.out.println("add(number1, number2): "+sum);
	    System.out.println("subtract(number1, number2): "+(calculator.getNumber1()-calculator.getNumber2()));
	    System.out.println("multiply(number1, number2): "+(calculator.getNumber1()*calculator.getNumber2()));
	    System.out.println("divide(number1, number2): "+(calculator.getNumber1()/calculator.getNumber2()));
		
	    
		String operator = scanner.next();
		calculator.setOperator(operator);
		
	}
	

}
