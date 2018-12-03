/* Exercise 2: Design and implement class Radio to represent a 
radio object. The class defines the following attribues (varibles) 
and methods: 

Assume that the station and volume settings range from 1 to 10.

   1. A private variable of type int named station to represent a 
      station number. Set to 1.
   2. A private variable of type int named volume to represent the 
      volume setting. Set to 1.
   3. A private variable of type boolean named on to represent the 
      radio on or off. Set to false.
   4. A non-argument constructor method to create a default radio.
   5. Method getStation() that returns the station.
   6. Method getVolume() that returns the volume.
   7. Method turnOn() that turns the radio on.
   8. Method turnOff() that turns the radio off.
   9. Method stationUp() that increments the station by 1 only when 
      the radio is on.
   10. Method stationDown() that decrements the station by 1 only 
       when the radio is on.
   11. Method volumeUp() that increment the volume by 1 only when 
       the radio is on.
   12. Method volumeDown() that decrements the volume by 1 only 
       when the radio is on.
   13. Method toString()to printout a meaningful description of the 
       radio as follows(if the radio is on):


The radio station is X and the volume level is Y. 
Where X and Y are the values of variables station and volume.

If the radio is off, the message is: The radio is off. 

Class:         CSE 1321 Lab
Section:       10
Term:          Fall 2018
Instructor:    Kristin Hegna
Name:          Amanda Doige
Lab 11:        Classes (Exercise 2)

**/

public class Radio {

   private int station = 1; 
   private int volume = 1; 
   private boolean on = false; 

   public Radio() {
   
   } // END default constructor

   public int getStation(int station) {
      return this.station = station; 
   } // END getStation METHOD

   public int getVolume(int volume) {
      return this.volume = volume; 
   } // END getVolume METHOD

   public void turnOn() {
      if (on == true) {
         volume++;
         station++; 
      }
      else 
         System.out.println("The radio is off.");
   } // END turnOn METHOD

   public void turnOff() {
      if (on == false) {
         System.out.println("\tThe radio is off.");
      }
   
   } // END turnOff METHOD

   public void stationUp() {
   
      if (on == true && station >= 1 && station <= 10) {
         station++; 
      }
      else 
         System.out.println("The radio is off.");
   
   } // END stationUp METHOD

   public void stationDown() {
   
      if (on == true && station >= 1 && station <= 10) {
         station--; 
      }
      else 
         System.out.println("The radio is off.");
      
   } // END stationDown METHOD

   public void volumeUp() {
   
      if (on == true && volume >= 1 && volume <= 10) {
         volume++; 
      }
      else
         System.out.println("The radio is off."); 
    
   } // END volumeUp METHOD

   public void volumeDown() {
   
      if (on == true && volume >= 1 && volume <= 10) {
         volume--; 
      }
      else 
         System.out.println("The radio is off.");
   
   } // END volumeDown METHOD

   public String toString() {
      return "The radio station is " + station + " and the volume level is " + volume + "."; 
   
   } // END toString METHOD

} // END CLASS