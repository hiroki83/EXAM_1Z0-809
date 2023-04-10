package chapter7.medium.concurrentcollection.part1;

import java.util.concurrent.ConcurrentHashMap;

public class CuncurrentHashMapExample {
  public static void main(String[] args) {
    String sentence = "the quick brown fox jumps over the lazy dog";
    String[] words = sentence.split(" ");
    ConcurrentHashMap<String, Integer> wordCounts = new ConcurrentHashMap<>();
    for (String word : words) {
      wordCounts.compute(word, (k, v) -> (v == null) ? 1 : v + 1);
    }
    System.out.println(wordCounts);
  }
}
