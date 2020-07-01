package Vid17_Wrappe;

public class Meeting {
	public int id;
	private String password;
	int studentCount;//default access modifier
	
	//constructor
	public Meeting(int id,String password,int studentCount){
		this.id=id;
		this.password=password;
	}
	public void start(){
		System.out.println("meeting can be start");
	}
	private void chat(){
		System.out.println("chating can be start ");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Meeting m=new Meeting(12,"ruma",188);
		System.out.println(m.id);
		System.out.println(m.password);
		System.out.println(m.studentCount);
		
		//method calling
		
		m.start();
		m.chat();

	}

}
