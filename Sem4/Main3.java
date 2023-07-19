package Sem4;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Main3 {
    /*
    1) Написать метод, который принимает массив элементов, помещает их в stack и выводит на консоль содержимое.
    2) Написать метод, который принимает массив элементов, помещает их в queue и выводит на консоль содержимое.
     */
    public static void main(String[] args) {
        testQueue();
        testStack();
    }

    static void testQueue(){
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        queue.add("4");

        System.out.println(queue);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        for (String string: queue){
            System.out.println(string);
        }
    }
    static void testStack(){
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        System.out.println(stack);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        for (String string: stack){
            System.out.println(string);
        }
    }
}