package Youtube_Naven_JavaInterview_25_Sdet_30;

public class VidSdet8_CountSumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12341;
		int sum=0;
		while(num>0){
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		System.out.println("Sum of digit:" +sum);
		

	}

}
