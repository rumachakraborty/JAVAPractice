package Vid17_Wrappe;

public class DataConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String x="100";
System.out.println(x+20);

//How to convert string to integer
int i=Integer.parseInt(x);
System.out.println(i+20);


String y="12.33";
System.out.println(y+100);


//Convert String to double

double d=Double.parseDouble(y);
System.out.println(d+100);

//String p="100A";
//System.out.print(p+100);


//int k=Integer.parseInt(p);
//System.out.println(k);//Exception in thread "main" java.lang.NumberFormatException:)

//How to remove A from 100A->using substring or replace no split



int m=100;
System.out.println(m+20);
//how integer to string convertion wil be there
String n=String.valueOf(m);
System.out.println(n+200);

	}

}
