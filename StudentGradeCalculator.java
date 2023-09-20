package Aarti;
import java.util.Scanner;
public class StudentGradeCalculator 
{

	public static void main(String args []) 
	{
		
		        Scanner sc = new Scanner(System.in);
	        
		        System.out.println("Enter the number of subjects: ");
		        int num_Subjects = sc.nextInt();

		        int total_Marks = 0;
		        int[] sub_Marks = new int[num_Subjects];

		        for (int i = 0; i < num_Subjects; i++) {
		            System.out.println("Enter marks obtained in Subject " + (i + 1) + ": ");
		            sub_Marks[i] = sc.nextInt();
		            total_Marks += sub_Marks[i];
		        }

		        float avg_Percentage = (float) total_Marks / (num_Subjects * 100) * 100;

		        String grade = calculateGrade(avg_Percentage);

		        System.out.println("Total Marks: " + total_Marks);
		        System.out.println("Average Percentage: " + avg_Percentage + "%");
		        System.out.println("Grade: " + grade);

		        sc.close();
		    }

		    public static String calculateGrade(float avg_Percentage) {
		        if (avg_Percentage >= 90) {
		            System.out.println("You Passed With Distinction...");
		        	return "A+";
		        } 
		        else if (avg_Percentage >= 80) {
		        	System.out.println("You are passed with First Class...");
		            return "A";
		        } 
		        else if (avg_Percentage >= 70) {
		        	System.out.println("You are passed with Second Class....");
		            return "B";
		        } 
		        else if (avg_Percentage >= 60) {
		        	System.out.println("You are passed with Third Class...");
		            return "C";
		        } 
		        else if (avg_Percentage >= 50) {
		        	System.out.println("You are Passed...");
		            return "D";
		        } 
		        else {
		        	System.out.println("You are failed...");
		            return "F";
		        }
		    }
		}
