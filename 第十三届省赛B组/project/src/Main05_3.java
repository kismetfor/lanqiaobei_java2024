import java.io.*;

public class Main05_3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        long k = Long.parseLong(br.readLine());
        long a = 0; //当前0个数
        long n = 0;
        long left = 0;
        long right = 0;
        while (true) {
            if (k==a) {
                System.out.println(n);
                break;
            } else if (a > k) {
                System.out.println(-1);
                break;
            }
            //这段增量改为二分

            n += 5;
            long b = count_5(n);
            if (b==-1) {
                a++;
            } else {
                a += b;
            }
        }
        out.flush();
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

}
