package InterviewJava;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="ssss22222------$$$$$$$";
s1=s1.replaceAll("[^a-zA-Z0-9]", "");
System.out.println(s1);
	}

}
