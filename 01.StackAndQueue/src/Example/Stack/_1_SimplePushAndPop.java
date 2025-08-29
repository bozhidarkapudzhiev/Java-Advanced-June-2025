package Example.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class _1_SimplePushAndPop {
    public static void main(String[] args) {
        Deque<String>stack=new ArrayDeque<>();
        stack.push("A");
        stack.push("B");
        System.out.println("Stack after pushes:"+ stack);//[B,A]
        System.out.println("popped element: "+stack.pop());
        System.out.println("Stack after pop: "+stack.pop());//[A]
    }
}
