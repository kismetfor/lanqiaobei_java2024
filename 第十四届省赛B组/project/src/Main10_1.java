import java.math.BigInteger;

public class Main10_1 {
    public static void main(String[] args) {
        BigInteger mod = new BigInteger("1000000000");
        BigInteger a = new BigInteger("1");
        BigInteger res = new BigInteger("1");
        for (long i = 2; i <= 202320232023L; i++) {
            BigInteger b = new BigInteger(Long.toString(i));
            b = b.mod(mod);
            b = b.multiply(a);
            b = b.mod(mod);
            if (b.equals(new BigInteger("0"))) break;
            res = res.add(b);
            res = res.mod(mod);
            a = b;
        }
        System.out.println(res);
    }
}
