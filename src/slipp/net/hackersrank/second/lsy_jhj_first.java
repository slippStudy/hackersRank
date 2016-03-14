package slipp.net.hackersrank.second;

import java.util.*;

public class lsy_jhj_first {
    static int n, m;
    static int uniqueIntegerCount = 0;
    static int answer = 0;
    static int[] cnt = new int[10000001];
    static Deque deque = new ArrayDeque<>();

    static void insert(int num) {
        deque.addLast(num);
        cnt[num]++;

        if (cnt[num] == 1)
            uniqueIntegerCount++;
    }

    static void remove(int index) {
        // if Subsequence does not fulled.
        if (index < m) return;

        int num = (int) deque.pollFirst();
        cnt[num]--;
        if (cnt[num] == 0)
            uniqueIntegerCount--;
    }

    static void update() {
        if (answer < uniqueIntegerCount)
            answer = uniqueIntegerCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            insert(num);
            remove(i);
            update();
        }

        System.out.println(answer);
    }
}