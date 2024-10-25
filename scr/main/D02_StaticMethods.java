package main;

import util.Calculator;
import util.Printer;

/**
 * Demonstrates the usage of static methods in Java.
 * 
 * @author Jan Wieland
 * @version 1.0
 */
public class D02_StaticMethods {

    public static void main(String[] args) {
        Printer.printHelloWorld();
        int result = Calculator.add(4, 2);
        System.out.println(result);
    }
}
