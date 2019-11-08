package com.foxminded.text.operations;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class CharactersCounter {
    private static final String EMPTY = "";
    private final Map<String, Map<Character, Integer>> cache = new WeakHashMap<>();

    public String displayCharsCount(String input) {
        validate(input);

        return new StringBuilder(input)
                .append('\n')
                .append(convertMapToString(cache.computeIfAbsent(input, b -> countChars(input))))
                .toString()
                .trim();
    }

    private static void validate(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input argument is null");
        }
        if (input.equals(EMPTY)) {
            throw new IllegalArgumentException("Input argument is empty");
        }
    }

    private static String convertMapToString(Map<Character, Integer> map) {
        StringBuilder output = new StringBuilder();
        map.forEach((k, v) -> output.append(String.format("\"%c\" - %d\n", k, v)));

        return output.toString();
    }

    private static Map<Character, Integer> countChars(String input) {
        Map<Character, Integer> charToCount = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            charToCount.merge(c, 1, Integer::sum);
        }

        return charToCount;
    }
}
