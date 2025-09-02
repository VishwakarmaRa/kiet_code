package exception;

public class start {
     public static void main(String[] args) {
		int a=10;
		int b=0;
		System.out.println("Exception handling");
		System.out.println(a+b);
		
		try{
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println(a-b);
		System.out.println(a*b);
		
	}
	
}
