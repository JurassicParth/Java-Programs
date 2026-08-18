
// A sample program to delete an element from a set array elements
import java.util.*;

class delete {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int i, n, pos;
    int arr[] = new int[50];
    System.out.println("Enter number of array elements: ");
    n = sc.nextInt();
    System.out.println("Enter array elements: ");
    for (i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter position of element to be deleted: ");
    pos = sc.nextInt();
    for (i = pos + 1; i < n; i++) {
      arr[i - 1] = arr[i];
    }
    n--;
    System.out.println("Array elements after deletion:-");
    for (i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
    sc.close();
  }
}
