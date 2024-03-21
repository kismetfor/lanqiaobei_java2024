import java.util.Arrays;

public class MainP11 {
    //插入排序
    public static void main(String[] args) {
        int[] arr = {3,2,4,6,5,8,9,7,10,1};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i]; //哨兵
            int j = i-1;
            for (; j >= 0; j--) {
                if (tmp >= arr[j]) {
                    break;
                } else {
                    arr[j+1] = arr[j];
                }
            }
            arr[j+1] = tmp;
        }
    }
}
