package org.d2jsp.d2event.logic;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BasicStringBuilder {

    public static String buildBasicString(final List<List<String>> lists) {
        List<Integer> listsMaxLength = lists.stream().map(
                list -> list.stream()
                        .flatMapToInt(s -> IntStream.of(s.length()))
                        .max().getAsInt()
        ).collect(Collectors.toList());

        String output = "";
        for (int i = 0; i < lists.get(0).size(); i++) {
            for (int j = 0; j < lists.size(); j++) {
                output += extendWithSpaces(lists.get(j).get(i), listsMaxLength.get(j));
                if (j < lists.size() - 1) {
                    output += "  ";
                }
            }
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
