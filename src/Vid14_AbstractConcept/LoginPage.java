package Vid14_AbstractConcept;

public class LoginPage extends Vid14_Page {

	@Override
	public void header() {
		System.out.println("LP-headre");
		
	}

	@Override
	public void footer() {
		System.out.println("LP-footer");
		
	}

	@Override
	public void title() {
		System.out.println("LP-title");
	}
	

	public HomePage login(String un,String pwd){
		System.out.println("Login");
		System.out.println("login with "+un + " and " + pwd);
	return new HomePage();  //HomePage class object
	}
}
