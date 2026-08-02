// To find the sum of array elements
public class ArraySum2 {
  public static void main(int m[]) {
    int i, p, sum = 0;
    p = m.length;
    for(i = 0; i < p; i++) {
      sum = sum + m[i];
    }
    System.out.println("The sum of array elements = "+sum);
  }
}
