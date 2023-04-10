package chapter7.medium.cuncurrentcollection.part1;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
  public static void main(String[] args) {
    String sentence = "the quick brown fox jumps over the lazy dog";
    String[] words = sentence.split(" ");
    Map<String, Integer> wordCounts = new HashMap<>();
    for (String word : words) {
      wordCounts.compute(word, (k, v) -> (v == null) ? 1 : v + 1);
    }
    System.out.println(wordCounts);
  }
}
