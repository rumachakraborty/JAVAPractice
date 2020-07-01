package Interview_Java_Naveen_86;

import java.util.Scanner;

public class AddTwoNumbersScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter first number:");
		num1=sc.nextInt();
		System.out.println("Please enter 2nd number:");
		num2=sc.nextInt();
		sc.close();
		
sum=num1+num2;
System.out.println("sum of these numbers:" +sum);

	}

}
