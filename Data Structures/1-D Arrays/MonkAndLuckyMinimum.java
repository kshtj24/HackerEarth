import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class MonkAndLuckyMinimum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = convertAll(br.readLine().split(" "));

            System.out.println(findMinAndCheckFreq(arr));
        }
    }

    static String findMinAndCheckFreq(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            min = i < min ? i : min;
        }
        int XORed = 0;
        for (int i : arr) {
            if (i == min)
                XORed ^= i;
        }

        return XORed == 0 ? "Unlucky" : "Lucky";
    }

    static int[] convertAll(String[] arr) {
        int[] returnable = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            returnable[i] = Integer.parseInt(arr[i]);
        }

        return returnable;
    }
}