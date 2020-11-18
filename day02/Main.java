package day02;

import java.util.Scanner;

import day02.BMI;
import day02.GradeBook;

public class Main {
	public static void main(String[] args) {
		final int SUBJECT_SIZE = 3;
		Scanner scanner = new Scanner(System.in);
		BMI bmi = new BMI();
		GradeBook gradebook = new GradeBook();
		
		
		System.out.print("번호: ");
		int id = scanner.nextInt();
		gradebook.setId(id);
		
		System.out.print("이름: ");
		String name = scanner.next();
		gradebook.setName(name);
		
	    System.out.print("국어: ");
	    int korean = scanner.nextInt();
	    gradebook.setKorean(korean);
	        
	    System.out.print("영어: ");
	    int english = scanner.nextInt();
	    gradebook.setEnglish(english);
	    
	    System.out.print("수학: ");
	    int math = scanner.nextInt();
	    gradebook.setMath(math);
	    
	    int sum = korean + english + math;
	    double average = sum / (double)SUBJECT_SIZE;
	    
	    System.out.printf("번호: %d번 이름: %s\n", gradebook.getId(), gradebook.getName());
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", gradebook.getKorean(), gradebook.getEnglish(), gradebook.getMath());
        System.out.printf("총점: %03d점 평균: %.2f점\n", sum, average);
        
        
        
        System.out.print("몸무게: ");
        double weight = scanner.nextDouble();
        bmi.setWeight(weight);
        
        System.out.print("키: ");
        double height = scanner.nextDouble();
        bmi.setHeight(height);
        
        System.out.println("bmi 수치는: "+(bmi.getWeight()/bmi.getHeight()/bmi.getHeight())
        		+"%입니다.");
    
		
	}
}
