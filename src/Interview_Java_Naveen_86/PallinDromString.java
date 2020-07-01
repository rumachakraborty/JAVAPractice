package Interview_Java_Naveen_86;

import java.util.Scanner;

public class PallinDromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//121 and pallindrome 121
		//120 and 021 its not pallindrome
		
	String rev="";
	System.out.println("Enter the String");
	Scanner sc=new Scanner(System.in);
	String original=sc.nextLine();
for(int i=original.length()-1;i>=0;i--){
	rev=rev+original.charAt(i);
}
if(original.equals(rev)){
	System.out.println(original + " and " + rev);
	System.out.println("Given String is palindrome");
}
else{
	System.out.println("Given String is not Palindrome");
}
}
}