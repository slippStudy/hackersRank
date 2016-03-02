import java.math.BigDecimal;
import java.util.*;

/**
 * Diwali Lights
 * https://www.hackerrank.com/challenges/diwali-lights
 */
public class Slipp03 {


    public static final BigDecimal VALUE_100000 = new BigDecimal("100000");
    public static final BigDecimal VALUE_1 = new BigDecimal("1");
    public static final BigDecimal VALUE_2 = new BigDecimal("2");

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int j = 0; j < t; j++) {
            int n = in.nextInt();
//            int result = solve1(n);
            //int result = solve2(n);
            int result = (int) solve3(n);

            System.out.println(result);
        }

    }

    private static int solve1(int n) {
        return VALUE_2.pow(n).subtract(VALUE_1).remainder(VALUE_100000).intValue();
    }


    private static int solve2(int n) {
        if (n == 1) {
            return 1;
        }
        int result = 2 * (solve2(n - 1) + 1) - 1;
        // n = 1
        // result = 1

        // n = 2
        // result = 2 * (1+1)-1) = 3

        // n = 3
        // result = 2 * (3 + 1) - 1 = 7

        // n = 4
        // result = 2 * (7 + 1) - 1 = 15


        if (result > 100000) {
            result = result % 100000;
        }
        return result;
    }

    private static Map<Integer, Long> resultCache = new HashMap();

    private static long solve3(int n) {
        if (n == 1) {
            return 1;
        }
        Long result = resultCache.get(n);
        if (result != null) {
            return result;
        }

        int first = n / 2;
        int second = n - first;

        result
                = (
                (solve3(first) + 1)
                        * (solve3(second) + 1
                ) - 1L) % 100000;

        resultCache.put(n, result);

        return result;
    }
}
