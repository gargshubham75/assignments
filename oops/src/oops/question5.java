package oops;

import java.util.*;

abstract class question5 {

	public void draw()
	{
		
	}
}
class line extends question5
{public void draw()
	{
	System.out.println("draw line");
	}
}
class rectangle extends question5
{public void draw()
	{
	System.out.println("draw rectangle");
	}
}
class cube extends question5
{
	public void draw()
	{
		System.out.println("draw cube");
	}
}
class star extends question5
{
	public void draw()
	{
		System.out.println("draw star");
	}
}
class main
{
	public static void main(String[] args) {
		line LD= new line();
		rectangle RD= new rectangle();
		cube CD= new cube();
		star SD= new star();
		LD.draw();
		RD.draw();
		CD.draw();
		SD.draw();
		
	}
	}


