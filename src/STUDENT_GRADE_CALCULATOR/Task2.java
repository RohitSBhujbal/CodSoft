package STUDENT_GRADE_CALCULATOR;

import java.util.Scanner;
public class Task2 {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Step 1: Take marks obtained in each subject
	        System.out.println("Enter marks obtained (out of 100) for the following subjects:");
	        String[] subjects = {"Java", "SQL", "Hibernate", "Spring", "ReactJS"};
	        int numberOfSubjects = subjects.length;
	        int[] subjectMarks = new int[numberOfSubjects];

	        for (int i = 0; i < numberOfSubjects; i++) {
	            System.out.print("Enter marks for " + subjects[i] + ": ");
	            subjectMarks[i] = scanner.nextInt();
	        }

	        // Step 2: Calculate Total Marks
	        int totalMarks = calculateTotalMarks(subjectMarks);

	        // Step 3: Calculate Average Percentage
	        double averagePercentage = calculateAveragePercentage(totalMarks, numberOfSubjects);

	        // Step 4: Grade Calculation
	        char grade = calculateGrade(averagePercentage);

	        // Step 5: Display Results
	        displayResults(totalMarks, averagePercentage, grade);

	        scanner.close();
	    }

	
	     // Calculates the total marks obtained in all subjects.
	    private static int calculateTotalMarks(int[] marks) {
	        int total = 0;
	        for (int mark : marks) {
	            total += mark;
	        }
	        return total;
	    }

	    // Calculates the average percentage.

	    private static double calculateAveragePercentage(int totalMarks, int numberOfSubjects) {
	        return (double) totalMarks / numberOfSubjects;
	    }


	    private static char calculateGrade(double averagePercentage) {
	        if (averagePercentage >= 90) {
	            return 'A';
	        } else if (averagePercentage >= 80) {
	            return 'B';
	        } else if (averagePercentage >= 70) {
	            return 'C';
	        } else if (averagePercentage >= 60) {
	            return 'D';
	        } else {
	            return 'F';
	        }
	    }

	    private static void displayResults(int totalMarks, double averagePercentage, char grade) {
	        System.out.println("\nResults:");
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Average Percentage: " + averagePercentage + "%");
	        System.out.println("Grade: " + grade);
	    }
	}

