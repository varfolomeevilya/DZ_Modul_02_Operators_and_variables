import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n");
        double n = scanner.nextDouble();
        System.out.printf("Результат округления : %d \n", Math.round(n));

    }
}
