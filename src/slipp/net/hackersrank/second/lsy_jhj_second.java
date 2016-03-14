package slipp.net.hackersrank.second;

import java.util.*;

public class lsy_jhj_second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        Map map = new HashMap();
        int n = in.nextInt();
        int m = in.nextInt();
        int uniqueIntegerArray = 0;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);
            try {
                int temp = (int) map.get(num);
                map.remove(num);
                map.put(num, temp + 1);
            } catch (Exception e) {
                uniqueIntegerArray++;
                map.put(num, 1);
            }


            // subsequence is full
            if (i >= m) {
                int first = (int) deque.pollFirst();
                // map에 여러개 있으면
                int mapCount = (int) map.get(first);
                if (mapCount > 1) {
                    map.put(first, mapCount - 1);
                }
                // map에 한 개 밖에 없었으면
                else {
                    map.remove(first);
                    uniqueIntegerArray--;
                }
            }
            if (answer < uniqueIntegerArray)
                answer = uniqueIntegerArray;
        }
        System.out.println(answer);
    }
}