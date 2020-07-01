package Vid16_Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("A");
System.out.println("B");
try{
int i=9/0;
}catch(Exception e){

	System.out.println("some exception occured");
	//e.printStackTrace();
	System.out.println(e.getMessage() + " exception got occurd");
}
System.out.println("C");
System.out.println("C");
	}

}
