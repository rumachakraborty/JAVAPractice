package Durga_NagoorBabu;

import java.util.Scanner;

public class EvnNumber {
	//When a number is divided by 2 and we get 0 is reminder then we say its even number

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number");
		int n=sc.nextInt();
		for(int i=1;i<=100;i++){
			if(i%2==0){
				System.out.println("The number is even =" +i);
			}
		}

	}

}
