public class MainP12 {

    /**
     * 解题耗时:25分钟
     * 内存:37308kb
     * 程序运行耗时:141ms
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print(snakeNumber(i)+" ");
        }
        System.out.println();
        System.out.println(snakeNumber(19));
    }
    static int snakeNumber(int row) {
      //1 + 4
      //5 + 8
        int ad = 4;
        int ret = 1;
        for (int i = 0; i < row; i++) {
            ret += ad;
            ad += 4;
        }
        return ret;
    }
}
