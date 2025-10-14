package com.incubyte;

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
        for (String p : parts) {
            if (!p.isEmpty()) {
                sum += Integer.parseInt(p);
            }
        }

        return sum;
    }
}
