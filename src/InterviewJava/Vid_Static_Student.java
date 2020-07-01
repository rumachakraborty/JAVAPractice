package InterviewJava;

public class Vid_Static_Student {
	int rollNo;
	String name;//Instance variable or class variable
	static String college="rooman"; //static variable
	
	

	public Vid_Static_Student(int r, String n) {
		// TODO Auto-generated constructor stub
		rollNo=r;
		name=n;
	}

//method to display the values
	
	public void display(){
		System.out.println(rollNo+ " "+name + " " +college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vid_Static_Student s1=new Vid_Static_Student(111,"ruma1");
		Vid_Static_Student s2=new Vid_Static_Student(112,"ruma2");
		Vid_Static_Student s3=new Vid_Static_Student(113,"ruma3");
		
		s1.display();
		s2.display();
		s3.display();

	}

}
