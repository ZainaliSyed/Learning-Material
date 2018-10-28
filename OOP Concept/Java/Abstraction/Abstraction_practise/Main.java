public class Main {
  public static void main(String args[]) {
    TwoWheeler test = new Honda();
    Honda h = new Honda();
    test.run();
    test.getName();

    h.getName();
  }
}

abstract class TwoWheeler {
  public abstract void run();

  public abstract void twoWheelerrun();

  private int name = 10;

  public void getName() {
    System.out.println("Name.." + this.name);
  }
}

interface FourWheeler {
  public void fourWheeler();
}

class Honda extends TwoWheeler implements FourWheeler {
  public void run() {
    System.out.println("Running..");
  }

  public void twoWheelerrun() {
    // System.out.println("twoWheelerrun Running ");
  }

  public void fourWheeler() {
    System.out.println("fourWheeler Running ");
  }

  public void getName() {
    System.out.println(" 123Running ");
  };

}