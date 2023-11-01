import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите число ");
        Double number = scanner.nextDouble();
        if((number * 10) %10 != 0) System.out.println("Вещественное число ");
        else
            System.out.println("Целое число ");


    }
}
