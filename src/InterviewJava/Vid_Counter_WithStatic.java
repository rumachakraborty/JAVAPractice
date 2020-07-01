package InterviewJava;

public class Vid_Counter_WithStatic {
static int count=0;//instance variable

Vid_Counter_WithStatic(){
	count++;//increment the value
	System.out.println(count);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vid_Counter_WithStatic c1=new Vid_Counter_WithStatic();
		 Vid_Counter_WithStatic c2=new Vid_Counter_WithStatic();
		 Vid_Counter_WithStatic c3=new Vid_Counter_WithStatic();
		 
	}

}
