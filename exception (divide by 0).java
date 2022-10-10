11.write a java program that demonstrates exception (divide by 0).

import java.io.*;
class zero {
    public static void main(String[] args)
    {
        int a = 5;
        int b = 0;

        try {
            System.out.println(a / b); // throw Exception
        }
        catch (ArithmeticException e) {
            // Exception handler
            System.out.println(
                "Divided by zero operation cannot possible");
        }
    }
}
