import java.math.BigInteger;

public class MainP28 {
    public static void main(String[] args) {
        //求 2 * *2023 % 1000，即 2的2023次方除以1000的余数。
        BigInteger a = new BigInteger("2");
        BigInteger b = a.pow(2023);
        BigInteger c = b.mod(new BigInteger("1000"));
        System.out.println(c);

    }
    public static void main1(String[] args) {
        int result = 0;
        BigInteger a = new BigInteger(String.valueOf(7));
        BigInteger b = a.pow(2020);
        BigInteger c = b.mod(new BigInteger(String.valueOf(1921)));
        System.out.println(c);
    }
}
