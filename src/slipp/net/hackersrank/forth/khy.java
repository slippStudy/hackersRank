import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    static HashMap<String, Integer> alphabetMap;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.valueOf(in.nextLine());

        for (int i = 0; i < n; i++) {
            alphabetMap = new HashMap<String, Integer>();

            String firstLine = in.next();
            String secondLine = in.next();

            if (isTwoLinesHasSameSubstring(firstLine, secondLine)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }

    private static boolean isTwoLinesHasSameSubstring(String firstLine, String secondLine) {
        generateAlphabetMapWithFirstLine(firstLine);

        return isSecondLineHasSameSubstring(secondLine);
    }

    private static boolean isSecondLineHasSameSubstring(String secondLine) {
        for (int i = 0; i < secondLine.length(); i++) {
            String letter = String.valueOf(secondLine.charAt(i));

            if (alphabetMap.containsKey(letter)) {
                return true;
            }
        }

        return false;
    }

    private static void generateAlphabetMapWithFirstLine(String firstLine) {
        for (int i = 0; i < firstLine.length(); i++) {
            String letter = String.valueOf(firstLine.charAt(i));

            if (alphabetMap.containsKey(letter)) {
                int numberOfLetter = alphabetMap.get(letter);
                numberOfLetter = +1;
                alphabetMap.put(letter, numberOfLetter);
            }
            else {
                alphabetMap.put(letter, 1);
            }
        }
    }
}
