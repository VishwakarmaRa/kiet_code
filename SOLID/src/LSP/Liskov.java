package LSP;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
	public int getNumberOfWheels(){
		return 2;
	}
	public Boolean hasEngine() {
		return true;
	}
}


class MotorCycle extends Vehicle{
	public int getNumberOfWheels() {
		return 2;
	}
	public Boolean hasEngine() {
		return true;
	}
}
class Car extends Vehicle{
	public int getNumberOfWheels() {
		return 4;
	}
	public Boolean hasEngine() {
		return true;
	}
}
class Bicyle extends Vehicle{
	public int getNumberOfWheels() {
		return 2;
	}
	public Boolean hasEngine() {
		return null;
	}
}
public class Liskov {
    public static void main(String[] args) {
		List<Vehicle> veh=new ArrayList<>();
		Vehicle car=new Car();
		Vehicle motor=new MotorCycle();
		Vehicle Bicycle=new Bicyle();
		veh.add(car);
		veh.add(motor);
		veh.add(Bicycle);
		
		for(Vehicle v:veh) {
			System.out.println(v.getNumberOfWheels());
			System.out.println(v.hasEngine());
		}
		
		
	}
}
