import java.util.HashSet;
import java.util.stream.Stream;

public class MainP7 {
    /***
     * 解题耗时:45分钟
     * 内存:35868kb
     * 程序运行耗时:389ms
     * @param args
     */
    public static void main(String[] args) {
        int n = 66;
        while (!magicNums(n)) {
            n++;
        }
        System.out.println(n);
    }
    static boolean magicNums(int n) {
        long square = (long) n *n;
        long cube = (long) n*n*n;
        String str = square+""+cube;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!set.contains(str.charAt(i))) {
                set.add(str.charAt(i));
            } else {
                return false;
            }
        }
        return set.size()==10;
    }
}
