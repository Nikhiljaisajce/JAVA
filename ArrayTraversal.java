public class ArrayTraversal {
   public static void main(String args[]) {
      //Creating an array
      int myArray[] = new int[7];
      //Populating the array
      myArray[0] = 12;
      myArray[1] = 14;
      myArray[2] = 56;
      myArray[3] = 14;
      myArray[4] = 45;
      myArray[5] = 54;
      myArray[6] = 75;
      //Printing Contents using for loop
      System.out.println("Contents of the array: ");
      for(int i=0; i<myArray.length; i++) {
         System.out.println(myArray[i]);
      }
   }
}