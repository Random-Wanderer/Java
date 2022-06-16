// import java.util.Queue;
// import java.util.LinkedList;
// import java.util.Stack;
import java.util.HashMap;
import java.util.HashSet;

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
  /*
  public static void main(String[] args) {
    Pizza one = new Pizza();
    Pizza two = new Pizza();
    System.out.println(one == two);
    System.out.println(one.equals(two));
  }
  */
  /*
  public class Checkout {
    public static void main(String[] args) {
      Queue<Person> queue = new Linkedlist<Person>();
      queue.offer(new Person());
      // check beginning
      queue.peek();

      System.out.println(queue.poll());
      System.out.println(queue.size());
    }
  } */

  /*
  public static void main(String[] args) {

    Stack<Card> stack = new Stack<Card>();
    stack.push(new Card("Ace"));
    stack.push(new Card("10"));
    stack.push(new Card("Queen"));

    System.out.println(stack.pop().value);
    System.out.println(stack.pop().value);
    System.out.println(stack.pop().value);
  } */

  /*
  public static void main(String[] args) {
    HashMap<String,Citizen> citizens = new HashMap<String, Citizen>();
    citizens.put("123", new Citizen("Al"));
    citizens.put("456", new Citizen("Brad"));

    System.out.print(citizens.get("123").name);
    citizens.containsKey("123");
    citizens.containsValue(new Citizen("Chris"));

  }*/

  /*
  //Hashset
  public static void main(String[] args) {
    HashSet<Friends> friends = new HashSet<Friends>();
    friends.add(new Friends("Luppin", 30));
    friends.add(new Friends("Zelda", 25));

    System.out.println(friends);
  }*/



}


/*
class Friends {
  String name;
  int age;
  Friends(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return name + " " + age;
  }
}

class Citizen {
  String name;
  Citizen(String name) {
    this.name = name;
  }
}

class Card {
  String value;
  public Card(String value) {
    this.value = value;
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
