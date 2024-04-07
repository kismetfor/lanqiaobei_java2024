import java.math.BigInteger;

public class MainP30 {
    public static void main(String[] args) {
        Test1();
        Test2();
        Test3();
    }
    public static void Test() {
        int a = 10000;
        int b = 0;
        int flag = -1;
        while (true) {
            if (a < 600 && flag==-1) break;
            if (flag==-1) {
                a -= 600;
            } else {
                a += 300;
            }
            flag  *= -1;
            b++;
        }
        System.out.println(b*60+a/600*60);
    }
    public static void Test3() {
        int energy=10000;
        boolean isRun=true;

        int sec=0;
        int min=0;

        while(true) {
            if(energy<600&&isRun) break;
            if(isRun) {
                energy-=600;
                isRun=false;
                min++;
            }else {
                energy+=300;
                isRun=true;
                min++;
            }
        }

        sec=min*60+energy/10;

        System.out.println(sec);

    }


    public static void Test2() {
        int energy = 10000; // 初始体力值
        int minute = 0; // 跑步/休息的分钟数

        while (energy > 0) {
            if (minute % 2 == 0) { // 偶数分钟跑步
                energy -= 600; // 每分钟损耗600的体力
            } else { // 奇数分钟休息
                energy += 300; // 每分钟增加300的体力
            }
            minute++; // 时间递增
        }

        int seconds = minute * 60; // 将分钟转换为秒
        System.out.println("小明停止锻炼的时间（秒）：" + (seconds+energy/10));
        System.out.println(energy);
    }
    public static void Test1() {
//        BigInteger a = new BigInteger("10000"); //体力
        int a = 10000; //体力
        int flag = -1; //flag<0跑步 大于0休息
        int b = 0; //跑步时间
        while (a >= 600 ) {
            if (flag == -1) {
                //跑步
                a -= 600;
            } else {
                //休息
                a += 300;
            }
            flag *= -1;
            b += 60;
        }
        System.out.println(b);
        System.out.println(a);
        System.out.println(flag);

        a += 300;
        b += ((a)/600)*60;
        a -= 600;
        System.out.println(b + a/10);
        //b += (x/600)*60 --> x/10
    }
}
