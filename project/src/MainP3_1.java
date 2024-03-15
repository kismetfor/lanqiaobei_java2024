public class MainP3_1 {
    /**
     * 解题耗时:16分钟
     * 内存:36984kb
     * 程序运行耗时:149ms
     * https://www.lanqiao.cn/problems/607/learning/?page=1&first_category_id=1&second_category_id=3&name=%E7%9F%A9%E5%BD%A2%E5%88%87%E5%89%B2
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(cut(2019, 324));
        System.out.println(cut(5, 3));
    }
    static int cut(int length, int width) {
        int ret = 0;
        while (true) {
            //刚好划分完的情况
            if (width==length) {
                return ++ret;
            }

            //长-宽 得到正方形 ret++;
            length -= width;
            ret++;


            //更新长宽 如果宽大于长 swap
            if (width > length) {
                int tmp = width;
                width = length;
                length = tmp;
            }
            //继续长-宽 ret++;
            //最后的终止条件是 得到1*n的矩形 划分为n个矩形 ret+=n;
        }
    }
}
