package Activity7;

public class MountainBike extends Bicycle{
	
	public int seatHeight=0;
	public MountainBike(int gears, int currentSpeed, int seatHeight) {
		super(gears, currentSpeed);
		this.seatHeight=seatHeight;
	}
	
	public void setHeight(int newseatHeight)
	{
		seatHeight = newseatHeight;
	}
	
	public String bicycleDesc()
	{
		return("Seat Height is " + seatHeight);
	}
}
