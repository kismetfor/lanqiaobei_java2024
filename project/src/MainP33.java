import java.util.Scanner;

public class MainP33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n!=0) {
            System.out.print(n+" ");
            n /= 2;
        }
    }
}
