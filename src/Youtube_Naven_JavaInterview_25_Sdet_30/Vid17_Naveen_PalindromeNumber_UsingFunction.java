package Youtube_Naven_JavaInterview_25_Sdet_30;

public class Vid17_Naveen_PalindromeNumber_UsingFunction {
	
	//121---->palindrom 121
	//122-->221->its not palindrome
	
	public static void isPalindromeNumber(int num){
		System.out.println("Given number is :" +num);
		int r=0;
		int rev=0;
		
	while(num>0){
		r=num%10;  //reminder
		rev=(rev*10)+r;
		num=num/10;
	}
	
	if(num==rev){
		System.out.println("palindrom number");
	}else{
		System.out.println("Not palindrom Number");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindromeNumber(123);
		
	}

}
