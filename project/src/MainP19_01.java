import java.util.Scanner;

public class MainP19_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();

        String[] a = new String[1000];
        int cur = 0; int t = 0;
        String[] b = new String[1000];
        int cur2 = 0; int t2 = 0;

        for (int i = 1; i < s1.length(); i++) {
            if (Character.isUpperCase(s1.charAt(i))) {
                a[cur++] = s1.substring(t, i);
                t = i;
            }

        }
        a[cur++] = s1.substring(t);
        for (int i = 1; i < s2.length(); i++) {
            if (Character.isUpperCase(s2.charAt(i))) {
                b[cur2++] = s2.substring(t2, i);
                t2 = i;
            }

        }
        b[cur2++] = s2.substring(t2);
        int[][] dp = new int[cur+1][cur2+1];
        for (int i = 1; i <= cur; i++) {
            for (int j = 1; j <= cur2; j++) {
                if (a[i-1].equals(b[j-1])) {
                    dp[i][j] = dp[i-1][j-1]+1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[cur][cur2]);
    }
}
