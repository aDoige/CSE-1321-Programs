import java.util.*; 

public class LinearBinarySearch {
   public static int linearSteps = 0; 
   public static int binarySteps = 0; 
 
   // Linear Search
   public static boolean LinearSearch(int [] array, int target) {
      
      for (int temp : array) {
         linearSteps++;
         if (temp == target) {
            return true; 
         } 
      }
      return false; 
        
   } // END LinearSearch METHOD
   
   public static boolean BinarySearch(int [] array, int target) {
      
      int low = 0;
      int high = array.length; 
      int mid = 0; 
      boolean find = false; 
      
      while (!find) {
         binarySteps++; 
         mid = (low + high) /2; 
         if (target == array[mid]) {
            return true; 
         } 
         else if (target < array[mid]) {
            high = mid; 
         }
         else
            low = mid;
         if (low > high-1 || high < low+1) 
            return false;  
      } // END while
      return true; 
   
   } // END BinarySearch METHOD
   
   public static void BubbleSort(int [] array) {
   
      int [] bubble = new int [array.length];
     
      for (int i = 1; i < array.length; i++) {
         for (int j = i+1; j < array.length; j++) { 
            if (array[j] < array[i]) {
               int temp = array[j]; 
               array[j] = array[i];
               array[i] = temp;
               
            } // ENDIF
         } // END inner FOR
      } // END outer FOR
      
   } // END BubbleSort METHOD
   
   public static void main(String[] args) {
   
      int [] array = new int [10]; 
      Scanner input = new Scanner(System.in);
       
      System.out.println("Enter 10 integers: ");
      for (int i = 0; i < array.length; i++) {
         array[i] = input.nextInt();
      }
      System.out.println("Enter target value: ");
      int target = input.nextInt();
      
      System.out.println("Array Values: " + Arrays.toString(array));
      System.out.println("Target value: " + target);
      System.out.println(); 
      //BubbleSort(array);
      LinearSearch(array, target);
      BinarySearch(array, target);
      System.out.println("Linear Search Comparisons: " + linearSteps);
      System.out.println("Binary Search Comparisons: " + binarySteps);
   
   } // END Main METHOD

} // END LinearBinarySearch CLASS