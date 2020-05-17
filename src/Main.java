public class Main {

    public static void main(String[] args) {
        int a = 5;
        long b = 6;
        double c = 7;
        short d = 8;
        boolean e = true;

    }

    public static int quest3 (int a ,int b ,int c ,int d) {
        return a * (b + (c / d ));
    }

    public static boolean quest4 (int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }

    }

    public static void quest5 (int a) {
        if( a >= 0){
            System.out.println("Число положительное.");
        } else {
            System.out.println("Число отрицательное.");
        }

    }

    public static boolean quest6(int a) {
        if(a < 0){
            return true;
        } else {
            return false;

        }

    }

    public static void quest7 (String a) {
        System.out.println("Привет " + a);
    }


}
