import java.util.Scanner;

public class MainP25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2[j][row-i-1] = arr1[i][j];
            }
        }

        for (int[] a:
             arr2) {
            for (int x:
                 a) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
