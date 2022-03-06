
import java.io.*;

public class Addition {
 public static void main(String[] args) throws Exception {
  int a, b;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the two numbers to add:");
  a = Integer.parseInt(br.readLine());
  b = Integer.parseInt(br.readLine());
  
  System.out.println("\nSum of two numbers:" +(a+b));
 }
}