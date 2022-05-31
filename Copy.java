import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.io.File;
public class Copy {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter the source File Name");
String source=scan.nextLine();
try {
FileReader fr=new FileReader(source);
String str = "";
int i;
System.out.println("Reading from file "+source);
while ((i = fr.read()) != -1) {
str += (char) i;
}
System.out.println(str);
System.out.println("\n Enter the filename to copy");
String destination=scan.nextLine();
File file=new File(destination);
FileWriter fw = new FileWriter(file);
fw.write(str);
fr.close();
fw.close();
System.out.println("Copied from "+source+" to "+destination+ " Successfully..!");
}
 catch (Exception e) {
System.out.println("Exception Occured");
}
}

}
