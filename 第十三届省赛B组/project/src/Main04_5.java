import java.io.*;

public class Main04_5{
    static int N = 200010;
    static int[] a = new int[N], cnt = new int[N];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        //读取输入
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < s.length; i++) {
            a[i] = Integer.parseInt(s[i]);
            cnt[a[i]]++;
        }

        //前缀和
        for (int i = 1; i < 100000; i++) {
            cnt[i] += cnt[i-1];
        }

        for (int i = 0; i < n; i++) {
            if (n-cnt[a[i]] <= (a[i]==0 ? 0:cnt[a[i]-1]) ) {
                out.print(0+" ");
                continue;
            }
            int l = a[i]+1;
            int r = 100000;
            while (l < r) {
                int mid = (l+r)>>1;
                if (n-cnt[mid] <= cnt[mid-1]-1) {
                    r = mid;
                }else {
                    l = mid+1;
                }

                //cnt[mid-1]表示 不包括mid在内的 小于mid成绩的学生数量
                //因为要排除学生a[i]自己的成绩 因此再减一

            }
            out.print(r-a[i]+" ");
        }
        out.flush();
    }
}
