import java.util.Arrays;

public class MainP10 {
    public static void main(String[] args) {
        int[] arr = {3,2,4,6,5,8,9,7,10,1};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(i,minIndex,arr);
        }
    }
    static void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
