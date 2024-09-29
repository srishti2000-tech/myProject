package coding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Duplicates {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(2);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(4);
		System.out.println(GiveDuplicate(li)); 
	}
	private static int GiveDuplicate(List<Integer> li){
		int count = 0;
		HashMap<Integer,Integer> m = new HashMap<>();
		for(int i =0; i<li.size();i++) {
			if(m.containsKey(li.get(i))) {
				int k = m.get(li.get(i));
				k=k+1;
				m.put(li.get(i), k);
			}
			else {
				m.put(li.get(i), 1);
			}
		}
		for(Integer e : m.keySet()){
			//System.out.println(e);
		}
	
		
		for(Map.Entry<Integer,Integer> e : m.entrySet()){
			//System.out.println(e);
			if(e.getValue()>1) {
				count++;
			}
		}
		
		
		
		return count;
		
	}
	
	

}
