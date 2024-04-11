public class Main10 {
    static long mod = 10_0000_0000;
//    static long mod = 100;
    public static void main(String[] args) {
        long res = 0;
        long a = 1; //记录上一个数
        for (int i = 2; i < 45; i++) {
            long b = a*i;
            res = (a%mod + b%mod);
            a = b;
        }
        System.out.println(res);
//        for (long i = 1; i <= 202320232023L; i++) {
//
//        }
    }
    static long factorial(int n) {
        long res = 1;
        while (n!=0) {
            res = n%mod*res;
            n--;
        }
        return res;
    }
}
