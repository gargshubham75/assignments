import java.util.*;

public class question9 {

	public static void main(String[] args) {
		double total,marks,average;
		float A,B,C;
		int cnt=0;
		while(cnt<3)
		{
			cnt++;
			Scanner sc= new Scanner(System.in);
			System.out.println("marks of all 3 subjects "+cnt+" ");
			System.out.println("subject A ");
			A= sc.nextFloat();
			System.out.println("subject B ");
			B= sc.nextFloat();
			System.out.println("subject C ");
			C= sc.nextFloat();
			total=A+B+C;
			System.out.println("total marks " +total);
			average= (A+B+C)/3;
			System.out.println("average nmarks "+average);
		}
	}

}
