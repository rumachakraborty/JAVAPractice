package Youtube_Naven_JavaInterview_25_Sdet_30;

public class Vid_SDET2_StringIntReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1243;
		int rev=0;
		while(num!=0){
			rev=rev*10+num%10;   
					
			num=num/10; 
			//System.out.println("Reverse is:" +rev);
			System.out.println("Reverse is:" +rev);
		}
		System.out.println("Reverse is:" +rev);
		

	}

}
