import java.util.Scanner;

    public class TFalce {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Введите первое число: ");
            int num1 = input.nextInt();

            System.out.print("Введите второе число: ");
            int num2 = input.nextInt();

            int sum = num1 + num2;

            boolean isOdd = sum % 2 != 0;

            System.out.println(isOdd);
        }
    }


