import java.util.Arrays;
        import java.util.HashMap;
        import java.util.Scanner;

public class Main04_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        //排序 二分找到中间值
        int[] a = Arrays.copyOf(arr,arr.length);
        Arrays.sort(a); //O(N*logN)
        int tmp = a[n/2];
        //比中间值大的不管 中间值也不用管 只需要管比中间值小的
        for (int i = 0; i < n; i++) {
            if (arr[i] < tmp) {
                //输出 中间值-arr[i]+1
                System.out.print(tmp-arr[i]+1+" ");
            } else {
                System.out.print(0+" ");
            }
        }

    }
}