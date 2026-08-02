// A sample program to insert an element in a set of array elements
import java.util.*;
class insert {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int i;
    int n;
    int ele;
    int pos;
    int arr[] = new int[50];
    
    System.out.println("Enter number of array elements: ");
    n = sc.nextInt();
    
    System.out.println("Enter the array elements:-");
    for(i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    
    System.out.println("Enter element to be inserted: ");
    ele = sc.nextInt();
    
    System.out.println("Enter position of insertion: ");
    pos = sc.nextInt();
    
    for(i = n - 1; i >= pos; i--) {
      arr[i + 1] = arr[i];
    }

    //Inserting element in the defined position
    arr[pos] = ele;
    n++;
    System.out.println("Array elements after insertion:-");
    for(i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
    sc.close();
  }
}
