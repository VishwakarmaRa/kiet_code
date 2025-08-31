package OCP;

interface Operation{
	double calculate(double d1, double d2);
}

class AddOp implements Operation{
	public double calculate(double d1, double d2) {
		return d1+d2;
	}
}f
class SubtOp implements Operation{
	public double calculate(double d1, double d2) {
		return d1-d2;
	}
}
class DiviOp implements Operation{
	public double calculate(double d1, double d2) {
		return d1/d2;
	}
}
class MultOp implements Operation{
	public double calculate(double d1, double d2) {
		return d1*d2;
	}
}


public class openclose {
    public static void main(String[] args) {
		AddOp add=new AddOp();
		double a=add.calculate(2.3,4.8);
		System.out.println(a);
		SubtOp sub=new SubtOp();
		double s=sub.calculate(8.5,3.5 );
		System.out.println(s);
		DiviOp divi=new DiviOp();
		double d=divi.calculate(12, 4);
		System.out.println(d);
		MultOp mult=new MultOp();
		double m=mult.calculate(4.3, 2.5);
		System.out.println(m);
	}
}
