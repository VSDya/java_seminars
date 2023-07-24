package Sem6;

import java.util.*;

public class Main {
    /*
    1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    Распечатайте содержимое данного множества.
    2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    Распечатайте содержимое данного множества.
    3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    Распечатайте содержимое данного множества.
     */
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{3, 1, 2, 2, 4, 5, 6, 3};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));
//        set1.add(0); // [0, 1, 2, 3, 4, 5, 6]
//        set2.add(0); // [0, 1, 2, 3, 4, 5, 6]
//        set3.add(0); // [3, 1, 2, 4, 5, 6, 0]

        System.out.println(set1);   // [1, 2, 3, 4, 5, 6]
        System.out.println(set2);   // [3, 1, 2, 4, 5, 6]
        System.out.println(set3);   // [1, 2, 3, 4, 5, 6]
    }
}