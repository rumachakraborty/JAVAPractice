package Youtube_Naven_JavaInterview_25_Sdet_30;

public class Vid_SDET11_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=20;
		int count=0;
		if(num>1){
			for(int i=1;i<=num;i++){
				if(num%i==0)
					count++;
			}
				if(count==2)
				{
					System.out.println("prime number");
				}
				else{
					System.out.println("Not a prime number");
				}
			
		}
			else{
				System.out.println("not a prime");
			}
			
		}

	}



