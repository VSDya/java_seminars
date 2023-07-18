package HW3;

import java.util.ArrayList;

public class Task6 {
    /*
    Пусть дан произвольный список целых чисел, удалить из него четные числа.
     */
    public static void main(String[] args) {
        ArrayList<Integer> array = lib.FillRandomArray(10);
        lib.PrintArray(array);
        DeleteEvenNumber(array);
        lib.PrintArray(array);
    }
    public static void DeleteEvenNumber(ArrayList<Integer> list){
        int i = 0;
        while (i < list.size()){
            if(list.get(i) % 2 == 0) list.remove(i);
            else i++;
        }
    }
}