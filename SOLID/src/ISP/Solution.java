package ISP;

interface TwoDimentional{
	void Area();
}
interface ThreeDimentional{
	void volume();
}

class Square implements TwoDimentional{
	public void Area() {
		System.out.println("Area of Square is");
	}
}
class Cuboid implements TwoDimentional,ThreeDimentional{
	public void Area() {
		System.out.println("Area of Cuboid is");
	}
	public void volume() {
		System.out.println("Volume of cuboid is");
	}
}
public class Solution {
   public static void main(String[] args) {
	Square s1=new Square();
	s1.Area();
	Cuboid c1=new Cuboid();
	c1.Area();
	c1.volume();
}
}
