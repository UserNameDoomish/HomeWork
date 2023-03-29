public class TwoVariables {
        public static void main(String[] args) {
            int a = 16;
            int b = 29;
            System.out.println("До замены:");
            System.out.println("a = " + a + ", b = " + b);

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("После замены:");
            System.out.println("a = " + a + ", b = " + b);
        }
    }


