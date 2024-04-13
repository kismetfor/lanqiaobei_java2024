import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
//今天蓝桥杯 写出来第一题第二题第三题 就是不知道对不对 代码有没有提交上
//明天开始看课 一天两道算法题
		}
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int z=0;z<t;z++){
            int n=sc.nextInt();
            int num1=0,num0=0;
            for (int i=0;i<n;i++){
                if (sc.nextInt() %2 ==0){
                    num0++;
                }else{
                    num1++;
                }
            }
            long ans=0;
            for (int i=0;i<=n;i++){
                for (int j=0;j<=num1 && j<=i;j+=2){
                    if ((num1-j) % 2==0 && (i-j)<=num0){
                        ans+=combination(num1,j)*combination(num0,i-j);
                        ans %= 1000000007;
                    }
                }
            }
            System.out.println(ans);
        }


    }
    private static long combination(int down,int up){
        if (up>down/2){
            up=down-up;
        }
        int fenzi=1;
        int fenmu=1;
        for (int i=0;i<up;i++){
            fenzi*=down;
            down--;
        }
        for (int i=1;i<=up;i++){
            fenmu*=i;
        }

        return (fenzi/fenmu)%1000000007;
    }
}