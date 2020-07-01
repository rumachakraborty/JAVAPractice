package Java_MarchSession;

public class Vid11_EmpDataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vid11_Encapsu_EmpData e2=new Vid11_Encapsu_EmpData("bhagat", 12, 7,"Football",3000);
		System.out.println(e2.name);
		System.out.println(e2.id);
		
		e2.getEmployeeName();
	e2.setSalary(6000);
	System.out.println(e2.getSalary());
		

	}

}
