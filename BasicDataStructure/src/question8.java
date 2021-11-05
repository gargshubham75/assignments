import java.util.Arrays;

public class question8 {

	public static void main(String[] args) {
		int[] arr= {10,15,35,45,25,75,65};
		System.out.println("array "+ Arrays.toString(arr));
		int n= arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	

}
