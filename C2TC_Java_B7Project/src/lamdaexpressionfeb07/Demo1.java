package lamdaexpressionfeb07;

//public class Demo1 {

	/*public static void main(String[] args)
	{
		Thread obj=new Thread(new Runnable[)
				{
			@Override
			public void run()
			{
				System.out.println("this is batch 7 first thread");
			} 
				}];
		obj.start();
	}

}*/
//using lamda
interface Lambda
{
	public void demo();
}

public class Demo1
{
	public static void main(String args[])
	{
		new Thread(   ()->
		{
			System.out.println("this is first thread");
			}).start();
	}
	

	
}