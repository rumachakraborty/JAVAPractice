package Java_MarchSession;

public class Vid6_Emp {
String name;
int age;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vid6_Emp e1=new Vid6_Emp();
		e1.name="ruma";
		e1.age=12;
		
		Vid6_Emp e2=new Vid6_Emp();
		e2.name="juma";
		e2.age=21;
		
		Vid6_Emp e3=new Vid6_Emp();
		e3.name="suma";
		e3.age=51;
		
		System.out.println(e1.name + " " + e1.age);
		System.out.println(e2.name + " " + e2.age);

		System.out.println(e3.name + " " + e3.age);

		e1=e2;
		e2=e3;
		
		System.out.println(e1.name + " " + e1.age);
		System.out.println(e2.name + " " + e2.age);

		System.out.println(e3.name + " " + e3.age);
	}

}
