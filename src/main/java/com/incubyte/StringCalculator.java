package com.incubyte;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;
        if (!numbers.contains(",")) return Integer.parseInt(numbers);

            numbers = numbers.replace("\n", ",");

            String[] parts = numbers.split(",");
            int sum = 0;
            for (String p : parts) sum += Integer.parseInt(p);
            return sum;



    }
}
