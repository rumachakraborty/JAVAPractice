
public class June_OOPS_Employee {
	
	String eid="E-111";
	String ename="Durga";
	int eage=25;
	public void displayEmpDeatails(){
		System.out.println("Employee Details");
		System.out.println("-----------");
		System.out.println("Employee id" +eid);
		System.out.println("Employee Name" +ename);
		System.out.println("Employee Age" +eage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		June_OOPS_Employee e=new June_OOPS_Employee();
		e.displayEmpDeatails();
		

	}

}
