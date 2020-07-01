package Interview_Java_KrishnaSandeep_86;

import java.util.Scanner;

public class Vid_2_Larget3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Please enter first number");
int n1=sc.nextInt();
System.out.println("Please enter 2nd number");
int n2=sc.nextInt();
System.out.println("Please enter 3rd number");
int n3=sc.nextInt();


if(n1>n2 && n1>n3){
	System.out.println("ist number is largest");
}
else if(n2>n3 && n2>n1){
	System.out.println("2nd number is greatest");
}

else if(n3>n1 && n3>n2)
{
	System.out.println("3rd is larget");
}else{
	System.out.println("none of the numbers are largest");
}
	
	}

}
