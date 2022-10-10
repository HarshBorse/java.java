class Outer {


   // inner class
   private class Inner {
      public void print() {
         System.out.println("This is an inner class");
      }
   }

   // Accessing he inner class from the method within
   void displayInner() {
      Inner inner = new Inner();
      inner.print();
   }
}

public class Myclass {

   public static void main(String args[]) {
      // Instantiating the outer class 
      Outer outer = new Outer();

      // Accessing the displayInner() method.
      outer.displayInner();
   }
}
