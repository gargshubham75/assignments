
public class question2 {

	public static void main(String[] args) {
		for(int i=100;i<999;i++) {
			int chk,rem,sum=0;
			chk=i;
			while(chk!=0) {
				rem=chk%10;
				sum=sum+(rem*rem*rem);
				chk=chk/10;
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
	}

}
