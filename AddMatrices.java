/*
Class:      CSE 1321 Lab
Section:    10
Term:       Fall 2018
Instructor: Kristin Hegna
Name:       Amanda Doige
Lab 13:     Multi-Dimensional Arrays (Exercise 3)

**/

import java.util.*; 

public class AddMatrices {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in); 
   
      System.out.println("Enter 9 integer for the first array: ");
   
      int [][] matrixA = new int [3][3]; 
      int [][] matrixB = new int [3][3]; 
   
      // READ user-input for MatrixA (first) array
      for (int i = 0; i < matrixA.length; i++) {
         for (int j = 0; j < matrixA[i].length; j++) {
            matrixA[i][j] = input.nextInt();
         }
      }
      
      System.out.println("Enter 9 integer for the second array: ");
   
   // READ user-input for MatrixB (second) array
      for (int i = 0; i < matrixB.length; i++) {
         for (int j = 0; j < matrixB[i].length; j++) {
            matrixB[i][j] = input.nextInt();
         }
      }
   // Print MatrixA array 
      System.out.println("Matrix A: ");
      for (int i = 0; i < matrixA.length; i++) {
         for (int j = 0; j < matrixA[i].length; j++) {
            System.out.print("\t" + "" + matrixA[i][j]);
         }
         System.out.println();
      }
   
      System.out.println();
      // Print MatrixB array
      System.out.println("Matrix B: ");
      for (int row = 0; row < matrixB.length; row++) {
         for (int column = 0; column < matrixB[row].length; column++) {
            System.out.print("\t" + "" + matrixB[row][column]);
         }
         System.out.println();
      }
      System.out.println();
      
      System.out.println("Matrix A + B: ");
      
      // Call Addition Method
      int [][] result = Addition(matrixA, matrixB);
      
      for (int i = 0; i < matrixA.length; i++) {
         for (int j = 0; j < matrixA[i].length; j++) {
            System.out.print("\t" + "" + result[i][j]);
         } 
         System.out.println();
      }
      
   } // END main METHOD

   public static int [][] Addition(int [][] matrixA, int [][] matrixB) {
   
      int [][] sumTotal = new int [3][3];
      
      for (int i = 0; i < sumTotal.length; i++) {
         for (int j = 0; j < sumTotal[i].length; j++) {
            sumTotal[i][j] = (matrixA[i][j] + matrixB[i][j]); 
         }
      }
      
      return sumTotal; 
   
   } // END Addition METHOD

} // END class AddMatrices