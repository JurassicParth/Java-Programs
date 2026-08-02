// To find the difference between Compound Interest and Simple Interest
public class Difference {
  public static void main(int p, int r, int t) {
    double si, ci = 0, amt, diff = 0;
    si = p * t * r / 100.0;
    amt = p * (Math.pow(1 + r / 100.0, t));
    ci = amt - p;
    diff = ci - si;
    System.out.println("The Compound Interest = ₹"+(float)ci);
  }
}
