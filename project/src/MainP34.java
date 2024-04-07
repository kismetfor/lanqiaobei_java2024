import java.util.Scanner;

public class MainP34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arr = new int[31][31];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i%2==0 && j%2==0) {
                    arr[i][j] = 0;
                } else if (i==1||j==1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
                }
            }
        }
        System.out.println(arr[n][m]);
    }
}
