// A sample program to create different objects through methods
class Mango {
    public void Season() {
      System.out.println("Mango is the king of fruits");
      System.out.println("It is available during Summer season");
    }
}

class Apple {
  public void Season() {
    System.out.println("Apples are produced in Kashmir");
    System.out.println("They are available during Winter season");
  }
}

class Grape {
  public void Season() {
    System.out.println("Grapes are produced in Maharashtra");
    System.out.println("They are available during Winter season");
  }
}

public class Sample_fruits {
  public static void main(String[] args) {
    Mango Fruit1 = new Mango();
    Apple Fruit2 = new Apple();
    Grape Fruit3 = new Grape();
    
    Fruit1.Season();
    System.out.println();
    Fruit2.Season();
    System.out.println();
    Fruit3.Season();
  }
}
