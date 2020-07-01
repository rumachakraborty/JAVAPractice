package Java_MarchSession;

public class Vid11_Encapsu_EmpData {
	public String name;
	public int age;
	public int id;
	public String dept;
	private int salary;
	
	
	
	
	public Vid11_Encapsu_EmpData(String name, int age, int id, String dept, int salary) {
		
		this.name = name;
		this.age = age;
		this.id = id;
		this.dept = dept;
		this.salary = salary;
	}

	public void getEmployeeName(){
		System.out.println("get emp name");
		getEmployeeBonus();
	}

	private void getEmployeeBonus(){
		System.out.println("get emp bonus");
	}
	public int getSalary(){
		return salary;
	}
	
	public void setSalary(int salary){
		this .salary=salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vid11_Encapsu_EmpData e1=new Vid11_Encapsu_EmpData("sunny",13,3,"CA",2000);
		System.out.println(e1.name);
		System.out.println(e1.salary);
	}

}
