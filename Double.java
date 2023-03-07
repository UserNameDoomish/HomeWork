import java.util.Scanner;

public class Double {
    public  static void main(String[]args){
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введите желаемое число: ");
        int binary = Scan.nextInt();
        int DoubleA[] = new int[40];
        int index = 0;
        while (binary > 0 ){
            DoubleA[index++] = binary % 2;
            binary = binary /2;
        }
        StringBuilder binaryStreing = new StringBuilder();
        for (int i = index -1; i >=0; i--){
            binaryStreing.append(DoubleA[i]);

        }
        String result = binaryStreing.toString();
        System.out.println("Результат: " + result);


    }
}
