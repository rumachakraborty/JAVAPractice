import java.util.Scanner;

public class Test13thMay_LargeNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = sc.nextInt();

        System.out.println("Enter second Number");
        int b = sc.nextInt();

        System.out.println("Enter third5 Number");
        int c = sc.nextInt();

        while (a!=b && a!=c) {
            if (a > b && a > c) {

                System.out.println(a + " is greater");
            } else if (b > a && b > c) {

                System.out.println(b + " is greater");
            } else if (c > a && c > b) {

                System.out.println(c + " is greater");
            }
            return;
        }

        if(a==b && a<c){
            System.out.println(c+ " is greater");
        }
        if(a==c && a<b){
            System.out.println(b+ " is greater");
        }
        if(b==c && b<a){
            System.out.println(a+ "is greater");
        }
        if(a==b && a>c){
            System.out.println("Two number of "+a+ "are equal and are greater than "+c);
        }
        if(a==c && a>b){
            System.out.println("Two number of "+a+ "are equal and are greater than "+b);
        }
        if(b==c && b>a){
            System.out.println("Two number of "+b+ "are equal and are greater than "+a);
        }
    }


        
		
		
			}

	

