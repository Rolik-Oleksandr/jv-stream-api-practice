package org.stream.practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UniqueNumbers {
  public static List<Character> getUniqueNumbers(String sourceNumber) {
    return IntStream.range(0, sourceNumber.length())
            .mapToObj(sourceNumber::charAt)
            .distinct()
            .collect(Collectors.toList());
  }
}