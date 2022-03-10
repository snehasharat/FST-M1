package Activity1;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car C1 =  new Car();
		C1.make = 2014;
		C1.color = "Black";
		C1.transmission = "Manual";

		C1.displayCharacterstics();
		C1.accelerate();
		C1.brake();
	}

}
