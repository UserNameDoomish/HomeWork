import java.util.Scanner;

public class SystemSixTeen {
    public static void main(String[]args){
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введите желаемое число в шеснадцатеричной системе исчисления: ");
        String hex = Scan.nextLine();
        int teen = hexToDecimal(hex);
        System.out.println("Число в десятичной системе исчисления: " + teen);
    }
    public static int hexToDecimal(String hex){
        String num = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int teen = 0;
        for (int i = 0; i < hex.length(); i++){
            char c = hex.charAt(i);
            int d = num.indexOf(c);
            teen = 16 * teen + d;
        }
        return teen;
    }
}
