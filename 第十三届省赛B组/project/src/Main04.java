import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < n; i++) {
            int result = 0;
            while (!func(arr, i)) {
                arr[i]++;
                result++;
            }
            arr[i] -= result;
            System.out.print(result+" ");
        }


    }
    static boolean func(int[] arr, int i) {
        int lower = 0;
        int bigger = 0;

        for (int j = 0; j < arr.length; j++) {
            if (i != j) {
                if (arr[i] < arr[j]) {
                    bigger++;
                } else if (arr[i] > arr[j]) {
                    lower++;
                }
            }
        }
        return lower >= bigger;
    }
}
