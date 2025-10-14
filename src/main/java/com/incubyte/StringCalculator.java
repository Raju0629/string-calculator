package com.incubyte;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;
        if (!numbers.contains(",")) return Integer.parseInt(numbers);

        throw new UnsupportedOperationException("Multiple numbers not implemented yet");

    }
}
