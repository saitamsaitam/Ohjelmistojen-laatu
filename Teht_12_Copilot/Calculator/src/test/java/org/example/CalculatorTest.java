package org.example;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        //test add method
        Calculator calc = new Calculator();
        calc.add(1, 2);
        assertEquals(3, calc.getResult());
    }

    //test add method for exception
    @org.junit.jupiter.api.Test
    void addException() {
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calc.add(-1, 2));
    }



    @org.junit.jupiter.api.Test
    void subtract() {
        //test subtract method
        Calculator calc = new Calculator();
        calc.subtract(1, 2);
        assertEquals(-1, calc.getResult());
    }

    @org.junit.jupiter.api.Test
    void reset() {
        //test reset method
        Calculator calc = new Calculator();
        calc.reset();
        assertEquals(0, calc.getResult());
    }

    @org.junit.jupiter.api.Test
    void getResult() {
        //test getResult method
        Calculator calc = new Calculator();
        calc.add(1, 2);
        assertEquals(3, calc.getResult());
    }
}