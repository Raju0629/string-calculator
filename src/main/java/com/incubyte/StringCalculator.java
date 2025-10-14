package com.incubyte;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;
        // Default delimiters: comma or newline
        String delimiterRegex = ",|\n";

        // Custom delimiter support (e.g., //;\n1;2)
        if (numbers.startsWith("//")) {
            int idx = numbers.indexOf('\n');
            String delim = numbers.substring(2, idx);
            numbers = numbers.substring(idx + 1);  // remove the delimiter line
            delimiterRegex = java.util.regex.Pattern.quote(delim);
        }

        // Split using the delimiter(s)
        String[] parts = numbers.split(delimiterRegex);

        int sum = 0;
        List<Integer> negatives = new ArrayList<>();
        for (String part : parts) {
            if (part.trim().isEmpty()) continue;

            int n = Integer.parseInt(part.trim());
            if (n < 0) {
                negatives.add(n);
            } else if (n <= 1000) { // ignore numbers > 1000
                sum += n;
            }
        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException(
                    "Negatives not allowed: " + negatives.stream()
                            .map(Object::toString)
                            .collect(Collectors.joining(","))
            );
        }
        return sum;
    }
}
