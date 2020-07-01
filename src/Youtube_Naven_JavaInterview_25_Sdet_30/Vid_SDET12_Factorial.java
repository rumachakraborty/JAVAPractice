package Youtube_Naven_JavaInterview_25_Sdet_30;

public class Vid_SDET12_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5!=5*4*3*2*1=120
		
		int num=15;
		long factorial=1;
		for(int i=1;i<=num;i++){
			factorial=factorial*i;
		}
		System.out.println("factorial:" +factorial);

	}

}
