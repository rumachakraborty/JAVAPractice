package InterviewJava;

import java.util.Scanner;

public class ReverseNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please eneter a number:");
		int num=sc.nextInt();
		//Using StringBuffer
		
		StringBuffer rev;
		StringBuffer sb=new StringBuffer(String.valueOf(num));//convert number into string format
		rev=sb.reverse();
		
	System.out.println("Reverse Number is:"+rev);

	}

}
