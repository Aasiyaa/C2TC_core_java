package lamdaexpressionfeb07;
interface Lambda
{
	public void demo();
}
public class App {

	public static void main(String[] args) {
	Lambda obj=()->
	{
		System.out.println("am from batch 7");
		System.out.println("am from batch 6");
		System.out.println("am from batch 4");
		System.out.println("am from batch 3");
	};
	
			obj.demo();
	}

}

