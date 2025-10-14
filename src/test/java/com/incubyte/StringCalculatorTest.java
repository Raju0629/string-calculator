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

}

