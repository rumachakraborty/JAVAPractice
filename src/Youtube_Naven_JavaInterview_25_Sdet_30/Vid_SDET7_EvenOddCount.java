package Youtube_Naven_JavaInterview_25_Sdet_30;

public class Vid_SDET7_EvenOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=123452;
int even_count=0;
int odd_count=0;
while(num>0){
	int rem=num%10;
	if(rem%2==0)
{
	//
		//System.out.println("number is even");	
	even_count++;
		}
	else{
		odd_count++;
	}
	num=num/10;
	
}

System.out.println("Numbers of even numbers are:" +even_count);
System.out.println("Numbers of odd numbers are:" +odd_count);

	}

}
