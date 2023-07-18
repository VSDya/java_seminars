package Sem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    /*
    Даны следующие строки, сравнить их с помощью == и метода equals() класса Object
    String s1 = "hello";
    String s2 = "hello";
    String s3 = s1;
    String s4 = "h" + "e" + "l" + "l" + "o";
    String s5 = new String("hello");
    String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
    */
    public static void main(String[] args) {
        int a = 5;
        List<Integer> list = new ArrayList<>();
        int[] arr = {1,2,3};
        test(a, arr);
        System.out.println(a);
        System.out.println(Arrays.toString(arr));

        String s = "4";
        System.out.println(s.equals('4'));

        Integer c = 4;
        Float f = 4f;
        System.out.println(c.equals(f));
    }

    static void test(int a, int[] arr){
        a++;
        arr[0] = 5;
    }
}
