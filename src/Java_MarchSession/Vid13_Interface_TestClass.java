package Java_MarchSession;

public class Vid13_Interface_TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vid13_FortidHospital fs=new Vid13_FortidHospital();
		fs.India_CardioServices();
		fs.India_emergencyServices();
		fs.India_OPTServices();
		fs.uk_entServices();
		fs.us_AmbulanceServices();
		
		
		
		//top casting
		
		Vid13_Interface_UsMedical u=new Vid13_FortidHospital();
		//child class object can be refered by parent interface ref var
		u.us_AmbulanceServices();
		u.us_dentalServices();
		u.us_nueroServices();
		System.out.println(Vid13_Interface_UsMedical.min_fee);
		System.out.println(fs.min_fee);


	}

}
