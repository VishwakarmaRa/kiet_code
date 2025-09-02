package exception;

public class throwk {
	static void checkage(int age) throws Exception  {
		if(age<18) {
			throw new Exception("Not eligible to vote");
		}
		else {
			System.out.println("Can vote");
		}
	}
     public static void main(String[] args) throws Exception {
		checkage(15);
	}
 }
