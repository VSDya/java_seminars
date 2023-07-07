package HW1;
import java.util.Scanner;

public class Task1 {
    /*
    Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! факториал (произведение чисел от 1 до n)
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        String numb = scanner.nextLine();
        int triang = triangular(Integer.parseInt(numb));
        System.out.println("triangular number = " + triang);
        int fact_n = factorial(Integer.parseInt(numb));
        System.out.println("factorial number = " + fact_n);
        scanner.close();

    }

    private static int triangular(int n) {
        int result = ((n+1)*n/2);
        return result;
    }

    private static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}
