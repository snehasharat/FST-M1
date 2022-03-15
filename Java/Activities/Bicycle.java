package Activity7;

public class Bicycle implements BicycleOperations, BicycleParts {
	public int gears, currentSpeed;
	public Bicycle(int gears, int currentSpeed)
	{
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}
	
	public void applyBrake(int decrement)
	{
		currentSpeed-=decrement;
	}
	
	public void speedUp(int increment)
	{
		currentSpeed+=increment;
	}
	
	public String bicycleDesc() 
	{
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
	
}
