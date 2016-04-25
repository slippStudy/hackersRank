import java.util.Scanner;

/**
 * Created by jehanjae on 2016. 4. 20..
 */
public class CoinChange {
    static int[] coins = new int[50];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        for( int i = 0 ; i < M ; i ++ ){
            coins[i] = in.nextInt();
        }
        // 입력 받기

        long[][] D = new long[251][50];
        D[0][0] = 1;
        int Coin = coins[0];
        for( int n = 0 ; n <= N ; n ++ ){
            if( n < Coin ) continue;
            D[n][0] = D[n-Coin][0];
        }
        for( int m = 1 ; m < M ; m ++ ){
            Coin = coins[m];
            for( int n = 0 ; n <= N ; n ++ ) {
                if (n < Coin) {
                    D[n][m] = D[n][m - 1];
                }
                else {
                    D[n][m] = D[n][m - 1] + D[n - Coin][m];
                }
            }
        }
        System.out.println(D[N][M-1]);
        // System.out.println("rec : " + recursive(N, M-1));
    }

    static int recursive(int N, int M){
        System.out.println("N : " + N + " M : " + (M+1));
        if( N < 0 || M <= -1 ) return 0;
        if( N == 0 && M == -1 ) return 1;

        return recursive(N, M-1) + recursive(N - coins[M], M);
    }
}





