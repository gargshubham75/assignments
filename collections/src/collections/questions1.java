package collections;
import java.util.*;
public class questions1 {
	public static void main(String[] args) {
		TreeMap<Integer, ArrayList<String>> Tree = new TreeMap<Integer ,ArrayList<String>>(Collections.reverseOrder());
		Tree.put(1000000, new ArrayList<String>());
		Tree.get(1000000).add("Name: shubham");
		Tree.get(1000000).add("email:  xxxx@gmail.com");
		Tree.get(1000000).add("Gender: Male");
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		if(x==1)
		{System.out.println("print all keys in a value");
		System.out.println(Tree.get(1000000));}
		
		Tree.put(2000000, new ArrayList<String>());
		Tree.get(2000000).add("Name: SHUBHAM");
		Tree.get(2000000).add("emAIL");
		Tree.get(2000000).add("Gender: Male");
		if(x==2)
		{System.out.println("print all keys ina value1");
		System.out.println(Tree.get(2000000));}
		if(x==3)
		{
		
		Iterator<Integer> iterator = Tree.keySet().iterator();
		
		 
		System.out.println("Printing all values of TreeMap");
		while(iterator.hasNext()){
		    System.out.println( iterator.next() );
		}
		}
		
	}

}
