package net.slipp.hr;

import java.util.Scanner;

public class lights2 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		//get max int
		int mInt=0; //최대값
		int brInt[] = new int[T]; //입력값
		for(int m=0; m<T; m++){
			brInt[m] = sc.nextInt();
			if(brInt[m]>mInt) mInt = brInt[m]; 
		}
		
		int arInt[] = new int[mInt+1];
		arInt[1] = 2;
		
		//Ans(i) = 2^i Mod 100000 = Ans(i-1)*2 Mod 100000
		for(int i=2;i<=mInt;i++){
			arInt[i] = (arInt[i-1]*2)%100000;
		}
		
		for(int t=0; t < T; t++){
			System.out.println(arInt[brInt[t]]-1);
		}
	}
}
