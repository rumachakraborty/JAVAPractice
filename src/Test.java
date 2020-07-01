
class ccount{
	String accNo="111a";
	String accHolderName="Durga";
	int balance=200;
	String accType="Saving";
	public String toString(){
		System.out.println("---");
		System.out.println("Acc num: " +accNo);
		System.out.println("Acc holderName:" +accHolderName);
		System.out.println("Acc banalce:" +balance);
		return "";
		
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ccount acc=new ccount();
String ref=acc.toString();
System.out.println(ref);
System.out.println(acc);
System.out.println(acc.toString());
	}

}
