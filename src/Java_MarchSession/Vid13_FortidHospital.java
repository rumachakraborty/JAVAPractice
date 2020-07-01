package Java_MarchSession;

public class Vid13_FortidHospital implements Vid13_Interface_UsMedical,Vid13_Interface_UkMedical,Vid13_Interface_IndiaMedical {

	@Override
	public void us_orthopedicServices() {
		System.out.println("fortis hospital-orthopedicservice");
		
	}

	@Override
	public void us_dentalServices() {
		System.out.println("fortis hospital-dentalservice");
	
		
	}

	@Override
	public void us_nueroServices() {
		System.out.println("fortis hospital-neuroservice");

		
	}

	@Override
	public void us_AmbulanceServices() {
		System.out.println("fortis hospital-Ambulance service");
	}

	public void uk_physioServices() {
		System.out.println("fortis hospital-physervice");

		
	}

	public void uk_entServices() {
		System.out.println("fortis hospital-entservice");
		
	}

	public void uk_pediatriServices() {
		System.out.println("fortis hospital-pediatricservice");

		
	}

	public void India_emergencyServices() {
		System.out.println("fortis hospital-emergencyservice");

	}

	public void India_CardioServices() {
		System.out.println("fortis hospital-cardioservice");

	}

	public void India_OPTServices() {
		System.out.println("fortis hospital-OPTservice");
	}
	//non overriden method and fortis hospital own methods
	
	public void medicalInsuranceServices(){
		System.out.println("fortid hospital insurance ");
	}
	
	public void PathologyService(){
		System.out.println("fortid hospital Pathaologyservices ");
	}

}
