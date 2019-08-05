package algos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

public class Collections1 {

	
	public static void arraylistexample() {
		ArrayList<String> list = new ArrayList<String> ();
	
	list.add("1");
	list.add("2");
	list.add("3");
	list.add("shravan");
	System.out.println(list);
	list.remove(1);
	list.add(2, "4");
	System.out.println(list);
	
	ListIterator<String> itr=list.listIterator();
	while(itr.hasNext()) {
		System.out.println(itr.nextIndex()+itr.next().toString());
	}
	while(itr.hasPrevious()) {
		System.out.println(itr.previousIndex()+itr.previous());
		
	}
	}
	
	public static void  linkedlistexample() {
		LinkedList<String> LL1= new LinkedList();
		LL1.add("shravan");
		LL1.add("uday");
		LL1.add("swetha");
		
		System.out.println(LL1);
		LL1.add(1, "ramesh");
		System.out.println(LL1);
		System.out.println(LL1.get(3));
	}
	
	
	public static void hashset() {
		HashSet<String> hs= new HashSet();
		hs.add("shravan");
		hs.add("shravan");
		hs.add("uday");
		hs.add("swetha");
		
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void map() {
		Map map = new HashMap();
		map.put(1, "shravan");
		map.put(0, "udya");
		map.put(2, "swtha");
		map.put(3, "bob");
		System.out.println(map.get(1));
		System.out.println(map);
		map.replace(2, "kiran");
		System.out.println(map.get(1));
		System.out.println(map);
	}
public static void main(String[] args) {
	
	//arraylistexample();
	//linkedlistexample();
	//hashset();
	map();
}
}
