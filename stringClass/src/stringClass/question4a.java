package stringClass;

public class question4a {
	public static void main(String[] args) {
		StringBuffer s1 =new StringBuffer("Stringbuffer"+" ");
			String s2= "is a peer class of string";
				
		String s3= "that provides much of";
		String s4="the functionality of Strings";
		String s5="using Stringbuffer ";
	
		s1.append(s2);
		System.out.println(s1);
		s1.append(" "+s3);
		System.out.println(s1);
		s1.append(" "+s4);
		System.out.println(s1);
		s1.append(" "+s5);
		System.out.println(s1);
		
		
	}


}
