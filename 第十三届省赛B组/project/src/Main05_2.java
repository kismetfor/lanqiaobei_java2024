import java.math.BigInteger;

public class Main05_2 {
    public static void main(String[] args) {
        BigInteger re = new BigInteger("1");
        for (int i = 2; i < 131; i++) {
            re = re.multiply(BigInteger.valueOf(i));
            System.out.println(i+": "+re+"   ");
        }

    }
}
