class Fibonacci {
  public static void main(String[] args) {

    int n = 100, first = 0, second = 1;

    System.out.println("Fibonacci Series Upto " + n + ": ");

    while (first <= n) {
      System.out.print(first + ", ");

      int next = first + second;
      first = second;
      second = next;

    }
  }
}
