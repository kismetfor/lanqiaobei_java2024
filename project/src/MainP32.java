import java.util.Scanner;

public class MainP32 {
    public static void main(String[] args) {
//        10. 字符计数
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        scanner.close();

        int b = 0;
        int c = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                b++;
            } else {
                c++;
            }
        }
        System.out.println(b);
        System.out.println(c);
    }

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();

        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (Character.isUpperCase(ch)) {
                b++;
            } else if (Character.isLowerCase(ch)) {
                c++;
            } else if (Character.isDigit(ch)) {
                d++;
            }
        }

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
