package ISP;

interface calculate{
	int calArea();
	int calVolume();
}

class cuboid implements calculate{
	public int calArea() {
		return area;
	}
	
	public int calVolume() { 
		return null;
	}
}
class Square implements calculate{
	public int calArea() {
		return area;
	}
	/*How I can cal volume of square*/
	public int calVolume() { 
		return null;
	}
}
public class problem {
  
}
