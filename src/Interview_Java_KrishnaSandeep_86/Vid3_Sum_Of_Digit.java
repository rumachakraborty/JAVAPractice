package Interview_Java_KrishnaSandeep_86;

public class Vid3_Sum_Of_Digit {
//https://www.youtube.com/watch?v=0Gc6qjw6PdY&list=PLF9tovyahfL020hGgLIsRMZY4bfSLCFUa&index=4&t=0s
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=134;
		int sum=0;int digit=0;
		while(num>0){
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		
System.out.println("Sum of digits of numbers="+sum);
	}

}
