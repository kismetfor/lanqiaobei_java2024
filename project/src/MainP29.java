import java.util.HashMap;

public class MainP29 {
    public static void main(String[] args) {
        String c="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWxYz";
        String Tc="yxmdacikntjhqlgoufszpwbrevYXMDACIKNTJHQLGOUFSZPWBREV";
        String x="EaFnjISpThFviDhwFbEjRjfIBkRyY";

        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < c.length(); i++) {
            map.put(Tc.charAt(i), c.charAt(i));
        }

        StringBuilder val = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            val.append(map.get(x.charAt(i)));
        }
        System.out.println(val);
    }
}
