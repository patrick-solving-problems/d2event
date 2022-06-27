package org.d2jsp.d2event.logic;

import java.util.List;
import java.util.stream.IntStream;

public class BasicStringBuilder {

    public static String buildBasicString(List<String> s1, List<String> s2, List<String> s3, List<String> s4) {
        int maxLength1 = s1.stream()
                .flatMapToInt(s -> IntStream.of(s.length()))
                .max().getAsInt();
        int maxLength2 = s2.stream()
                .flatMapToInt(s -> IntStream.of(s.length()))
                .max().getAsInt();
        int maxLength3 = s3.stream()
                .flatMapToInt(s -> IntStream.of(s.length()))
                .max().getAsInt();
        int maxLength4 = s4.stream()
                .flatMapToInt(s -> IntStream.of(s.length()))
                .max().getAsInt();

        String output = "";
        for (int i = 0; i < s1.size(); i++) {
            output += extendWithSpaces(s1.get(i), maxLength1);
            output += "  ";
            output += extendWithSpaces(s2.get(i), maxLength2);
            output += "  ";
            output += extendWithSpaces(s3.get(i), maxLength3);
            output += "  ";
            output += extendWithSpaces(s4.get(i), maxLength4);
            output += "\n";
        }
        return output;
    }

    private static String extendWithSpaces(String s, int maxLength) {
        String output = "";
        for (int i = s.length(); i < maxLength; i++) {
            output += " ";
        }
        return s + output;
    }

}
