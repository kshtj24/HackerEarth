import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class BiasedChandan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> entries = new Stack<>();
        while (N-- > 0) {
            int entry = Integer.parseInt(br.readLine());
            if (entry == 0)
                entries.pop();
            else
                entries.push(entry);
        }
        int sum = 0;
        for (int i : entries) {
            sum += i;
        }

        System.out.println(sum);
    }
}