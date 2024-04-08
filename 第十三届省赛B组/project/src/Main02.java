import java.math.BigInteger;

public class Main02 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 2022; i <= 2022222022; i++) {
            if(isMountain1(i)) {
                result++;
            }
        }
        System.out.println(result);
    }
    public static void main1(String[] args) {
        int a = 2022222022;
        int b = 123565321;
        int c = 145541;
        System.out.println(isMountain1(b));
        System.out.println(isMountain1(c));
        System.out.println(isMountain1(123515321));
    }
    static boolean isMountain(int a) {
        StringBuilder s = new StringBuilder(a);
        return false;
    }
    static boolean isMountain1(int a) {
        String s = String.valueOf(a);
        int left = 0;
        int right = s.length()-1;
        //判断是否回文
        for (left = 0; left < s.length()/2; left++, right--) {
            if (s.charAt(left)!=s.charAt(right)) {
                return false;
            }
        }

        //回文判断完了 如果是的话 只判断一边是不是单调不减就行了
        String sub = s.substring(0, s.length()/2);
        int num = Integer.parseInt(sub);
        int[] digits = new int[s.length() / 2];
        for (int i = 0; i < s.length() / 2; i++) {
            digits[i] = num%10;
            num /= 10;
        }
        //取出来是反的 5 3 2 1
        for (int i = 1; i < s.length() / 2; i++) {
            if (digits[i-1] < digits[i]) {
                return false;
            }
        }
        //写到这里突然反应过来 reverse就行了!!!
        if (s.length()%2!=0) { //奇数情况
//            中间留下来那一位必须比nums最后一个大
            sub = s.substring(s.length()/2, s.length()/2+1);
            int c = Integer.parseInt(sub);
            return c >= digits[0];
        } else { //偶数情况
            return true;
        }
    }
}
