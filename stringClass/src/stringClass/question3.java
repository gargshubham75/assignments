package stringClass;

public class question3 {
	public static void main(String[] args)
	{
		String s1= "Java string pool refers to collection of strings which are stored in heap memory";
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		String s2= s1.replace("a", "$");
		System.out.println(s2);
		System.out.println(s1.contains("collection"));
		System.out.println(s1.contains("Java string pool refers to collection of strings which are stored in heap memory"));
		//string s3 to search
		String s3= "Java string pool refers to collection of strings which are stored in heap memory";
		String s4= s3.toLowerCase();
		String s5= s1.toLowerCase();
		System.out.println(s5.contains(s4));

}
}
