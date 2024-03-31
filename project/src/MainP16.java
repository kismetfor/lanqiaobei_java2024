import java.util.ArrayList;
import java.util.List;

public class MainP16 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> lists = bianli1(arr);
        System.out.println(lists.size()/3/2);
    }
    public static void main1(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> lists = bianli1(arr);
        for (List<Integer> list:
             lists) {
            System.out.println(list);
        }
    }
    static List<List<Integer>> bianli1(int[] arr) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        bianli(ret, arr, list, new boolean[arr.length]);
        return ret;
    }
    static void bianli(List<List<Integer>> ret, int[] arr, List<Integer> list, boolean[] isUsed) {
        if (list.size()== arr.length) {
            if (isMatch(list)) {
                ret.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!isUsed[i]) {
                list.add(arr[i]);
                isUsed[i] = true;
                bianli(ret, arr, list, isUsed);
                isUsed[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
    static boolean isMatch(List<Integer> list) {
        int left = list.get(0)+list.get(1)+list.get(3)+list.get(5);
        int right = list.get(0)+list.get(2)+list.get(4)+list.get(8);
        int bottum = list.get(5)+list.get(6)+list.get(7)+list.get(8);
        return left==right && left==bottum;
    }
}
