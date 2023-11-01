import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n");
        int n = scanner.nextInt();
       int sum = 0;
       while(n != 0){
           sum += n % 10;
           n= n/10;
       }
       System.out.println("Сумма цифр  n:" + sum);
    }
}
