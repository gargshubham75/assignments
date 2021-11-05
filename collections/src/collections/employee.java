package collections;
import java.util.*;

public class employee {


		private int ID;
		private String name;
		private String department;
		private int salary;

		// constructor
		public employee(int ID, String name, String department, int salary)
		{
			this.ID=ID;
			this.name=name;
			this.department=department;
			this.salary=salary;
		}
		public int getID()
		{
			return ID;
			}
		
		public String getName()
		{
			return name;
		}
		public String getdepartment()
		{
			return department;
			
		}
		public int getsalary()
		{
			return salary;
			
		}
		
		
	}

	// Comparator class will override the compare
	// method which will compare the tw objects
	// passed in the parameter
	class employeeName implements Comparator<employee>
	{

		public int compare(employee s1, employee s2)
		{
			return s1.getName().compareTo(s2.getName());
		}
	}

	

	class question3 {

		public static void main (String[] args){
			
			// Creating the TreeSet with Comparator object passed
			// as the parameter which will sort the user defined
			// objects of TreeSet
			TreeSet<employee> dd = new TreeSet<employee>(new employeeName());
			
			dd.add(new employee(01,"mittal","mechanical",10000));
			dd.add(new employee(02,"shubham","computer",15000));
			dd.add(new employee(03,"yogesh","eletrical",20000));
			dd.add(new employee(04,"raju","biotrch",25000));
			
			System.out.println("sorted employee name");
			
			// Printing the TreeSet elements
			
			
			for(employee ele : dd)
			{
				System.out.print(ele.getID() +" "+ ele.getName()+" "+ele.getdepartment()+" "+ele.getsalary());
				System.out.println();
			}

		}
	}


	