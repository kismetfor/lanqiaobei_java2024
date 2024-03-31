import java.util.ArrayList;
import java.util.List;

public class MainP15_01 {
    //全排列
    //1 2 3
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> lists = full(arr);
        for (List<Integer> list:
                lists) {
            System.out.print(list+" ");
        }
    }
    static List<List<Integer>> full(int[] arr) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        fullFunc(ret, list, new boolean[arr.length], arr);
        return ret;
    }
    static void fullFunc(List<List<Integer>> ret, List<Integer> list,
                                        boolean[] isUsed, int[] arr) {
        //是否装满一个组合了
        if (list.size() == arr.length) {
            ret.add(new ArrayList<>(list));
        }
        for (int i = 0; i < isUsed.length; i++) {
            if (!isUsed[i]) { //没用过


                //使用
                list.add(arr[i]);
                //标记用过了
                isUsed[i] = true;
                //下一层
                fullFunc(ret, list, isUsed, arr);
                //不用了
                isUsed[i] = false;
                list.remove(list.size()-1);

            }
        }

    }
}
