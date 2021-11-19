import java.util.Scanner;

public class question7 {

	public static void main(String[] args) {
		int [] arr= {10,20,60,25,45,35};
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter the number which is to find ");
		int a= sc.nextInt();
		boolean chk= false;
		for(int element: arr) {
			if(element==a)
			{
				chk=true;
			}
		}
		if(chk)
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}
	}

}
