package Youtube_Naven_JavaInterview_25_Sdet_30;

import java.util.Scanner;

public class Vid_SDET5_PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter any String");
		String str=sc.next();
		String org_str=str;
		String rev=" ";
		int len=str.length();
		for(int i=len-1;i>=0;i--){
			rev=rev+str.charAt(i);
			
		}
		System.out.println("reverse string is :" +rev);
		if(org_str.equals(rev)){
			System.out.println(org_str+ "is palindrom");
		}
		else{
			System.out.println(org_str+ "is not palindrom");
		}
		

	}

}
