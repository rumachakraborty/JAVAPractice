package Vid14_AbstractConcept;

public abstract class Vid14_Page {

	//1.absract method which doesnot have method body
	//2.Interface no ned to  have method keyword

	//3.which doesnot have method body is abstract method
	//3.abstract class need to write absract keyword
	//3.absract class need to write abstract keyword or prototype method
	//4.class to class use extend keyword eg LoginPage extends Pages
	
	// 5. cannot create the object of abstract class and interface
	//5.can I create constructor of abstract class? Yes can create
	//creating of object construction will be call
	//create the construction of abstraction->called when you create the base class object
	//Abstract class constructor able to create and called when create child class object
	//but interface constructor cannot be created
	
	//abstract  class constructor can be called but it will called with child class object creation
	
	public void Vid14_Page1(){
		System.out.println("Page class constructor");
	}
	
	
public abstract void header();
public abstract void footer();
public abstract void title();


//non abstract method
public void logout(){
	System.out.println("logout from all pages");
}


}
