/* Now design and implement a test program to create a default radio 
object and test all class methods on the object in random order. 
Print the object after each method call and use meaningful label for
each method call. 

Class:         CSE 1321 Lab
Section:       10
Term:          Fall 2018
Instructor:    Kristin Hegna
Name:          Amanda Doige
Lab 11:        Classes (Exercise 2, Test Radio Program)

**/

import java.util.*; 

public class TestRadio {
   public static void main(String[] args) {
   
      Radio myRadio = new Radio();
      System.out.println();
      System.out.println("Turn radio on: \n\t" + myRadio.toString());
      
      System.out.println();
      System.out.println("Turn volume up by 3:");
      myRadio.getVolume(4);
      System.out.println("\t" + myRadio.toString());
      
      System.out.println();
      System.out.println("Move station up by 5:"); 
      myRadio.getStation(6);
      myRadio.getVolume(4);
      System.out.println("\t" + myRadio.toString());
      
      System.out.println();
      System.out.println("Turn volume down by 1:");
      myRadio.getVolume(3);
      System.out.println("\t" + myRadio.toString());
      
      System.out.println();
      System.out.println("Move station up by 3:");
      myRadio.getStation(9);
      System.out.println("\t" + myRadio.toString()); 
      
      System.out.println();
      System.out.println("Turn radio off.");
      myRadio.turnOff();
      
      System.out.println();
      System.out.println("Turn volume up by 2:");
      System.out.print("\t"); 
      myRadio.volumeUp();
      
      System.out.println();
      System.out.println("Turn station down by 2:");
      System.out.print("\t");
      myRadio.volumeDown();
      
   } // END Main METHOD


} // END Program