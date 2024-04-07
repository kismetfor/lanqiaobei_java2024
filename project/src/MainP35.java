import java.util.Scanner;

public class MainP35 {
    public static void main(String[] args) {
        char[] map = {'3', 'A', 'B', 'C', 'D',
                'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
                'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
                'V', 'W', 'X', 'Y', 'Z'};
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {

            if (i+2 < a.length()) {
                //不是最后几位 不然会越界
                String s = a.substring(i, i+2);
                i = getI(map, a, result, i, s);
            } else {
                //此时无关奇数偶数 只有最后两位
                String s = a.substring(i);
                i = getI(map, a, result, i, s);
            }
        }
        System.out.println(result);

    }

    private static int getI(char[] map, String a, StringBuilder result, int i, String s) {
        int num = Integer.parseInt(s);
        if (num > 27) {
            //两位数大了变成一位数
            s = a.substring(i, i+1);
            num = Integer.parseInt(s);
            result.append(map[num]);
        } else {
            result.append(map[num]);
            //补上多走的i
            i++;
        }
        return i;
    }

    public static void main1(String[] args) {
        //用数组模拟Map 注意0下标 不用0下标
        char[] map = {'3', 'A', 'B', 'C', 'D',
                'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
                'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
                'V', 'W', 'X', 'Y', 'Z'};
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length(); ) {
            String s = a.substring(i, i+2);
            int num = Integer.parseInt(s);
            if (num > 27) {
                s = a.substring(i, i+1);
                num = Integer.parseInt(s);
                i++;
            } else {
                if (i < a.length()-1) {
                    i+=2;
                } else {
                    i++;
                }
            }
            System.out.println(num);
            result.append(map[num]);
        }
        System.out.println(result);


        /*//奇数剩下一位单独处理 偶数还是正常用完
        if (a.length()%2!=0) {
            String s = a.substring(a.length()-1);
            System.out.println(s);
        }*/


    }
}
