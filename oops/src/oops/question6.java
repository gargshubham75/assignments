package oops;

import java.util.*;

abstract class question6 {

			public void persit()
			{
				
			}
		}
		class FilePersistance extends question6
		{public void persist()
			{
			System.out.println("file persist");
			}
		}
		class DataPersistance extends question6
		{
			public void persist()
			{
				System.out.println("data Persist");
			}
		}
		class persist
		{public static void main(String[] args) {
			FilePersistance FP= new FilePersistance();
			DataPersistance DP= new DataPersistance();
			FP.persist();
			DP.persist();
			
		}
}
