public class MainP4 {

    /**
     * 解题耗时:13分钟
     * 内存:37240kb
     * 程序运行耗时:136ms
     * @param args
     */
    public static void main(String[] args) {
        int[] a = new int[500];
        int sum = 0;
        int i = 0;
        //第一天
        a[i] = 1;
        while (sum < 108) {
            //加上今天的钱
            sum += a[i];
            //算出明天的钱
            a[++i] = a[i-1] + 2;
        }
        System.out.println(i);
    }
}
