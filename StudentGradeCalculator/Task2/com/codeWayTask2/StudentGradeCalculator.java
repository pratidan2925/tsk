package com.codeWayTask2;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------STUDENT GRADE CALCULATOR----------------");
		
		System.out.println("Enter the number of the subjects");
		int number = sc.nextInt();
		System.out.println("Enter the marks of the all subjects");
		
		int [] marks = new int[number];
		for (int i = 0; i < number ; i++) {
			 marks[i]= sc.nextInt();
			
			}
		
		int totalMarks = calculateTotalMarks(marks);
		double averagePer = calculateAvgPer(totalMarks ,number);
	
		char grade = calculateGrade(averagePer);
		
		System.out.println("============RESULT==================");
		System.out.println("Total marks obtained : " + totalMarks);
		System.out.println("Average Percentage : "+ averagePer + "%");
		System.out.println("Grade : " + grade);
		
		sc.close();

	}

	
	private static int calculateTotalMarks(int[] marks) {
		int totalMarks =0;
		for (int mark : marks) {
			totalMarks += mark ;
		}
		
		return totalMarks; 
	}
	
	
	private static double calculateAvgPer(int totalMarks ,int number) {
		return (double) totalMarks / number ;
		
	}
	
	private static char calculateGrade(double averagePer) {
		if (averagePer >= 90) {
            return 'A';
        } else if (averagePer >= 80) {
            return 'B';
        } else if (averagePer >= 70) {
            return 'C';
        } else if (averagePer >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    
	}
}
