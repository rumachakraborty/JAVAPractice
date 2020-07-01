package Vid17_Wrappe;

public class Zoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Meeting m=new Meeting(7,"sunny",8);
		System.out.println(m.id);
		System.out.println(m.studentCount);
		m.start();
	//	System.out.println(m.p);
		//password is private in meeting class so in same package we cannot access private class
		//private variable
		
	}

}
