package learning_java;
/**
 * Deque的两种实现方式-LinkedList, ArrayDeque
 * 用deque来实现stack
 * by Joyce
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

class demo_deque{
    public static void main(String[] args) {
        /**用LinkedList实现Deque**/
        Deque<String> deque = new LinkedList<>();
        deque.offerLast("A");
        deque.offerLast("B");
        deque.offerFirst("C");
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollFirst());
        //依次输出
        //C
        //B
        //A
        /**用ArrayDeque实现Deque**/
        Deque<Integer> deque1 = new ArrayDeque<>();
        deque1.offerLast(1);
        deque1.offerLast(2);
        deque1.offerFirst(3);
        System.out.println(deque1.pollLast());
        System.out.println(deque1.pollFirst());
        //依次输出：2，3

        /**用Deque实现stack**/
        System.out.println("=========stack=========");
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.pop();
        stack.push(2);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }

}
