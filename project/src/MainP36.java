import java.util.Arrays;
import java.util.Scanner;

public class MainP36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(arr);

        int count = 0;
        //优化
        boolean flag = true;
        for (int i = 0; i < arr.length && flag; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    String s = arr[i] +""+arr[j];
                    int num = Integer.parseInt(s);
                    System.out.print(num+" ");
                    if (num <= k) {
                        count++;
                    } else {
                        //优化
                        if (arr[i] != arr[j]) {
                            flag = false;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
