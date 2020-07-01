package InterviewJava;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Arindam";
		int len=s.length();
		System.out.println(len);
		String rev="";
		
		for(int i=len-1;i>=0;i--){
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
	}

	

}
