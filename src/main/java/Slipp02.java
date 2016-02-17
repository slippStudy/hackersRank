import java.util.*;

/**
 * Created by Developer on 2016. 2. 17..
 */
public class Slipp02 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        Map<Integer, Integer> value2Count = new HashMap<Integer, Integer>();
        Set<Integer> uniqueValueSet = new HashSet<Integer>();

        int max = 0;

        Deque<Integer> deque = new LinkedList<Integer>();
        for (int iCount = 0; iCount < n; iCount++) {

            int newValue = in.nextInt();

            Integer count;

            if (deque.size() == m) {
                if(newValue == deque.peekFirst()){
                    continue;
                }
                int removedValue = deque.removeFirst();
                count = value2Count.get(removedValue);
                if (count != null) {
                    count--;
                    value2Count.put(removedValue, count);
                    if (count == 0) {
                        uniqueValueSet.remove(removedValue);
                        value2Count.remove(removedValue);
                    }
                }
            }

            deque.addLast(newValue);

            Integer newCount = value2Count.get(newValue);
            if (newCount == null) {
                newCount = 0;
            }
            newCount++;

            uniqueValueSet.add(newValue);
            value2Count.put(newValue, newCount);

            int uniqueCount = uniqueValueSet.size();
            if (uniqueCount > max) {
                max = uniqueCount;
            }
        }

        System.out.println(max);
    }
}
