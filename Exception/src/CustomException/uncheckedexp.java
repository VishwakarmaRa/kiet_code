package CustomException;

class UnderAgeException1 extends RuntimeException{
	UnderAgeException1(){
		super("You are under age");
	}
	UnderAgeException1(String msg){
		super(msg);
	}
	
}
public class uncheckedexp {
    public static void main(String[] args) {
		int age=16;
//you can handle exception using try and catch, if you want
//		Try-catch optional hai.
			if(age<18) {
				throw new UnderAgeException1("You can't vote");
			}
			else {
				System.out.println("You can vote now");
			}
		
		
	}
}