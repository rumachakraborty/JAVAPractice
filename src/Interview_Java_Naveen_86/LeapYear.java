package Interview_Java_Naveen_86;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class LeapYear {
	//divisible by 4
	public static void main(String [] args){
	int year=1900;
	boolean leap = false;
	
	if(year % 4 ==0){
		if(year % 100 ==0){
			if(year % 400 ==0){
				leap= true;
			}
			else
			{
				leap = false;
			}
		}else{
			leap=true;
		}
	}else{
		leap=false;
	}
	if(leap){
		System.out.println(year + " is leap year");
	}
	else{
		System.out.println(year + " is not leap year");
	}

}
}

