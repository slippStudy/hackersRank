import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;

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
