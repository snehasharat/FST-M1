package Activity6;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Plane plane = new Plane(10);
		plane.onboard("John");
		plane.onboard("Steve");
		plane.onboard("Anna");
		
		System.out.println("Take off time is " + plane.takeOff());
		System.out.println("Passengers list " + plane.getPassengers());
		Thread.sleep(500);
		plane.land();
		System.out.println("Time of landing " + plane.getLastTimeLanded());
		
	}

}
