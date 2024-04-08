import java.math.BigInteger;
import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.close();

//        BigInteger i = new BigInteger();
        for (int i = 2; i < 100; i++) {
            System.out.print(factorial(i)+" ");
            if (i %5==0) {
                System.out.println();
            }

        }

    }
    static long factorial(long num) {
        long result = 1;
        for (long i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

}
