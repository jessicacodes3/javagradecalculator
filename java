// This Java application requests user input and prompts the user to enter student names and their scores and displays the student with the highest score.

import java.util.Scanner;

public class HighestScore {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
    
    int highestScore = 0;   // Student with the highest score
    String highestScoreName = ""; // Student's name with the highest score
    
    System.out.print("Enter the number of students: "); // Prompt the user to enter the number of students
    int numberOfStudents = input.nextInt();
   
   // Prompt the user to enter each student's name and score
    System.out.println("Enter each student’s name and score: ");
    for (int i = 0; i < numberOfStudents; i++) {
	
    System.out.print("Student: " + (i + 1) + "\n   Name: ");
        String name = input.next();		
        System.out.print("   Score: ");
	int score = input.nextInt();
    
    // Display the highest score
     if (score > highestScore){
	highestScore = score;
	highestScoreName = name;} }
      
      // Display name of student with highest score
	System.out.println("Student with the highest score: " + highestScoreName); 
  
  }
  }
