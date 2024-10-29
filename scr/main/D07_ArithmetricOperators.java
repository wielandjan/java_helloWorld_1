package main;

public class D07_ArithmetricOperators {

    public static void main(String[] args) {

        int a, b, c;

        a = 5;
        b = 3;

        /* addition */
        c = a + b;
        System.out.println(a + " + " + b + " = " + c);

        /* subtraction */
        c = a - b;
        System.out.println(a + " - " + b + " = " + c);

        /* multiplication */
        c = a * b;
        System.out.println(a + " * " + b + " = " + c);

        /* integer division */
        c = a / b;
        System.out.println(a + " / " + b + " = " + c);

        /* modulo */
        c = a % b;
        System.out.println(a + " % " + b + " = " + c);

        /* Division with double */
        double d = (double) a / b;
        System.out.println((double) a + " / " + b + " = " + d);

        /* increment */
        c = 0;
        c = c + 1;
        c += 1;
        c++;
        System.out.println("c: " + c);

        /* dekrementieren */
        c = c - 1;
        c -= 1;
        c--;
        System.out.println("c: " + c);

        /* Postinkremntieren vs. Preinkremntieren */
        c = ++a;
        System.out.println("a: " + a);
        System.out.println("c: " + c);

        /* Teilen durch Null */
        d = 1.0 / 0.0;
        System.out.println("d: " + d);
        d = 1.0 / -0.0;
        System.out.println("d: " + d);

        d = 0.0 / 0.0;
        System.out.println("d: " + d);
        d = 0.0 / -0.0;
        System.out.println("d: " + d);

        // d = 1 / 0;
        // System.out.println("d: " + d);
        // d = 1 / -0;
        // System.out.println("d: " + d);

    }
}
