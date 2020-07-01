package Youtube_Naveen_Basic_Core_Java;
//https://www.youtube.com/watch?v=_Hv9aRx86w8&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=27
//Constructor
public class Vid27_Constructor {
//class variable
	String name;
	int age;
	//can we overload a constructor
	//yes we can overload a constructor
	
	public Vid27_Constructor(){
		System.out.println("Default constructor");
	}
	public Vid27_Constructor(int i){
		System.out.println("1 parm constructor");//1 parm
		System.out.println(i);
	}
	public Vid27_Constructor(int i,int j){
		System.out.println("2 parm constructor");
		System.out.println(i+ " "+j);
	}
	public  Vid27_Constructor(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vid27_Constructor obj=new Vid27_Constructor(); // creating object and using that object access 
		Vid27_Constructor obj1=new Vid27_Constructor(19);
		Vid27_Constructor obj2=new Vid27_Constructor(19,8);

	}

}
