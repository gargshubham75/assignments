package generics;

import java.util.*;

public class question4b {

	public static void main(String[] args) {
		Calendar cal= Calendar.getInstance();
		Date date = new Date();
	      System.out.println("Date = "+date);
	      cal.setTime(date);
		LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
		map.put("yahoo",cal.get(Calendar.YEAR));
		map.put("yes",cal.get(Calendar.MONTH));
		
		System.out.println("Size of map is:- " + map.size());
System.out.println(map);
	}

}
