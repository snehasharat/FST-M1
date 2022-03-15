package Activity7;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike M = new MountainBike(3, 0, 25);
		System.out.println(M.bicycleDesc());
		M.speedUp(20);
		M.applyBrake(5);
	}

}
