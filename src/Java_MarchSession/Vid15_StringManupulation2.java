package Java_MarchSession;

import javax.sound.midi.Synthesizer;

public class Vid15_StringManupulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="This is my java code";
System.out.println(str.length());
//compare 2 string
String s1="hello world";
String s2="hello world";
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));

//trim
String p="   hello world  ";
System.out.println(p.trim());

//replace :
System.out.println(p.trim().replace(" ",""));
//dob 
String dob="12-13-2019";
System.out.println(dob.replace("-","/"));

//Ucase and Lcase

String s12="This Is Selenium";
System.out.println(s12.toLowerCase());
System.out.println(s12.toUpperCase());

//sUB String
String st="Transaction id is 1234";
System.out.println(st.substring(4));
System.out.println(st.substring(0,10));
System.out.println(st.substring(12));
System.out.println(st.substring(st.indexOf("is")+1,st.length()));
System.out.println(st.substring(st.indexOf("is")+3,st.length()));

//Split
String data="Tom;25;male;1000;USA";
String dataVal[]=data.split(";"); //split will give string of array
System.out.println(dataVal[0]);

//to get all value from array

for(int i=0;i<dataVal.length;i++){
	System.out.println(dataVal[i]);
}

String test="xXJavaxXPythonxXRubyxXSelenium";
String val[]=test.split("xX");
System.out.println(val[1]);

//How to split
String name="Ruma Ghosh Chakraborty";

System.out.println(name.split(" "));
//without for looop geting all 
System.out.println(name.split(" ")[0]);
System.out.println(name.split(" ")[1]);
System.out.println(name.split(" ")[2]);
System.out.println("-----------------");
//using for loop
for(int i=0;i<name.split(" ").length;i++){
	System.out.println(name.split(" ")[i]);
}

System.out.println("********************");
String credentials="admin;testpassword";
String username=credentials.split(";")[0];
String password=credentials.split(";")[1];



doLogin(username,password);

		}
	public static void doLogin(String un,String pwd){
		System.out.println("login to app with" + un + " " + pwd);
	}
}
