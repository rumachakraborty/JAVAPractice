package Interview_Java_Naveen_86;

public class SwapNumberWithOutTmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("before swaping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		System.out.println("after swaping");
		
		
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("a="+a);
		System.out.println("b="+b);


	}

}
