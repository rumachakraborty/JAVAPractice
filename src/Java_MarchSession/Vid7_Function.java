package Java_MarchSession;

import java.util.ArrayList;

public class Vid7_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test();
		add();
		getCapitalName("India");

	}
	//1.no input and no output
	public static void test(){
		System.out.println("no input and no output");
	}
//2.no input but some return
	public static int add(){
		System.out.println("no input and but out put");
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		return c;
		}
	//3. retrun string
			public String getTrainerName(){
				System.out.println("get trainer name");
				String name="ashi";
				return name;
			}
//3.some input and some output
public int div(int a,int b){
	System.out.println("division method");
	int d=b/a;
	return d;
	
}

public static String getCapitalName(String countryName){
	if(countryName.equals("India")){
		System.out.println("delhi");
		return "new delhi";
		
	}
	else if(countryName.equals("Japan")){
		return "tokio";
	
}
	
	else if(countryName.equals("Russia")){
		return "moscow";
	
}
	else{
		return "country not available";
	}
		
}
public ArrayList<String> getStudentList(String batchName){
	ArrayList<String> studentList=new ArrayList<String>();
	if(batchName.equals("sept")){
		studentList.add("ruma");
		studentList.add("rani");
	}
	if(batchName.equals("oct")){
		studentList.add("sunny");
		studentList.add("bunny");
	}
	return studentList;
}
}