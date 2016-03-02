package net.slipp.hr;

import java.util.Scanner;

public class lights {
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arInt[] = new int[10000];
		
		arInt[0] = 1;
		arInt[1] = 2;
		
		//Ans(i) = 2^i Mod 100000 = Ans(i-1)*2 Mod 100000
		for(int i=2;i<10000;i++){
			arInt[i] = (arInt[i-1]*2)%100000;
		}
		
		for(int t=0; t < T; t++){
			System.out.println(arInt[sc.nextInt()]-1);
		}
	}
}
