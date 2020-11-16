package day01;

import java.util.Scanner;
import day01.Operator;
import day01.Naming;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Operator operator = new Operator();
		Naming naming = new Naming();
		

		System.out.println("myNumber1의 값을 입력하세요.");
		int myNumber1 = scanner.nextInt();
		operator.setMyNumber1(myNumber1);
		System.out.println("myNumber2의 값을 입력하세요.");
		int myNumber2 = scanner.nextInt();
		operator.setMyNumber2(myNumber2);

		System.out.println(operator.getMyNumber1()+operator.getMyNumber2()+": "+
				(operator.getMyNumber1()+operator.getMyNumber2()));
		System.out.println(operator.getMyNumber1()-operator.getMyNumber2()+": "+
				(operator.getMyNumber1()-operator.getMyNumber2()));
		System.out.println(operator.getMyNumber1()*operator.getMyNumber2()+": "+
				(operator.getMyNumber1()*operator.getMyNumber2()));
		System.out.println(operator.getMyNumber1()/operator.getMyNumber2()+": "+
				(operator.getMyNumber1()/operator.getMyNumber2()));
		
		
	
        
        
		
	}
}
