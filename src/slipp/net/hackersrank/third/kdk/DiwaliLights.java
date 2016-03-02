import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * <p>This class is a solve of the
 * <a href="https://www.hackerrank.com/challenges/diwali-lights">
 * DiwaliLights</a>.
 *
 * @see     IntStream
 * @see     BigInteger
 * @author  Daekwon Kang
 * @author  Munsu Kim
 * @since   JDK1.8
 * @since   2016-03-02
 */
public class DiwaliLights {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        IntStream
                .range(0, n)
                .forEach(value -> {
                    final int t = in.nextInt();
                    final int result = getCaseCount(t);
                    System.out.println(result);
                });
    }

    private static int getCaseCount(int inputNum) {
        final BigInteger rtv = BigInteger.valueOf(2).pow(inputNum).subtract(BigInteger.ONE);
        return rtv.mod(BigInteger.valueOf(100000)).intValue();
    }
}
