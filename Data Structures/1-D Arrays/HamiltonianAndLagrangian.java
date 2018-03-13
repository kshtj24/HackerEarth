import java.util.Scanner;

class HamiltonianAndLagrangian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N;
        int[] n;
        Boolean TOF = false;
        N = in.nextInt();
        n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            int tempX = n[i];
            for (int j = i; j < N; j++) {
                if (tempX >= n[j]) {
                    TOF = true;
                } else {
                    TOF = false;
                    break;
                }
            }
            if (TOF == true) {
                System.out.print(tempX);
                System.out.print(" ");
                TOF = false;
            }
        }
    }
}