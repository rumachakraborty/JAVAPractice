
public class Test7thMay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;

int b=10;
//short circuit operator | or  ||
//| single or then it will check both the expresion and it will be unnecesary and performce will be more
if(a++ ==10 | b++ ==10)
{
	System.out.println(a+ " "+b);
	
	}
int c=10;
int d=10;
if(c++ ==10 || d++ ==10)
{
	System.out.println(c+ " "+d);
	
	}

	}
}

