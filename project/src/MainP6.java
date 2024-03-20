import java.util.HashSet;

public class MainP6 {
    /**
     * 内存:37272kb
     * 程序运行耗时:117ms
     * @param args
     */
    public static void main(String[] args) {
//        String s = "aaab";
        String s = "0100110001010001";
        System.out.println(distinctSubstring(s));
    }
    static int distinctSubstring(String s) {
        int n = s.length();
        HashSet<String> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int ret = 0;
        while (left < n) {
            while (right < n) {
                String sub = s.substring(left, right+1);
                if (!set.contains(sub)) {
//                    System.out.print(sub+" ");
                    set.add(sub);
                    ret++;
                }
                right++;
            }
            left++;right=left;
        }
        return ret;
    }
}
