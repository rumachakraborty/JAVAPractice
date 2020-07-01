package Interview_Java_Naveen_86;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12;
		int rev=0;
		while(num!=0){
			int n=num%10;
			rev=rev*10+n;
			num=num/10;
			
			
		}
System.out.println("reverse num:" + rev);
	}

}
