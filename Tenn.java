import java.util.Scanner;

public class Tenn {
    public static void main(String[]args){
        Scanner InPut = new Scanner(System.in);

        System.out.println("Введите десятичное число: ");
        int teen = InPut.nextInt();

        String hexTeen = "";
        while (teen != 0){
            int remainder = teen % 16;
            char hexChar = (remainder < 10) ? (char) (remainder + '0') : (char) (remainder - 10 + 'A');
            hexTeen = hexChar + hexTeen;
            teen /= 16;
        }
        System.out.println("Шестнадцатеричное число: " + hexTeen);

    }
}
