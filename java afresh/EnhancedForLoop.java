public class EnhancedForLoop{
	public static void main(String[] args){
		int [] numbers = {2,8,16,20,36};

        String[] names = {"clinton","solomon","delight","prize","decency"};

		for (int element : numbers){
			System.out.println(element);
		}

        for(String name : names){
            System.out.printf("%s%n",name);
        }


	}
}