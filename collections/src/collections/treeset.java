package collections;
import java.util.*;
public class treeset {
	public static void main(String[] args) {
		TreeSet<String> tree= new TreeSet<String>();
		tree.add("ravi, 101,");
		tree.add("ravi");
		tree.add("raju,102");
		tree.add("god");
		tree.add("yogesh");
		tree.add("shubham");
		tree.add("mittal");
		tree.add("praja");
		tree.add("hello");
		Iterator<String> itr=tree.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }
		
	}

}
