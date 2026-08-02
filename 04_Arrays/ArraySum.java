public class ArraySum {
  public static void main(String args[]) {
    int i, sum;
    sum = 0;
    int m[] = {2, 3, 4, 5, 6};
    for(i = 0; i < 5; i++) {
      sum = sum + m[i];
    }
    System.out.println("The sum of the array elements = "+sum);
  }
}
