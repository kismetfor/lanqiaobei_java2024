import java.util.Arrays;

public class MainP9 {

    public static void main(String[] args) {
        int[] arr = {2,4,3,1,5,7,6,9,8,10};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = arr.length-1; j >i ; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(j-1,j,arr);
                }
            }
        }
    }
    static void swap(int i, int j, int[] arr) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
