package Activity12;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addable a1 = (a,b) -> (a+b);
		System.out.println(a1.add(10, 20));
		
		Addable a2 = (int a,int b) ->
				{
					return (a+b);
				};
				
		System.out.println(a2.add(100, 200));
	}

}
