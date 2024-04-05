import java.util.Scanner;

public class MainP22_02 {
    public static void main(String[] args) {
        //输入
        int l;
        Scanner scanner = new Scanner(System.in);
        l = scanner.nextInt();
        int[][] arr = new int[l][l];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int[][] dp = new int[l + 1][l + 1];

        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = Math.max(dp[i-1][j - 1], dp[i - 1][j]) + arr[i - 1][j - 1];
            }
        }


        for (int[] a :
                dp) {
            for (int x :
                    a) {
                System.out.print(x + " ");
            }
            System.out.println();

        }
        if (l%2==0) {
            System.out.println(Math.max(dp[l][l/2], dp[l][l/2+1]));
        } else {
            System.out.println(dp[l][l / 2+1]);
        }

    }
}
