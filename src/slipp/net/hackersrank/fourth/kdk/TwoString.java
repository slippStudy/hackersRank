package slipp.net.hackersrank.fourth.kdk;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <p>This class is a solve of the
 * <a href="https://www.hackerrank.com/challenges/two-strings">
 * Two Strings</a>.
 *
 * @author Daekwon Kang
 * @see Set
 * @see HashSet
 * @since 2016-03-16
 */
public class TwoString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            String result = "NO";
            String A = in.next();
            String B = in.next();

            final Set<String> setA = new HashSet<String>();
            for (int j = 0; j < A.length(); j++) {
                setA.add(String.valueOf(A.charAt(j)));
            }

            for (int j = 0; j < B.length(); j++) {
                if (setA.contains(String.valueOf(B.charAt(j)))) {
                    result = "YES";
                    break;
                }
            }

            System.out.println(result);
        }
    }
}
