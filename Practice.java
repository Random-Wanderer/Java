// Class
public class Practice {
  // variable
  int num = 3;
  /*
  //Method
  public static void main(String[] args) {
    System.out.print("Hello");
  }
  // arrays
  int[] arr = new int[5];
  String[] words = {"avhp", "sdaf"};
  */
  /*
  public static void main(String[] args) {
    // 1st
    Pizza pizza = new Pizza();
    pizza.slices = 8;
    // 2nd
    Pizza pie = new Pizza(6);
    pizza.eat();
    // output
    System.out.println(pizza.slices);
    System.out.println(pie.slices);
  }
  */

  public static void main(String[] args) {
    Practice example = new Practice();
    int returned = example.go();
    int value = Practice.go(5);

    System.out.println(returned);
    System.out.println(value);
  }

  public int go() {
    return 1;
  }

  public static int go(int x) {
    return x;
  }
}

/*
class Pizza {
  int slices;
  String topping;
  Pizza() {}
  Pizza(int pieces){
    slices = pieces;
  }

  public void eat() {
    slices = slices -1;
  }

}
*/
