package Vid17;

import Vid17_Wrappe.Meeting;

public class GoToMeeting  extends Meeting{
	
	
	public GoToMeeting(int id,String password,int studentCount){
		super(id,password,studentCount);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//different package we need to access meeting 
		//class then we need 2 import that class
		
Meeting m=new Meeting(1222,"tanvy",9);
System.out.println(m.id);


//System.out.println(m.password);//out side package cannot access private variablr,private class

	}

}
