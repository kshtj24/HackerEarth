import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class MonkAndThePowerOfTime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> callingOrder = addElementsToQueue(br.readLine().split(" "));
        Queue<Integer> idealOrder = addElementsToQueue(br.readLine().split(" "));
        int timeUnits = 0;
        while(!callingOrder.isEmpty()){
            while(!callingOrder.peek().equals(idealOrder.peek())){
                callingOrder.add(callingOrder.remove());
                timeUnits++;
            }
            callingOrder.remove();
            idealOrder.remove();
            timeUnits++;
        }

        System.out.print(timeUnits);
    }

    private static Queue<Integer> addElementsToQueue(String[] arr) {
        Queue<Integer> returnable = new LinkedList<>();
        for (String s : arr) {
            returnable.add(Integer.parseInt(s));
        }

        return returnable;
    }
}