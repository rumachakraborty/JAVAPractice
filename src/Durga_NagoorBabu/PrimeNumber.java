package Durga_NagoorBabu;

import java.util.Scanner;

public class PrimeNumber {
	//Number is divisible by 1 and itself is called prime number
	
	
	
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
