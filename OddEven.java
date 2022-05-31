import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.io.File;
public class OddEven {
public static void main(String[] args) {
try {
FileReader fr = new FileReader("number.txt");
BufferedReader br = new BufferedReader(fr);
File file1 = new File("odd.txt");
FileWriter fw1 = new FileWriter(file1);
File file2 = new File("even.txt");
FileWriter fw2 = new FileWriter(file2);
String num;
while ((num = br.readLine()) != null) {
if (Integer.parseInt(num) % 2 == 0) {
fw2.write(num + "\n");
} 
else {
fw1.write(num + "\n");
}
}
fw1.close();
fw2.close();
} 
catch (Exception e) 
{
System.out.println("Error");
}
}
}
