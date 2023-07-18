package Sem2;

public class Main {
    /*
    Дано четное число N (>0) и символы c1 и c2.
    Написать метод, который вернёт строку длины N, состоящую из чередующихся символов c1 и c2, начиная с c1.
    Ответ: c1c2c1..c2 (Всего N символов)
    */
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'b';
        int n = 6;
        System.out.println(luboe(c1, c2, n));

    }
    static String luboe(char c1, char c2, int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            stringBuilder.append(c1);
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }
}
