import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days,hours, min,sec;
        System.out.print("Введите количество секунд");
        int input= scanner.nextInt();
        System.out.printf("Дней : %d",input/86400);
        input= input % 86400;
        System.out.printf(" Часов : %d",input/3600);
        input = input % 3600;
        System.out.printf(" Минуты : %d",input/60);
        input = input % 60;
        System.out.printf(" Секунды: %d", input);


    }
}
