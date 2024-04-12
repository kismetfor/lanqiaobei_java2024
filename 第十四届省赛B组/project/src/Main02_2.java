import java.util.Scanner;

public class Main02_2 {
    static long mod = 1000000007;
    static long zuhe(long n, long m) {
        //Cnm
        //分子为n的阶乘 乘前m个
        //分母是 m的阶乘
        long fenzi = 1;
        long fenmu  = 1;
        long res = 1;
        long m1 = m;
        long n1 = n;
        for (int i = 0; i < m; i++) {
            fenzi *= n1;
            n1--;
        }
        m1 = m;
        while (m1!=0) {
            fenmu *= m1;
            m1--;
        }
        res = fenzi/fenmu;
        res %= mod;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(zuhe(4, 0));
        System.out.println(zuhe(4, 1));
        System.out.println(zuhe(0, 0));
    }
    //已经明白了 是求组合的 奇数组合数和偶数组合数饿的积
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int t = scanner.nextInt();
            while (t-- != 0) {
                int n = scanner.nextInt();
                int num0 = 0; //偶数个数
                int num1 = 0; //奇数个数
                for (int i = 0; i < n; i++) {
                    int tmp = scanner.nextInt();
                    if (tmp%2==0) {
                        num0++;
                    } else {
                        num1++;
                    }
                }
                if (num1%2!=0) {
                    System.out.println(0);continue;
                }

                long res = 0;
                for (int i = 0; i <= n; i++) { //集合A1个数
                    for (int j = 0; j <= num1 && j <= i; j+=2) { //集合A1的奇数个数 要求奇数个数为偶数个+=2 技术个数小于A1总数i 也要小于总的奇数个数num1
                        //集合A2奇数个数为 num1-j 也要为偶数 并且 i-j必须小于等于偶数个数的总数
                        if ((num1-j)%2==0 && i-j<=num0) {
                            res += zuhe(num1, j)*zuhe(num0, i-j);
                            res %= mod;
                        }
                    }
                }
                System.out.println(res);
            }
        }
    }
}
