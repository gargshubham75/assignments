import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("marks in subject a");
		a= sc.nextInt();
		System.out.println("marks in subject b");
		b=sc.nextInt();
		System.out.println("marks in subject c");
		c=sc.nextInt();
		if(a>=60 && b>=60 && c>=60)
		{
			System.out.println("passed");
		}
		if(a>60 && b>60)
		{
			System.out.println("promoted");
		}
		else
		{
			System.out.println("failed");
		}
	}

}
