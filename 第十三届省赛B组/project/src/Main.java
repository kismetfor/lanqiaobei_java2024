import java.io.*;

public class Main{
    static int N = 200010;
    static int[] a = new int[N], cnt = new int[N];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n=Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
            cnt[a[i]]++;
        }
        for (int i = 1; i <= 100000; ++i) {
            cnt[i] += cnt[i - 1];
        }
        for (int i = 0; i < n; ++i) {
            if (cnt[100000] - cnt[a[i]] <=(a[i] == 0 ? 0 : cnt[a[i] - 1])) {
                out.print(0 + " ");
                continue;
            }
            int l = a[i] + 1, r = 100000;
            while (l < r) {
                int mid = l + r >> 1;
                if (cnt[100000] - cnt[mid] <= cnt[mid - 1] - 1) r = mid;
                //cnt[mid - 1] 表示小于等于mid的学生数量。
                 // - 1 是因为我们要将当前学生自己的刷题数量排除在外，不计入小于mid的学生数量中。
                else l = mid + 1;
            }
            out.print((r - a[i]) + " ");
        }
        out.flush();
    }
}

