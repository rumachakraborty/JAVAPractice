package Youtube_Naveen_Basic_Core_Java;

public class Vid27_Car {
	//class variable
String name;
int price;
String engine;

public Vid27_Car(String name,int price,String engine){
	this.name=name;
	this.price=price;
	this.engine=engine;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vid27_Car obj1=new Vid27_Car("BMW",12,"Auto");
		Vid27_Car obj2=new Vid27_Car("BMW",12,"Auto");
		Vid27_Car obj3=new Vid27_Car("BMW",12,"Auto");
		System.out.println(obj1.name+ " " + obj1.price+" "+ obj1.engine);

	}

}
