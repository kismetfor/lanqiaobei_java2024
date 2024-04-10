public class Main01 {
    public static void main(String[] args) {
        System.out.println();
        int count = 0;

        long n = 1;
        while (count != 10) {
            if (check_2(n)&&check_8(n)&&check_10(n)&&
                    check_16(n)) {
                count++;
//                System.out.print(n+" ");
            }
//            if (count%10==0) System.out.println();
            n++;
        }
        System.out.println(n-1);

    }
    static boolean check_2(long num) {
        String s = Long.toString(num, 2);
        long mod = 0;
        for (int i = 0; i < s.length(); i++) {
            mod += Long.parseLong(String.valueOf(s.charAt(i)));
        }
        return num%mod==0;
    }
    static boolean check_8(long num) {
        String s = Long.toString(num, 8);
        long mod = 0;
        for (int i = 0; i < s.length(); i++) {
            mod += Long.parseLong(String.valueOf(s.charAt(i)));
        }
        return num%mod==0;
    }
    static boolean check_10(long num) {
        String s = Long.toString(num);
        long mod = 0;
        for (int i = 0; i < s.length(); i++) {
            mod += Long.parseLong(String.valueOf(s.charAt(i)));
        }
        return num%mod==0;
    }

    static boolean check_16(long num) {
        String s = Long.toString(num, 16);
        long mod = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch>='a' && ch<='z') {
                switch (ch) {
                    case 'a'-> mod+=10;
                    case 'b'-> mod+=11;
                    case 'c'-> mod+=12;
                    case 'd'-> mod+=13;
                    case 'e'-> mod+=14;
                    case 'f'-> mod+=15;
                }
            } else {
                mod += Long.parseLong(String.valueOf(ch));
            }

        }
        return num%mod==0;
    }

}
