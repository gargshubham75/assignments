package generics;

import java.util.*;

public class question3 {
public static void swap(Object[]a,int i,int j) {
		
		Object temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}

		public static void main(String[] args){
		String[] a={"shubham","garg","yahoo"};
		System.out.println("before: "+Arrays.toString(a));
		swap(a,0,2);
		System.out.println("after: "+Arrays.toString(a));
		}

}
