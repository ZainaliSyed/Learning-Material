
// Java program to demonstrate working of  
// interface. 
import java.io.*;

// A simple interface 
interface in1 {
  // public, static and final
  static int a = 10;

  // public and abstract
  void display();

  void show();

  abstract void checkAbstract();

  default void print() {
    System.out.print("Hello using default ");
  }

  static void displayStatis() {
    System.out.println("Hello using Static Method ");
  }
}

// A class that implements interface.
class testClass implements in1 {
  // Implementing the capabilities of
  // interface.
  public void display() {
    System.out.println("Geek");
  }

  public void show() {

  }

  public void checkAbstract() {
    System.out.println("checkAbstract working  in interface");
  }

  // Driver Code
  public static void main(String[] args) {
    testClass t = new testClass();
    t.display();
    System.out.println(a);
    t.print();
    in1.displayStatis();

    // checkAbstract
    t.checkAbstract();
  }
}