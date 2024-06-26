import java.util.ArrayList;
import java.util.List;

public class MainP17 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> lists= full(arr);
        System.out.println(lists.size()/3/2);
    }
    static List<List<Integer>> full(int[] arr) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        fullFunction(arr, ret, list, 0);
        return ret;
    }

    static void fullFunction(int[] arr, List<List<Integer>> ret, List<Integer> list, int start) {
        if (start == arr.length) {
            if (isMatch(list)) {
                ret.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = start; i < arr.length; i++) {
            swap(arr, start, i); // 将第一个元素与后续元素进行交换
            list.add(arr[start]); // 将交换后的第一个元素加入暂时确定部分
            fullFunction(arr, ret, list, start + 1); // 继续递归处理后续元素
            list.remove(list.size() - 1); // 回溯，将暂时确定部分中的最后一个元素移除
            swap(arr, start, i); // 恢复数组状态，进行下一轮交换
        }
    }
    static boolean isMatch(List<Integer> list) {
        int left = list.get(0)+list.get(1)+list.get(3)+list.get(5);
        int right = list.get(0)+list.get(2)+list.get(4)+list.get(8);
        int bottum = list.get(5)+list.get(6)+list.get(7)+list.get(8);
        return left==right && left==bottum;
    }
    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
