package Youtube_Naven_JavaInterview_25_Sdet_30;

public class Vid_SDET10_Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,sum=0;
		System.out.print(n1+ " "+n2);
		for(int i=0;i<=10;i++){
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}

	}

}
