package InterviewJava;

import java.util.Scanner;

public class ReverseNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please eneter a number:");
		int num=sc.nextInt();
		//1. using algorithm reverse a number
		
	int rev=0;
	while(num!=0){
		rev=rev*10+num%10; //0+1234%10=4
		num=num/10; //1234/10=123
		
	}
	System.out.println("Reverse Number is:"+rev);

	}

}
