package Interview_Java_Naveen_86;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read=new Scanner(System.in);
		System.out.println("please enter a number");
		int num=read.nextInt();
		if(num%2==0){
			System.out.println(num+ " is even");
		}
		else{
			System.out.println(num+ " is odd");
		}
		

	}

}
