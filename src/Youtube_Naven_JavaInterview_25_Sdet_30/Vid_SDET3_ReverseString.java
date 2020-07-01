package Youtube_Naven_JavaInterview_25_Sdet_30;

public class Vid_SDET3_ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stubIndi
		String s="India";
		String rev="";
		int len=s.length();
		for(int i=len-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
System.out.println("reverse of string is:" +rev);
	}

}
