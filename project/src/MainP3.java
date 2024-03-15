public class MainP3 {
    /*
    解题耗时:23分钟
    内存:41388kb
    程序运行耗时:192ms
     */
    //https://www.lanqiao.cn/problems/676/learning/?page=3&first_category_id=1&second_category_id=3&tags=2015&sort=difficulty&asc=1
    public static void main(String[] args) {
        int ret = 0;
        for (long i = 1; i < 10000; i++) {
            if (isCube(i)) {
                ret++;
            }
        }
        System.out.println(ret);
    }
    static boolean isCube(long n) {
        String s = n+"";
        long cube = n*n*n;
        String cubeS = cube+"";
        return cubeS.endsWith(s);
    }
    public static void main1(String[] args) {
        int ret= 0;
        for (double i = 1; i < 10000; i++) {
            if (func(i)) {
                ret++;
            }
        }
        System.out.println(ret);
    }
    static boolean func(double n) {
        double a = n*n*n;
        return a%10==n;
    }
}
