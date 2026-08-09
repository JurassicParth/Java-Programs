// A sample Program to illustrate various string Manipulations in Java
public class Manipulation {
  public static void main(String args[]){
    String a = "akash";
    String b = "conputer";
    String c = "  easy understanding  ";
    String d1 = "Information Technology";
    String d2 = "Information Technology";
    String e = "kumar";
    System.out.println("Upper-Case of akash = "+a.toUpperCase());
    System.out.println("\nAfter replacing \'n\' with \'m\' = "+b.replace('n', 'm'));
    System.out.println("\nString after removing blank spaces = "+c.trim());
    System.out.println("\nTwo equal strings = "+d1.equals(d2));
    System.out.println("\nLength of the string \'kumar\' = "+e.length());
    System.out.println("\nCharacter at 5th position = "+a.concat(e));
  }
}
