import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите процент");
        int procent=scanner.nextInt();
        System.out.println("Введите сумму");
        int sum= scanner.nextInt();
        System.out.println("Итоговую сумма : "+2 * (sum * ((float)procent / 100 + 1)));



    }
}
