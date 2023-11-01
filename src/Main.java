import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Введите х");
       int x= scanner.nextInt();
       System.out.print("Введите y");
       int y= scanner.nextInt();
       System.out.printf("Результат деления : %.2f \n",(float) x / (float) y);
       System.out.printf("Остаток от деления : %d \n", x%y);
       System.out.printf("Квадратный корень : %.2f \n",Math.sqrt(x) );

    }
}