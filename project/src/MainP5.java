public class MainP5 {

    /**
     * 解题耗时:31分钟
     * 内存:55652kb
     * 程序运行耗时:161ms
     * @param args
     */
    public static void main(String[] args) {
        int sum = 1;
        int surplus = sum;
        int i= 1;
        while (i < 6){
            if (i < 5) {
                if (surplus % 5 == i && surplus > 5) {
                    //关键在于隐藏条件 && surplus > 5 原因是猴子分五份不能每份都为0个香蕉
                    surplus -= ((surplus-i)/5 + i);
                    i++;
                } else {
                    i = 1;
                    sum++;
                    surplus = sum;
                }
            } else {
                if (surplus % 5 == 0) {
                    surplus -= ((surplus-i)/5 + i);
                    i++;
                } else {
                    i = 1;
                    sum++;
                    surplus = sum;
                }
            }

        }
        System.out.println(sum);
    }
}
