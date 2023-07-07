package HW1;

public class Task2 {
    /*
    Вывести все простые числа от 1 до 1000
     */

    public static void main(String[] args) {
        StringBuilder st = new StringBuilder();
        st = st.append("1");
        for (int i = 2; i < 1000; i++) {
            if (isNumberSimple(i))
                st = st.append(", ").append(i);
        }
        System.out.println("Простые числа от 1 до 1000:");
        System.out.println(st);
    }
    private static boolean isNumberSimple(int n) {
        for (int index = 2; index < n; index++) {
            if (n % index == 0 )
                return false;
        }
        return true;

    }
}
