public class Main05_4 {
    public static void main1(String[] args) {
        System.out.println(count_5(125));
        for (int k = 0; k < 32; k++) {
            long a = 0;
            long n = 0;
            while (true) {
                if (k==a) {
                    System.out.println(k+": "+n);
                    break;
                } else if (a > k) {
                    System.out.println(k+": "+-1);
                    break;
                }
                n += 5;
                long b = count_5(n);
                if (b==-1) {
                    a++;
                } else {
                    a += b;
                }
            }
        }

    }
    //5的几次方 不是5的次方就返回-1 是5的n次方就返回n
    static long count_5(long num) {
        long ret = 0;
        while (num%5==0) {
            num /= 5;
            ret++;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(count_5(5));
    }
}
