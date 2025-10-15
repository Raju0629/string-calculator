package com.incubyte;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    private final StringCalculator calc = new StringCalculator();
    @Test void emptyStringReturnsZero() {
        assertEquals(0, calc.add(""));
    }
    @Test void singleNumberReturnsValue() {
        assertEquals(1, calc.add("1"));
    }

    @Test void twoNumbersCommaDelimited() {
        assertEquals(3, calc.add("1,2"));
    }

    @Test void anyAmountOfNumbers() {
        assertEquals(15, calc.add("1,2,3,4,5"));
    }

    @Test void newlineBetweenNumbersWorks() {
        assertEquals(6, calc.add("1\n2,3"));
    }

    @Test void customDelimiter() {
        assertEquals(3, calc.add("//;\n1;2"));
    }

    @Test void negativesThrowExceptionWithList() {
        var ex = assertThrows(IllegalArgumentException.class, () -> calc.add("1,-2,3,-5"));
        assertTrue(ex.getMessage().contains("-2"));
        assertTrue(ex.getMessage().contains("-5"));
        assertTrue(ex.getMessage().toLowerCase().contains("negatives"));
    }

    @Test void numbersGreaterThan1000Ignored() {
        assertEquals(2, calc.add("2,1001"));
    }

    @Test void anyLengthDelimiter() {
        assertEquals(6, calc.add("//[***]\n1***2***3"));
    }

    @Test void multipleDelimiters() {
        assertEquals(6, calc.add("//[*][%]\n1*2%3"));
    }

    @Test void multipleLongDelimiters() {
        assertEquals(6, calc.add("//[***][%%]\n1***2%%3"));
    }



}

