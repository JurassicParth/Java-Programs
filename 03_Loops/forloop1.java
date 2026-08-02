// A sample program to display "Hello World" n number of times where n is taken as an input from the user.
import java.util.*;
public class forloop1 {
  public static void main(String args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter value for n: ");
    n = sc.nextInt();
    
    for(int counter = 0; counter < n; counter++) {
      System.out.println("Hello World!");
    }
    sc.close();
  }
}
