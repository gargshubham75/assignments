import java.util.*;
public class question6 {

	public static void main(String[] args) {
		String username, password;
		Scanner sc= new Scanner(System.in);
		int cnt=0;
		while(cnt<=3)
		{
			cnt++;
			System.out.println("enter username ");
			username=sc.nextLine();
			System.out.println("enter password ");
			password=sc.nextLine();
			if(username.equals("garg")&& password.equals("hello"))
			{
				System.out.println("welcome "+ username);
			}
			else
			{
				++cnt;
				System.out.println("invalid credentials");
			}
			if(cnt>3)
			{
				System.out.println("Contact Admin");
			}
			
		}
	}

}
