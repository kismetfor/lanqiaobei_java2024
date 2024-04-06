public class MainP26 {
    //找规律
    //
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        for (int row = 1; row < 20; row++) {
            arr[row] = 3*row+1;
        }
        System.out.println(arr[2]);
        System.out.println(arr[3]);
    }
}
