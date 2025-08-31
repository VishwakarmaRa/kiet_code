package OCP;


class Opt{
	public double cal(double d1, double d2, String opttype) {
		
		switch(opttype) {
		case "+": return d1+d2;
		case "-": return d1-d2;
		case "*": return d1*d2;
		case "/": return d1/d2;
		
        default: System.out.println("No problem");
        
		}
		
		return 0;
	}
}
public class problem {
   public static void main(String[] args) {
	Opt obj=new Opt();
	System.out.println(obj.cal(8, 2, "+"));
	System.out.println(obj.cal(8, 2, "-"));
	System.out.println(obj.cal(8, 2, "*"));
	System.out.println(obj.cal(8, 2, "/"));
}
}
