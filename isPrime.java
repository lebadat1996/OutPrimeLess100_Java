package outPrimeNhoHon100;

public class isPrime {
    public static void main(String[] args) {
        int count = 0;
        int i = 2;
        for (; i < 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i + "");
                count++;
            }
        }

    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}