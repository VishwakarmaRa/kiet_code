package CustomException;
//Custom exception:(yadi aap exception class ko extend karte ho to exception ko, 
//try, catch, throw, and throws  block ka use karke handle karna hoga )
class UnderAgeException extends Exception{
	UnderAgeException(){
		super("You are under age");
	}
	UnderAgeException(String msg){
		super(msg);
	}
	
}
public class checkedexp {
    public static void main(String[] args) {
		int age=16;
		try {
			if(age<18) {
				throw new UnderAgeException("You can't vote");
			}
			else {
				System.out.println("You can vote now");
			}
		}
		catch(UnderAgeException e) {
			e.printStackTrace();
		}
	}
}
