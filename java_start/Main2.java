package java_start;

public class Main2 {
    /*
    Во фразе "Добро пожаловать на курс Java" переставить слова в обратном порядке.
     */
    public static void main(String[] args) {
        String line = "Добро пожаловать на курс Java";
        System.out.println(reverse(line));
    }

    static String reverse(String line) {
        String[] temp = line.split(" ");
        String res = "";
        for (int i = temp.length - 1; i >= 0; i--) {
            res += temp[i] + " ";
        }
        return res;
    }
}
