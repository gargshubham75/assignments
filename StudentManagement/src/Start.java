import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {
	public static void main(String[] args) throws IOException {
		System.out.println("hello");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("press 1 to add employee");
			System.out.println("press 2 to delete employee");
			System.out.println("press 3 to display employee");
			System.out.println("press 4 to exit");
			int c = Integer.parseInt(br.readLine());
			
			if(c==1) {
				//add
				System.out.println("Enter Student Name");
				String name=br.readLine();
				System.out.println("enter phone");
				String phone=br.readLine();
				System.out.println("enter city");
				String city=br.readLine();
				
				
				Student st=new Student(name, phone, city);
				boolean answer=StudentDao.insertStudenttoDB();
				if(answer) {
					System.out.println("successfully");
				}else
				{
					System.out.println("wrong");
				}
				System.out.println(st);
				
			}
				
			else if(c==2)
			{
				//del
				
			}
			else if(c==3)
			{
				//disp
				
			}
			else if(c==4)
			{
				break;
			}
			else
			{
				
			}
	}
System.out.println("Thankyou");
	}
}
