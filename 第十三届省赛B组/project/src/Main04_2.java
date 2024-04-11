import java.io.*;

public class Main04_2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    static int[] a = new int[200000]; //成绩
    static int[] b = new int[200000]; //前缀和数组
    static int n = 0;
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
            b[a[i]]++;
        }
        for (int i = 1; i < 200000; i++) {
            b[i] += b[i-1];
        }

        for (int i = 0; i < n; i++) {
            if (n-b[a[i]] <= (a[i]==0?0:b[a[i]-1])) {
                System.out.print(0+" ");
            } else {
                int r = 100000;
                int l = a[i]+1;
                while (l < r) {
                    int mid = (l+r)>>1;
                    if (n-b[mid] <= b[mid-1]-1) {
                        r = mid;
                    }else {
                        l = mid+1;
                    }
                }
                System.out.print(r-a[i]+" ");
            }
        }
    }
}
