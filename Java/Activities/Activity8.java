package Activity8;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Activity8.exceptionTest("Will print to console");
			Activity8.exceptionTest(null);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}

	private static void exceptionTest(String string) throws CustomException {
		// TODO Auto-generated method stub
		if(string == null)
			throw new CustomException("String is null");
		else
			System.out.println(string);
	}


}
