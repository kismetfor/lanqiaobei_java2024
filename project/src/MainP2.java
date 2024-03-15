import java.util.Scanner;

public class MainP2 {
    public static void main(String[] args) {
        /*
        内存:43808kb
        程序运行耗时:203ms
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = 0;
        for (int i = 1; i <= n; i++) {
            //将数字转成字符串
            String s = i + "";
            //将字符串转成字符数组
            char[] a = s.toCharArray();
            for (int j = 0; j < a.length; j++) {
                if (a[j]=='2'||a[j]=='0'||a[j]=='1'||a[j]=='9') {
                    ret += i;
                    break;
                }
            }
        }
        System.out.println(ret);
    }
    //https://www.acwing.com/problem/content/description/1247/
    //https://www.lanqiao.cn/problems/191/learning/?page=1&first_category_id=1&second_category_id=3&name=%E7%89%B9%E5%88%AB%E6%95%B0%E7%9A%84%E5%92%8C
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ret = 0;
        for (int i = 1; i <= n; i++) {
            if (fun(i)) {
                ret += i;
            }
        }
        System.out.println(ret);
        /*内存:59132kb
        程序运行耗时:178ms*/
    }
    public static boolean fun(int n) {
        //是否包含2019
        while (n!=0) {
            int d = n%10;
            if (d==2||d==0||d==1||d==9) {
                return true;
            }
            n /= 10;
        }
        return false;
    }
}
