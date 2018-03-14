import java.util.*;

class MostFrequent {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        List<Integer> l = new ArrayList<Integer>();
        List<Integer> freq = new ArrayList<Integer>();
        String[] temp = input.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            l.add(Integer.parseInt(temp[i]));
            freq.add(Collections.frequency(l, l.get(i)));
        }
        int value = freq.get(0);
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (freq.get(i) >= value) {
                if (freq.get(i) > value) {
                    value = freq.get(i);
                    index = i;
                } else {
                    if (l.get(index) > l.get(i)) {
                        value = freq.get(i);
                        index = i;
                    }
                }
            }
        }
        System.out.println(l.get(index));
    }
}