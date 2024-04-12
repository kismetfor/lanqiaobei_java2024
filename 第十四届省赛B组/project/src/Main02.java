public class Main02 {
    static long mod = 1000000007;
    public static void main(String[] args) {
        System.out.println(fun1(10, 2));
    }
    static long fun1(long n, long m) {
        long res = 1;
        for (long i = n; i >= n-m+1; i--) {
            res *= i;
            res %= mod;
        }
        return res;
    }
    static long fun(long m, long n) { //求排列组合
        long res = 1;
        long fenzi = 1;
        long fenmu = 1;
        for (long i = n; i > 1; i--) {
            fenmu *= i;
        }
        for (long i = n-m; i > 1; i--) {
            fenzi /= i;
        }
        res = fenmu/fenzi;
        res %= mod;
        return res;
    }
}
