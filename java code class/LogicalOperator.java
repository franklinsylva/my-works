public class LogicalOperator{
	public static void main(String[] args){
		int x = 50;
		int y = 25;
		int z = 15;
		
		boolean result = (x>y)&&(x<=z);
		System.out.println(result);
		
		boolean result2 = (x>y)||(x<=z);
		System.out.println(result2);
		
		boolean result3 = !((x>y)&&(x<=z));
		System.out.println(result3);
		
	}
}
	