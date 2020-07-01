package Vid14_AbstractConcept;

public class TestPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage lp=new LoginPage();
		lp.footer();
		lp.header();
		
		
		HomePage hp=lp.login("runa", "ruma");
		lp.logout();
		System.out.println("home page in for ----");
		
		
	hp.footer();
	hp.header();
	hp.title();
	hp.logout(); //child can get parent method
	
	System.out.println("-----");
	//cannot create the object of absract class
	//
	}

}
