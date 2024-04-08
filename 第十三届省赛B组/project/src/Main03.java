import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] chars = s.toCharArray();

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        scanner.close();

        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                int a = map.get(ch);
                map.remove(ch);
                map.put(ch, a+1);
                if (a+1 > max) max = a+1;
            }
        }

        int[] usedTimes = new int[map.size()];
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                int a = map.get(chars[i]);
                if (a == max) {
                    System.out.print(chars[i]);
                }

            }
        }

    }
}
