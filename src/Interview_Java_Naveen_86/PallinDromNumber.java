package Interview_Java_Naveen_86;

public class PallinDromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//121 and pallindrome 121
		//120 and 021 its not pallindrome
		
		
		int num=128;
		int rev=0;
		int actualNumber=num;
		while(num!=0){
			int n=num%10;
			rev=rev*10+n;
			num=num/10;
			
		}
		System.out.println(rev);
		if(rev==actualNumber){
			System.out.println(actualNumber+ " is a PalindromeNumber");
		}else
			System.out.println(actualNumber+ " is not a PalindromeNumber");
				
	}

}
