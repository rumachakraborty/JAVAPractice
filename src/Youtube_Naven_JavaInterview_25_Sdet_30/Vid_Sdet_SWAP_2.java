package Youtube_Naven_JavaInterview_25_Sdet_30;

public class Vid_Sdet_SWAP_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//without using 3rd variable
		//use + &  -
		
		int a=10;
		int b=20;
		System.out.println("Before swapping values are:" +a+ " " +b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("AFTER swapping values are:" +a+ " " +b);
		

	}

}
