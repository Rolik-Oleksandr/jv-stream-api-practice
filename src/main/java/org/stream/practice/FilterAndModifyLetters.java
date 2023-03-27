package org.stream.practice;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterAndModifyLetters {
  public static String filterLetters(String input) {
    return IntStream.range(0, input.length())
            .filter(i -> i % 2 == 0)
            .mapToObj(input::charAt)
            .map(Character::toUpperCase)
            .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
            .toString();
  }
}