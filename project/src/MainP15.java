import java.util.ArrayList;
import java.util.List;

public class MainP15 {
    /**
     * 题目：输入[1,2,3]
     * 输出1,2,3所有的不重复的排列组合：
     * 1 ,2,3    1,3,2
     * 2,1,3   2,3,1
     * 3,1,2   3,2,1
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> lists = new ArrayList<>();
        backtrack(lists, arr);
        for (List<Integer> list:
             lists) {
            System.out.print(list+" ");
        }
    }
    static void backtrack(List<List<Integer>> lists, int[] arr) {
        List<Integer> list = new ArrayList<>();
        boolean[] isUsed = new boolean[arr.length]; //默认是false 没用的就是false 用了的就是true
        track(lists, list, arr, isUsed);
    }
    static void track(List<List<Integer>> lists, List<Integer> list, int[] arr, boolean[] used) {
        if (list.size()== arr.length) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                list.add(arr[i]);
                used[i] = true;
                track(lists, list, arr, used);
                used[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
}
