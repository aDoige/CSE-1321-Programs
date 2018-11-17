/*
Class:      CSE 1321 Lab
Section:    10
Term:       Fall 2018
Instructor: Kristin Hegna
Name:       Amanda Doige
Lab 13:     Multi-Dimensional Arrays (Exercise 2)

**/

import java.util.*; 

public class LocateLargestElement {

   public static void main(String[] args) {
     
      Scanner input = new Scanner(System.in);
      int [][] matrix = new int [3][4]; // Create 2D array with 3 rows and 4 columns
      
      System.out.println("Enter 12 integers: ");
      
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
         } // END
         System.out.println();    
      } // END
      
      // Call locateLarges Method
      int[] result = locateLargest(matrix);
     
      System.out.println("First largest value is at row " + result[0] + " and column " + result[1] + ".");
   } // END main METHOD
         
   public static int [] locateLargest(int [][] matrix) {
   
      int [] largestValue = new int [2];
      int max = matrix[0][0];
      
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] > max) {
               max = matrix[i][j];
               largestValue[0] = i; 
               largestValue[1] = j;  
            }  
         }
      }
      return largestValue;
   }

} // END class LocateLargestElement