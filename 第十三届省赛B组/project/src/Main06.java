import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[][] arr = new int[20][20];
//        for (int i = 0; i < 20; i++) {
//            for (int j = 0; j < 20; j++) {
//
//            }
//        }

        String[] strings = new String[20];
        for (int i = 0; i < 20; i++) {
            String a = scanner.nextLine();
            strings[i] = scanner.nextLine();
        }
        scanner.close();

        int max = 0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                int sum = 0;
                for (int k = 0; k < 5; k++) {
                    String sub = strings[i+k].substring(j, j+5);
                    for (int l = 0; l < 5; l++) {
                        sum += Character.getNumericValue(sub.charAt(l));
                    }
                }
                if (sum > max) max = sum;
            }
        }
        System.out.println(max);
    }
}
