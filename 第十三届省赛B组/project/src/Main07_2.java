import java.util.Scanner;

public class Main07_2 {
    static long res = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        backtrace(arr, 0);
        System.out.println(res);
    }
    static void backtrace(int[] a, int startIndex) {
        int n = a.length;
        if (startIndex == n) {
            res++;
            return;
        }
        for (int i = startIndex; i < n; i++) {
            if (check(a, startIndex, i)) {
                backtrace(a, i+1);
            }
        }
    }
    static boolean check(int[] a, int l, int r) {
        int maxIndex = l;
        int minIndex = l;
        for (int i = l+1; i <= r; i++) {
            if (a[maxIndex] < a[i]) maxIndex = i;
            if (a[minIndex] > a[i]) minIndex = i;
        }
        return a[maxIndex]-a[minIndex] == r-l;
    }
}
