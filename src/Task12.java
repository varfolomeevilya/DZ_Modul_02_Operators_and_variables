import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество учеников");
        int n = scanner.nextInt();
        System.out.printf("Молока : %f",(float) Math.ceil(0.9/0.2*n));
        System.out.printf(" Пирожок : %f ", (float) Math.round(n));
        System.out.printf("Учеников : %f", (float)Math.round(n));

        



    }
}
