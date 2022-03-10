package Activity1;

public class Car {
	String color, transmission;
	int make, tyres, doors;
	
	Car()
	{
		tyres = 4;
		doors = 4;
	};
		public void displayCharacterstics()
		{
			System.out.println("Color of the car is " + color);
			System.out.println("Transmission type of the car is " + transmission);
			System.out.println("Make of the car is " + make);
			System.out.println("Tyres of the car is " + tyres);
			System.out.println("Number of car doors is " + doors);
		}
		
		public void accelerate()
		{
			System.out.println("Car is moving forward");
		}
		
		public void brake()
		{
			System.out.println("Car has stopped");
		}
	
}
