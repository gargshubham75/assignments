package lambda;

public interface arithematic {
	int operation (int x,int y);

}
class operation
{
	public static void main(String[] args) {
		arithematic add=(int x, int y) -> x+y;
		arithematic sub=(int x,int y) -> x-y;
		arithematic mul=(int x,int y)-> x*y;
		arithematic div=(int x,int y)-> x/y;
		System.out.println("addition operation = "+add.operation(5, 4));
		System.out.println("subtraction operation = "+sub.operation(5, 6));
		System.out.println("multiplication operation = "+mul.operation(5, 5));
		System.out.println("division operation = "+div.operation(10, 5));
		
	}
}
