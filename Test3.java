import java.util.Scanner;

public class Test3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите первое число:");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        double quotient =(double) number1 / number2;
        System.out.println("Сумма:" + sum);
        System.out.println("Разность:" + difference);
        System.out.println("Произведение:" + product );
        System.out.println("частное:" + quotient);

    }
}
