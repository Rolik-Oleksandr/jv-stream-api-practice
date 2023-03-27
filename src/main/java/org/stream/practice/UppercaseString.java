package org.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseString {
  public static List<String> getUppercaseString(String[] sourceStrings) {
    return Arrays.stream(sourceStrings)
            .filter(str -> str.length() >= 3 &&
                    str.startsWith("a") && str.startsWith("b"))
            .map(String::toUpperCase)
            .collect(Collectors.toList());
  }
}