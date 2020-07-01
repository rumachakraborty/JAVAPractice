package Youtube_Naven_JavaInterview_25_Sdet_30;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Vid17_sdet_5_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number");
		int num=sc.nextInt();
		int orig_num=num;
		
		
		int rev=0;
		while(orig_num!=0){
			
			rev=rev*10+orig_num%10;
			orig_num=orig_num/10;
			
		}
		System.out.println("Reverse number is:" +rev);
		if(orig_num==rev){
			System.out.println(orig_num+" is palindrome");
		}else{
			System.out.println(orig_num+ "is not palindrome");
		}
	}

}
