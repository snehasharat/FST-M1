package Activity2;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numberArray = {10, 77, 10, 54, -11, 10};
		
		int searchNumber = 10;
		int fixedSum = 30;
		boolean finalResult = checkResult(numberArray, searchNumber,fixedSum);	
		System.out.println("Result is " + finalResult);
	}

	private static boolean checkResult(int[] numberArray, int searchNumber, int fixedSum) {
		// TODO Auto-generated method stub
		int arrayLength = numberArray.length;
		int tempSum=0;
		for(int i=0;i<arrayLength;i++)
		{
			if(numberArray[i]==searchNumber)
				tempSum=tempSum+numberArray[i];
		}
		if(tempSum==fixedSum)
			return true;
		else
			return false;
		
	}

}
