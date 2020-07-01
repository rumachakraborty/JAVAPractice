package Youtube_Naven_JavaInterview_25_Sdet_30;

import java.util.Random;

public class Vid_SDET12_Generate_RandamNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//approch1:Random
		Random rand=new Random();
		int ran_int=rand.nextInt(3);
		System.out.println(ran_int);
		
		//double
		double rand_double=rand.nextDouble();
		System.out.println(rand_double);
		
		//approach2: Math class
		System.out.println(Math.random());
		
		//approach3:appache common lang api
		//RandomStringUtils.
		

	}

}
