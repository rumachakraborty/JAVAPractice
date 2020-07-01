package Interview_Java_Naveen_86;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1234->4
		//123->3
		long num=12345678;
		int count=0;
		while(num !=0){
			num=num/10;
			count++;
		}
System.out.println("number of digits: " +count);
	}

}
