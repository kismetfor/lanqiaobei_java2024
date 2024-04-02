public class MainP19 {
    /*
    一只青蛙，可以一次跳上1级台阶，也可以一次跳上2级台阶。求这只青蛙跳10级台阶有多少种跳法？
分析：
- 要跳到第10级台阶，要么从第8级台阶，跳2级到第10级。要么从第9级跳1步到第十级。
- 要跳到第9级：可以从第8级跳1步到达，也可以从第7级跳两步到达。
- 要跳到第8级：可以从第7级跳1步到达，也可以从第6级跳两步到达。
- ............
     */
    public static void main(String[] args) {
        int n = 10;
        int ways = method(n);
        System.out.println("青蛙跳上 " + n + " 级台阶的方法数为: " + ways);
    }

    static int method(int n) {
        if (n <= 2) {
            return 2;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
