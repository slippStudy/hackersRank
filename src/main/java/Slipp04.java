import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Diwali Lights
 * https://www.hackerrank.com/challenges/diwali-lights
 */
public class Slipp04 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();

        for (int j = 0; j < t; j++) {
            String firstString = in.nextLine();
            String secondString = in.nextLine();


            int secondLength = secondString.length();

            int size = firstString.length();
            if (size > secondLength) {
                size = secondLength;
            }

            boolean isNotEqual = true;
            for (int index = 0; index < size; index++) {
                if (firstString.charAt(index) == secondString.charAt(index)) {
                    System.out.println("YES");
                    isNotEqual = false;
                    break;
                }
            }
            if(isNotEqual) {
                System.out.println("NO");
            }
        }

    }
}