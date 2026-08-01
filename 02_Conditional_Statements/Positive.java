// A program to display the square and cube of a positive number
import java.util.*;
public class Positive {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n, sq, cb;
    System.out.println("Enter a number: ");
    n = sc.nextInt();
    if(n < 0){
      System.out.println("It is a negative number.");
      System.out.println("The program terminates.");
      System.exit(0);
    }
    sq = n * n;
    cb = n * n * n;
    System.out.println("Square of number = " + sq);
    System.out.println("Cube of number = " + cb);
  }
}
