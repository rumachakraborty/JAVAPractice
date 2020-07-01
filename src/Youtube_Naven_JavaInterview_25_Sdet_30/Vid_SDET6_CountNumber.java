package Youtube_Naven_JavaInterview_25_Sdet_30;

public class Vid_SDET6_CountNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=1234;
int count=0;

while(num>0){
	
	num=num/10;
	
	count++;
	
	System.out.println("Number of digits:"+count);
}
System.out.println("Number of digits:"+count);
	}

}
