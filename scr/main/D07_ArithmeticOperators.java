package main;

/**
 * Demonstrates basic arithmetic operations and their results.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class D07_ArithmeticOperators {

  public static void main(String[] args) {

    int a, b, c;

    a = 5;
    b = 3;

    /* Addition */
    c = a + b;
    System.out.println(a + " + " + b + " = " + c); // Outputs "5 + 3 = 8"

    /* Subtraction */
    c = a - b;
    System.out.println(a + " - " + b + " = " + c); // Outputs "5 - 3 = 2"

    /* Multiplication */
    c = a * b;
    System.out.println(a + " * " + b + " = " + c); // Outputs "5 * 3 = 15"

    /* Integer Division */
    c = a / b; // Quotient
    System.out.println(a + " / " + b + " = " + c); // Outputs "5 / 3 = 1"
    c = a % b; // Remainder (Modulo)
    System.out.println(a + " % " + b + " = " + c); // Outputs "5 % 3 = 2"

    /* Division with Double Precision */
    double d = (double) a / b;
    System.out.println((double) a + " / " + b + " = " + d); // Outputs "5.0 / 3 = 1.666..."

    /* Incrementing */
    c = 0;
    c = c + 1;
    c += 1; // Equivalent to c = c + 1;
    c++;
    System.out.println("c: " + c); // Outputs "c: 3"

    /* Decrementing */
    c = c - 1;
    c -= 1; // Equivalent to c = c - 1;
    c--;
    System.out.println("c: " + c); // Outputs "c: 0"

    /* Post-increment vs. Pre-increment */
    c = a++;
    System.out.println("a: " + a); // Outputs incremented value of a
    System.out.println("c: " + c); // Outputs initial value of a before increment

    c = ++a;
    System.out.println("a: " + a); // Outputs incremented value of a
    System.out.println("c: " + c); // Outputs incremented value of a

    /* Division by Zero with Double Precision */
    d = 1.0 / 0.0;
    System.out.println("d: " + d); // Outputs "Infinity"
    d = 1.0 / -0.0;
    System.out.println("d: " + d); // Outputs "-Infinity"

    d = 0.0 / 0.0;
    System.out.println("d: " + d); // Outputs "NaN"
    d = 0.0 / -0.0;
    System.out.println("d: " + d); // Outputs "NaN"

    /* Division by Zero with Integer */
    // d = 1 / 0;
    // System.out.println("d: " + d); // Throws ArithmeticException
    // d = 1 / -0;
    // System.out.println("d: " + d); // Throws ArithmeticException

  }

}
