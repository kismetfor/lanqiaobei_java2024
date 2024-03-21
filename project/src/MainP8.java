import java.util.ArrayList;

public class MainP8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        int n = 6;
        for (int i = 6; i < 99999; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        System.out.println(list.size());
        System.out.println(list.get(2022));
        System.out.println(17597);
    }
    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
}
