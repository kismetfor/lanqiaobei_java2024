import java.util.Scanner;

public class MainP22_01 {
    public static void main(String[] args) {
        //输入
        int h;
        Scanner scanner = new Scanner(System.in);
        h = scanner.nextInt();
        int[][] arr = new int[h][h];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < i+1; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int[][] dp = new int[h+1][h+1];
        for (int i = 1; i <= h; i++) {
            dp[i][0] = dp[i - 1][0] + arr[i][0];  // 最左侧位置
            dp[i][i] = dp[i - 1][i - 1] + arr[i][i];  // 最右侧位置
            for (int j = 1; j <= i; j++) {
                dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j])+arr[i][j];
            }
        }
        System.out.println(dp[h][h]);
    }
}
