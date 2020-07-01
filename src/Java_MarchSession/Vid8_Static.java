package Java_MarchSession;

public class Vid8_Static {
	String Name;
	static int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vid8_Static obj=new Vid8_Static();
		obj.Name="rum";
		obj.search();
		
		//static
		age=2;
		System.out.println(age);
		//Name="test";
		obj.age=10;

	}
	public void search(){
		System.out.println("using search non static");
	}

	public void getName(){
		System.out.println("using get name method using static");
	}
}
