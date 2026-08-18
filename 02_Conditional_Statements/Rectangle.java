
// To find the area and perimeter of a rectangle
import java.util.*;

public class Rectangle {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int l, b, p, ar;
    System.out.println("Enter length: ");
    l = sc.nextInt();
    System.out.println("Enter breadth: ");
    b = sc.nextInt();

    ar = l * b;
    p = 2 * (l + b);

    System.out.println("Area = " + ar);
    System.out.println("Perimeter = " + p);
    sc.close();
  }
}
