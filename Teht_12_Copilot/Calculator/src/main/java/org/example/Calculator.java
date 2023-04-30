//add package org.example;
package org.example;

public class Calculator {

    private int result;

    // Constructor
    public Calculator() {
        result = 0;
    }

    // Method add
    public void add(int a, int b) {
        if(a < 0 || b < 0)
            throw new IllegalArgumentException("Negative numbers are not allowed");
        else if(a > 0 && b > 0)
        result = a + b;
    }

    // Method subtract
    public void subtract(int a, int b) {
        result = a - b;
    }

    // Method reset
    public void reset() {
        result = 0;
    }

    // Method getResult
    public int getResult() {
        return result;
    }

    // loop numbers through 1 to 10 and add them together and print the result
    public void loop() {
        for (int i = 1; i <= 10; i++) {
            add(i, i);
        }
        System.out.println(getResult());
    }







    //main
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(1, 2);
        System.out.println(calc.getResult());
        calc.subtract(1, 2);
        System.out.println(calc.getResult());
        calc.reset();
        System.out.println(calc.getResult());
        calc.loop();
    }

}
