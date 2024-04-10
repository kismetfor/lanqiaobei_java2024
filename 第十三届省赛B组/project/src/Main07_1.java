import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main07_1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    static LinkedList<Integer> list = new LinkedList<>();
    public static void main(String[] args) throws IOException {
//        int a = Integer.parseInt(br.readLine());
        //切割集合
        int[] a = {1,3,2,4};
        dfs(a, 0);
    }
    static void dfs(int[] a, int startIndex) {
        int n = a.length;
        if (startIndex == n) {
            System.out.println(list);
            return;
        }
        for (int i = startIndex; i < n; i++) {
            list.add(a[i]);
            dfs(a, i+1);
            list.removeLast();
        }
    }
}
