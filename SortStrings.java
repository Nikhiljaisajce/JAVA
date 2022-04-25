import java.util.*;
public class SortStrings {
 public static void main(String[] args){
 String names[] = { 
"Amal","Vishnu","Manu","kevin","Bibin"};
 System.out.println("The names' order before sorting : ");
 for (int i = 0; i < names.length; i++)
 System.out.println(names[i]);
 Arrays.sort(names);
 System.out.println("\nThe names in alphabetical order : ");
 for (int i = 0; i < names.length; i++)
 System.out.println(names[i]);
 }
}
