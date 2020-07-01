package Interview_Java_Naveen_86;

import java.util.Scanner;

/*
 * https://www.youtube.com/watch?v=sj_Kdlm-o6E&lc=z23bdvzyrlahylduqacdp43bwcqt02sq32p44oz2fu1w03c010c
 * 
 */

public class SumOfNaturalNumbers {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum = 0;
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<=n;i++){
			sum=sum+i;
		}
		System.out.println("sum is: " +sum);
		System.out.println("------------------------------------------------------------");
		System.out.println("Now check with while loop how can get sum value");
		int k=1,sum1 = 0;
		while(k<=n){
			sum1=sum1+k;
			k++;
		}
		System.out.println("sum is: " +sum1);
	}

}
