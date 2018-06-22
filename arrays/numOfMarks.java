/**
 * Write a program called Marks, which prompts user for the number of marks,
 * reads it from the keyboard, and saves it in an int variable called "numOfMarks".
 * It then prompts user for the marks and saves them 
 * in an int array called "marks".  
 * Your program shall check that the marks is between 0 and 100.
 * The number of marks is between 1 to 30
 * The program should display number of marks that are more than 50.
 *
 * An example of output is shown below:-
 * 
 * Enter the number of marks: 2
 * Enter the marks 1: 112
 * Invalid marks, try again...
 * Enter marks 1: 49
 * Enter marks 2: 60
 * Number of marks more than 50 is 1
 * 
 */package javaexercises.arrays;

import java.util.Scanner;


public class Marks {
    
    private final int LOWEST_MARKS  = 0;
    private final int HIGHEST_MARKS = 100;
    
    // numOfMarks
    private int[] marks;
    
    private Scanner in;
    
    /**
     * Enter program's point.
     * 
     * @param args 
     */
    public static void main(String[] args)
    {
        Marks aMarks = new Marks();
        aMarks.in = new Scanner(System.in);

        System.out.print("Enter the number of number of marks: ");
        int numOfMarks = aMarks.in.nextInt();
                
        aMarks.run(numOfMarks);
    }
        
    /**
     * Run program.
     * 
     * @param numOfMarks 
     */
    private void run(int numOfMarks)
    {
        if (numOfMarks <= 0) {
            System.out.println("Invalid marks.. try again..");
            return;
        }        
        marks = new int[numOfMarks];
        
        double sum = 0;
        int    i   = 0;
        while (i < nummarks)
        {
            System.out.printf("Enter the number of marks %1$d: ", (i+1));
            int marks = in.nextInt();
            
            // check if marks is between 0 and 100
            if ((marks >= LOWEST_MARKS) && (marks <= HIGHEST_MARKS)) {
                marks[i] = mark;
                sum     += mark;
                i++;
                continue;
            }
            System.out.println("Invalid marks, try again...");
        }
        System.out.printf("Number of marks more than 50 is %1$.2f\n", (sum / numOfMarks));
    } 
 }
