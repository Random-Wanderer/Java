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
  /*
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
  } */

  /*
  public static void main(String[] args) {
    // obj of method class
    Practice example = new Practice();
    int returned = example.go();
    int value = Practice.go(5);
  }

  // method
  public int go() {
    return 5;
  }

  // method overload
  public static int go(int x) {
    return x;
  }
  */

  public static void main(String[] args) {
    Pizza one = new Pizza();
    Pizza two = new Pizza();
    System.out.println(one == two);
    System.out.println(one.equals(two));
  }

}

class Pizza {
  int size = 0;
  int slices = null;;
  String topping;
  Pizza() {};
  Pizza(int pieces){
    slices = pieces;

    public boolean Practice(Object o) {
      Pizza other = (Pizza) o;
      if(this.size == other.size) {
        if(this.topping == other.topping) {
          return true;
        }
      }
      return false;
    }

  }

  public void eat() {
    slices = slices -1;
  }

}


/*
public class Person{

  private int age;

  public void setAge(int val) {
    age = val;
  }

  public int getAge() {
    return age;
  }
}

class house {
  public void tenant() {
    Person person = new Person();
    person.setAge(1);
  }
}
*/
