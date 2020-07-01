package Vid14_AbstractConcept;

public class HomePage extends Vid14_Page {

	@Override
	public void header() {
		System.out.println("Homepage-headre");
		
	}

	@Override
	public void footer() {
		System.out.println("Homepage-footer");
		
	}

	@Override
	public void title() {
		System.out.println("Homepage-title");
	}
	

	public void userDeatsilsHomePage(){
		System.out.println("Homepage user details");
		
	}
}
