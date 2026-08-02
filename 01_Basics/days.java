// To convert days into years, months and days
public class days {
  public static void main(int a) {  // using function argument
    int b, y, m, d;
    y = a / 365;
    b = a % 365;
    m = b / 30;
    d = b % 30;
    System.out.println("The number of years = "+y);
    System.out.println("The number of months = "+m);
    System.out.println("The number of days = "+d);
  }
}
