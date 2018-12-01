import java.util.*; 

public class WeeklyHours {

   public static int BinarySearch(int [] hours, int target) {
      
      int low = 0;
      int high = hours.length; 
      int mid = 0; 
      boolean find = false; 
      
      while (!find) { 
         mid = (low + high) /2; 
         if (target == hours[mid]) {
            return mid; 
         } 
         else if (target < hours[mid]) {
            high = mid; 
         }
         else
            low = mid;
         if (low > high-1 || high < low+1) 
            break;  
      } // END while
      return -1; 
   
   } // END BinarySearch METHOD
   
   public static void BubbleSort(int [] hours, String[] days) {
   
      //int [] bubble = new int [hours.length];
     
      for (int i = 0; i < hours.length; i++) {
         for (int j = i+1; j < hours.length; j++) { 
            if (hours[j] < hours[i]) {
               int temp = hours[j]; 
               hours[j] = hours[i];
               hours[i] = temp;
               String temp1 = days[j]; 
               days[j] = days[i];
               days[i] = temp1;
               
            } // ENDIF
         } // END inner FOR
      } // END outer FOR
      
   } // END BubbleSort METHOD

   public static int [] addHours(int [][] hours) {
       
      int [] weeklyHours = new int [hours[0].length];   
       
      for (int i = 0; i < hours.length; i++) {
         for (int j = 0; j < hours[i].length; j++) { 
            weeklyHours[i] += hours[i][j];
         }
      }
      
      return weeklyHours;
    
   } // END METHOD addHours
   
   public static int [] maxHours(int [][] array) {
   
      int [] maxHours = new int [2];
      int max = array[0][0];
      
      for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < 7; j++) {
            if (array[i][j] > max) {
               max = array[i][j];
               maxHours[0] = i; 
               maxHours[1] = j;  
            }  
         }
      }
      
      return maxHours;
   }

   public static void main(String[] args) {
      
      Random rand = new Random();
      
      // Create a 2D array
      int [][] hours = new int [3][7];
      String [] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
      int target = 0; 
      
      System.out.println("Employees Data: ");
      System.out.print("\t\t\t");
      for (int d = 0; d < days.length; d++) {
         System.out.print("\t" + days[d]);
      }
      System.out.println();
   
      // Initialize 2D array with random integers (hours) and print
      for (int i = 0; i < hours.length; i++) {
         System.out.print("Employee" + (i+1));
         for (int j = 0; j < hours[i].length; j++) {
            hours[i][j] = rand.nextInt(10);
            System.out.print("\t " + hours[i][j] + "\t");
         }
         System.out.println(); 
      }
      System.out.println();
      int max = 0; 
      for (int i = 0; i < hours.length; i++) { 
         for (int d = 0; d < hours[i].length; d++) { 
            BubbleSort(hours[i], days);
            BinarySearch(hours[i], target);
            
         }
         
         //System.out.println(Arrays.toString(days));
         //System.out.println(Arrays.toString(hours[i]));
         maxHours(hours);
         System.out.println("Employee" + (i+1) + " worked most hours on " + days[i]);
      }  
      
      System.out.println();
      System.out.println("Employee#" + "\tWeekly Hours");
      System.out.println("----------------------------");
    
      int [] weeklyHours = new int [hours[0].length];
      
      // Call addHours Method
      
      weeklyHours = addHours(hours); 
      
      for (int i = 0; i < hours.length; i++) {
         System.out.print("Employee" + (i+1));
         for (int j = 0; j < hours[i].length; j++) { 
             
         }
         System.out.println("\t\t  " + weeklyHours[i] + " ");
      }
      System.out.println();
       
   } // END METHOD Main

} // END CLASS
