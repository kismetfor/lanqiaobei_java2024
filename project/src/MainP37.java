public class MainP37 {
    public static void main(String[] args) {
        int week = 6; //周几
        int month = 1;
        int year = 2000;
        int day = 1;
        int result = 0;

        int[] m = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        while (!(year==2020&&month==10&&day==1)) {
            result++;
            if (week == 1 || day==1) {
                result++;
            }
            //更新week
            week = (week+1)%8;
            if (week==0) {
                week = 1;
            }


            //更新day
            if (day++ == m[month-1]) {
                day = 1;
                //更新month
                if (month == 12) {
                    month = 1;
                    //更新year
                    year++;
                    if (isLeap(year)) {
                        m[1] = 29;
                    } else {
                        m[1] = 28;
                    }
                } else {
                    month++;
                }
            }
        }
        result+=2;
        System.out.println(result);
    }
    static boolean isLeap(int year) {
        return ((year%4==0&&year%100!=0)||(year%400==0));
    }
}
