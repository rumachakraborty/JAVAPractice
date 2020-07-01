
public class June_OOPS_Employee2 {
	
	String eid="E-111";
	String ename="Durga";
	int eage=25;
	String accname;
	int eaccno;
	public void displayEmpDeatails(){
		System.out.println("Employee Details");
		System.out.println("-----------");
		System.out.println("Employee id" +eid);
		System.out.println("Employee Name" +ename);
		System.out.println("Employee Age" +eage);
	}
	
	public void displayAccDeatails(){
		System.out.println("Account Details");
		System.out.println("-----------");
		System.out.println("Employee accno" +eaccno);
		System.out.println("Employee accName" +accname);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		June_OOPS_Employee2 e=new June_OOPS_Employee2();
		e.displayEmpDeatails();
		e.displayAccDeatails();
		

	}

}
