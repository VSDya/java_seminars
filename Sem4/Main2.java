package Sem4;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main2 {
    /*
    Принимает от пользователя и "заполняет" строки.
    Если введено print, выводит строки так, чтобы последняя введённая была первой в списке, а первая - последней.
    Если введено revert, удаляет предыдущую введённую строку из памяти.
     */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean work = true;
        while (work) {
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("print")) {
                ListIterator<String> listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()){
                    System.out.println(listIterator.previous());
                }
                System.out.println(list);
            } else if (line.equalsIgnoreCase("revert") && list.size() > 0) {
                list.removeLast();
                System.out.println(list);
            } else {
                list.add(line);
                System.out.println(list);
            }
        }
    }
}