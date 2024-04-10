import java.io.*;

public class Main05_5 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        long k = Long.parseLong(br.readLine());
        long left = 1;
        long right = Long.MAX_VALUE-1;
        while (left < right) {
            long mid = (left+right)>>1;
            if (k <= calv(mid)) { //多了
                right = mid;
            } else { //少了
                left = mid+1;
            }
        }
        if (calv(left)==k) {
            System.out.println(left);
        } else {
            System.out.println(-1);
        }

    }
    static long calv(long n) {
        long ret = 0;
        while (n!=0) {
            ret += n/5;
            n /= 5;
        }
        return ret;
    }
}
