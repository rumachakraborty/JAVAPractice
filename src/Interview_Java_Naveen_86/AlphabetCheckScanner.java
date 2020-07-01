package Interview_Java_Naveen_86;

import java.util.Scanner;

public class AlphabetCheckScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a alphabet");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if((ch>='b' && ch<='z')||(ch>='A' && ch<='Z')){
			System.out.println("The given char is Alphabet");
		}
		else{
			System.out.println("The given char is not an Alphabet");
		}
	}

}
