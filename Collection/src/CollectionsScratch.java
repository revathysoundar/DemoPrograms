import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionsScratch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array = new String[3];
		ArrayList<String> list = new ArrayList<String>();
		System.out.println((array.length));
		list.add("David");
		list.add("Bryan");
		list.add(1,"Kim");
		Collections.sort(list);
		System.out.println(list.get(1));
		System.out.println(list.size());
		System.out.println(list);
		
		HashSet<String> set = new HashSet<String>();
		set.add("David");
		set.add("Bryan");
		set.add("Bryan");
		System.out.println(set.size());
		System.out.println(set);
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("Pepperoni", 4);
		map.put("Cheese",2);
		map.put("Veggie", 7);
		
		System.out.println(map.size());
		System.out.println(map.get("Pepperoni"));
		System.out.println(map);
		
		
		
		
		
		
		
		

	}

}
