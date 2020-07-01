
public class June_OOPS1_Student {
//Details
	
	int sid=10;
	String sname="ruma";
	String semail="ruma@r.com";
	String smobile="819726555";
	
	public void studentDetails(){
		System.out.println("Students details");
		System.out.println("---------------------");
		System.out.println("Student id " + sid);
		System.out.println("Student name " + sname);
		System.out.println("Student mobile " + smobile);
	}
	
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		June_OOPS1_Student s=new June_OOPS1_Student();
		s.studentDetails();

	}

}
