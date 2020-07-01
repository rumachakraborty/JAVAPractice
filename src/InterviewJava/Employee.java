package InterviewJava;

public class Employee {

	int empid;
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		emp1.name="Ravi";
		emp1.empid=1;
		Employee emp2=new Employee();
		emp2.name="Ram";
		emp2.empid=2;

		Employee emp3=new Employee();
		emp3.name="Ram";
		emp3.empid=2;
		
		Employee emp4=new Employee();
		emp4.name="Ram";
		emp4.empid=2;
		System.out.println(emp1.equals(emp2));
		System.out.println(emp2.equals(emp3));
		System.out.println(emp4.equals(emp3));
		System.out.println(emp2.name);
		System.out.println(emp3.name);
		System.out.println(emp3.empid);
	}

}
