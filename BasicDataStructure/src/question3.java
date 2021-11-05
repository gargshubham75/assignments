import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		int p,t,r,n=12;
		Scanner sc=new Scanner(System.in);
		System.out.println("type principle amount");
		p=sc.nextInt();
		System.out.println("type rate of interest");
		r=sc.nextInt();
		System.out.println("type time period");
		t=sc.nextInt();
		int A=(p*r*t)/100;
		System.out.println("Simple Interest "+A);
		float b=r/100;
		double B=p*(Math.pow((1+(.08/n)), (n*t)));
		double amt= B-p;
		System.out.println("Compound Interest "+amt);
	}

}
