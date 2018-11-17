
/*
Class:      CSE 1321 Lab
Section:    10
Term:       Fall 2018
Instructor: Kristin Hegna
Name:       Amanda Doige
Lab 13:     Multi-Dimensional Arrays (Exercise 1)

**/

import java.util.*; 
 
public class SumArrayColumns {
 
   public static int [] sumColumn(int [][] matrix) {
   
   // sumColumn Method to add columns in 2D array
      int [] sumColumn = new int [matrix[0].length]; 
      for (int row = 0; row < matrix.length; row++) {
         for (int column = 0; column < matrix[row].length; column++) {
            sumColumn[column] += matrix[row][column];
         }
      }     
      return sumColumn;
   
   } // END sumColumns METHOD
 
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      int [][] matrix = new int [3][4]; // Create new 2D array with 3 rows and 4 columns
      
      System.out.println("Enter 12 numbers: ");
      
      // READ user-input for integers
      for (int row = 0; row < matrix.length; row++) {
         for (int column = 0; column < matrix[row].length; column++) {
            matrix[row][column] = input.nextInt();  
         }  
      }
      // Print Matrix array
      System.out.println("The entered matrix: ");
      for (int row = 0; row < matrix.length; row++) {
         for (int column = 0; column < matrix[row].length; column++) {
            System.out.print(" " + matrix[row][column]);
         } 
         System.out.println();
      }
      
      int [] sum = new int [matrix[0].length];
      // Call sumColumn Method
      sum = sumColumn(matrix);
      
      for (int i = 0; i < sum.length; i++) {
         System.out.println("Sum of column " + i + " is " + sum[i]); 
      }
       
   } // END METHOD Main

} // END class