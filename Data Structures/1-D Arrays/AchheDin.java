import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class AchheDin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = Integer.parseInt(s.nextLine());
        while (T-- > 0) {
            int N = s.nextInt();
            s.nextLine();
            Map<Integer, Integer> values = new HashMap<>();
            while (N-- > 0) {
                int temp = s.nextInt();
                if (!values.containsKey(temp))
                    values.put(temp, 1);
                else
                    values.put(temp, values.get(temp) + 1);
            }

            for (Map.Entry<Integer, Integer> entry : values.entrySet()) {
                if (entry.getValue().equals(1)) {
                    System.out.println(entry.getKey());
                    break;
                }
            }
        }
    }
}