import java.util.Scanner;

public class Slipp01 {
    static int R, C, r, c;
    static String G[], P[];

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int test_case = in.nextInt();
        for (int test = 0; test < test_case; test++) {

            R = in.nextInt();
            C = in.nextInt();
            G = new String[R];
            for (int G_i = 0; G_i < R; G_i++) {
                G[G_i] = in.next();
            }

            r = in.nextInt();
            c = in.nextInt();
            P = new String[r];
            for (int P_i = 0; P_i < r; P_i++) {
                P[P_i] = in.next();
            }
            if (isInSquare()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }


    }

    private static boolean isInSquare() {
        for (int chekRow = 0; chekRow <= R - r; chekRow++) {
            int firstFindCol = 0;
            while (true) {
                firstFindCol = G[chekRow].indexOf(P[0], firstFindCol + 1);
                if (firstFindCol == -1) break;

                if (isMatched(chekRow, firstFindCol))
                    return true;
            }
        }
        return false;
    }

    private static boolean isMatched(int chekRow, int firstFindCol) {
        for (int rCheckRow = 1; rCheckRow < r; rCheckRow++) {
            int nextFindCol = G[chekRow + rCheckRow].indexOf(P[rCheckRow], firstFindCol);
            if (nextFindCol == firstFindCol) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}