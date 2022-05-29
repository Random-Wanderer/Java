import java.util.Scanner;

import javax.swing.DebugGraphics;

public class first {
  /* Input's
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter name: ");
    String firstname = input.next();

    System.out.print("Enter age: ");
    String age = input.next();

    System.out.println("Your name is " + firstname + " and you are "+ age + "!");
  }
  */
  /* Println
  public static void main(String[] args) {
    System.out.println("I");
    System.out.println("Like");
    System.out.println("Ice cream!");

  }
  */
/* If/Else statement
  public static void main(String[] args) {
    int x = 4;

    if (x > 5){
      System.out.print(" Larger");
    } else if(x < 5){
      System.out.print("Smaller");
    } else {
      System.out.print("Number is 5");
    }
  }
  */
/* IF statement
  public static void main(String[] args) {
    int a = 23;
    int b = 9;

    if (a == 23) {
      if (b == 9);{
        System.out.print("A is " + a + " and B is " + b);
      }
    }
  }
  */

  /* Switch
  public static void main(String[] args){
    char letter = 'B';
    switch (letter) {
      case 'A':
        System.out.print("Perfect");
        break;
      case 'B':
        System.out.print(" Very good");
        break;
      case 'C':
        System.out.print("Good");
        break;
      case 'D':
        System.out.print("OK");
        break;
      case 'F':
        System.out.print("Fail");
        break;
      default:
        System.out.print("Enter valid letter!");
        break;
    }
  }
  */
  /* While loop
  public static void main(String[] args){
    int d = 3;

    while( d < 5) {
      System.out.print("d's value is " + d);
      d++;
      System.out.print("\n");
    }
    */

    /* for loop
    public static void main(String[] args) {
      for( int x = 5; x < 8; x = x + 1) {
        System.out.println("x's value is " + x);
      }
    }
    */
    /* do..while
    public static void main(String[] args){
      int e = 3;

      do{
        System.out.println("e's value is " + e);
        e++;
      } while(e < 5);
      */

      public static void main(String[] args){

        int [] numbs = {1, 2, 3, 4, 5};

        for(int z: numbs){
         System.out.print(z);
         System.out.print(",");
       }

       System.out.println("");
       String[] names = {"Abe", "Bob", "Cid"};

       for(String name: names){
        System.out.print(name);
        System.out.print(",");
       }
      }
}
