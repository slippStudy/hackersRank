package slipp.net.hackersrank.third.kdk;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * <p>This class is a solve of the
 * <a href="https://www.hackerrank.com/challenges/diwali-lights">
 * DiwaliLights</a>.
 *
 * @author Daekwon Kang
 * @author Munsu Kim
 * @see IntStream
 * @see BigInteger
 * @since 2016-03-02
 */
public class DiwaliLights {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int M = 100000; // 17 bits

        IntStream
                .range(0, T)
                .forEach(value -> {
                    long N = in.nextInt();
                    long res = 1;
                    while (N > 0) {
                        if (N > 46) {
                            res <<= 46;
                            N -= 46;
                        } else {
                            res <<= N;
                            N = 0;
                        }
                        res %= M;
                    }
                    System.out.println(res - 1);
                });
    }
}
