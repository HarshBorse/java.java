class con {

  // member variable
  int a;

  // constructor
  con(int a) {
    System.out.println("Inside the con class constructor.");
    this.a = a;
    System.out.println("Awesomeness set!");
  }

  // method
  public int getA() {
    return this.a;
  }

  // finalize
  protected void finalize() {
    System.out.println("Inside the con class finalize method...");
    System.out.println("Object getting destroyed... Bye...");
  }
}
class AwesomeExample {
  public static void main(String[] args) {

    con obj = new con(10);
    System.out.println("Awesomeness of the object is " + obj.getA());
  }
}
