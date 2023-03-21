public class JavaHomeWork3 {
    public static void main(String[] args) {
        byte b = 10;
        int i = 100;
        double d = 10.5;
        float f = 5.5f;

        byte b1 = (byte) i;
        int i1 = (int) d;
        double d1 = (double) f;
        float f1 = (float) b;

        System.out.println("byte b1 = " + b1);
        System.out.println("int i1 = " + i1);
        System.out.println("double d1 = " + d1);
        System.out.println("float f1 = " + f1);
    }
}
