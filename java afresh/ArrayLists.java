import java.util.ArrayList;

public class ArrayLists{
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList();


		list.add("john");
		list.add("debbie");
		list.add("mary");
		list.add("mark");
		list.add("josh");

        list.add(2, "clinton");
        list.remove("debbie");
        list.remove(3);

        list.clear();

        for(String name : list){
            System.out.println(name);
        }

		System.out.printf("%s%n",list);
	}
}