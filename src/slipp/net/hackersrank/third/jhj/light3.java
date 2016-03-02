package net.slipp.hr;

import java.math.BigInteger;
import java.util.Scanner;

public class light3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		BigInteger p = BigInteger.valueOf(2), m = BigInteger.valueOf(100000), u = BigInteger.valueOf(1);
		for(int i = 0; i<T; i++){
			System.out.println(p.modPow(in.nextBigInteger(), m).subtract(u));
		}
	}
}
