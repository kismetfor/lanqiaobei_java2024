import java.util.Scanner;

public class Main02_1 {
    static long mod = 1000000007;

    static long fun(long up, long down) {
        if (up>down/2){
            up=down-up;
        }
        long fenzi=1;
        long fenmu=1;
        for (long i=0;i<up;i++){
            fenzi*=down;
            down--;
        }
        for (long i=1;i<=up;i++){
            fenmu*=i;
        }

        return (fenzi/fenmu)%1000000007;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                        res += fun(num1, j)*fun(num0, i-j);
                        res %= mod;
                    }
                }
            }
            System.out.println(res);
        }
    }

}
