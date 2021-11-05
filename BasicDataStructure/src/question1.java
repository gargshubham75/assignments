
public class question1 {

	public static void main(String[] args) {
		int a=153,n=a,temp,r=0;
		while(a>0)
		{
			temp=a%10;
			a=a/10;
			r=r+(temp*temp*temp);
		}
		if(n==r)
		{System.out.println("armstrong");
		
		}
		else
		{System.out.println("not");
		
		}
		
	}

}
