import java.io.*;
import java.util.*;

class arrayli {
  public static void main(String[] args) {
    int n = 5;

    ArrayList<Integer> arrayli = new ArrayList<Integer>(n);

    // System.out.println("Size of Array Lsit : " + arrayli.size());
    // for (int i = 1; i <= n; i++) {
    // arrayli.add(i);
    // }
    // System.out.println("Array List : " + arrayli);

    // arrayli.remove(3);

    // System.out.println("New : " + arrayli);

    arrayli.add(1, 2);
    System.out.println("New : " + arrayli);
    for (int i = 0; i < arrayli.size(); i++) {
      System.out.print(arrayli.get(i) + " ");
    }
    System.out.println();
  }// end of main
}