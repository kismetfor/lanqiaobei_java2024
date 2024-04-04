import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainP22 {

    //数字三角形
    static List<List<Integer>> explorePath(int[][] arr) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        explorePathFunc(arr, 0, 0, ret, list);
        return ret;
    }
    static void explorePathFunc(int[][] arr, int i, int j, List<List<Integer>> ret,
                                List<Integer> list) {
        if (i==arr.length) {
            ret.add(new ArrayList<>(list));

            return;
        }
        list.add(arr[i][j]);
        explorePathFunc(arr, i+1, j, ret, new ArrayList<>(list));

        explorePathFunc(arr, i+1, j+1, ret, new ArrayList<>(list));
    }

    public static void main(String[] args) {
        //输入
        int h;
        Scanner scanner = new Scanner(System.in);
        h = scanner.nextInt();
        int[][] arr = new int[h][h];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < i+1; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // 暴力遍历所有路径
        List<List<Integer>> paths = explorePath(arr);

        // 打印所有路径
        for (List<Integer> path : paths) {
            System.out.println("路径: " + path);
        }


        //输出
        /*for (int[] a:
             arr) {
            for (int x:
                 a) {
                System.out.print(x+" ");
            }
            System.out.println();
        }*/
    }
}
