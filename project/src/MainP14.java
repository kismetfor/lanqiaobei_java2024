public class MainP14 {
    public static void main(String[] args) {
        System.out.println(gcd1(4, 10));
    }
    static int gcd1(int a, int b) {
        while (b!=0) {
            if (a>b) {
                int tmp = a;
                a = b;
                b = tmp;
            }
            b %= a;
        }
        return a;
    }
    static int gcd(int a, int b) {
        if (a>b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        if (b%a==0) return a;
        return gcd(a, b%a);
    }

}
