package Youtube_Naveen_Collections;

import java.util.ArrayList;

public class Vid2_ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(10);
		ar.add(10);
		ar.add(20);
		System.out.println(ar.size());
System.out.println(ar.get(0));
//System.out.println(ar.get(100));//java.lang.IndexOutOfBoundsException

//to print all values from arraylist

for(int i=0;i<ar.size();i++){
	System.out.println(ar.get(i));
}
//generic in java
ArrayList<Integer> ar1=new ArrayList<Integer>();
ar1.add(123);
//ar1.add("sunny"); //it will not alllow here

//string generic type
ArrayList<String> ar3=new ArrayList<String>();
ar3.add("String");

System.out.println(ar3.size());
	}

}
