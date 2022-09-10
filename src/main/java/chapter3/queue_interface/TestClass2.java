package chapter3.queue_interface;

import java.util.*;

public class TestClass2 {
  public static void main(String[] args) {
    //ArrayDeque<Integer> stack = new ArrayDeque();
    //Queue<Integer> stack = new ArrayDeque();
    Deque<Integer> stack = new ArrayDeque();
    stack.push(10);
    stack.push(4);
    System.out.println(stack.peek());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.peek());
  }
}
