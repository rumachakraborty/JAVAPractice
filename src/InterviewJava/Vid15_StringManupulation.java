package InterviewJava;

public class Vid15_StringManupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="This is my java code";
System.out.println(str.length());
System.out.println(str.charAt(0));
System.out.println(str.charAt(19));
//System.out.println(str.charAt(39));//java.lang.StringIndexOutOfBoundsException
System.out.println(str.indexOf("m"));
System.out.println(str.indexOf("java"));
System.out.println(str.indexOf("hellow"));
System.out.println(str.indexOf("s"));//ist occurance of s
System.out.println(str.indexOf("s",4));//s want which in 2nd occourance
System.out.println(str.indexOf("s",4));//s want which in 2nd occourance

String mesg="welcome Admin";
if(mesg.indexOf("Admin")>0){
	System.out.println("pass");
}else{
	System.out.println("fail");
}
	}
	String mesg1="welcome null";{
	if(mesg1.indexOf("Admin")>0){
		System.out.println("pass");
	}else{
		System.out.println("fail");
	}
		}
}
