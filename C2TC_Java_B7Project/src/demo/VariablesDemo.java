package demo;

public class VariablesDemo {

	
	
	final static int a=1024;
	int b;
	void fun1()
	{
		final int c;
		c=10;
		System.out.println("class variables"+a+""+b);
		System.out.println("local variables"+c);
		b=56;
		System.out.println("class variables"+a+""+b);
	}
	void fun2()
	{
		System.out.println("class variables"+a+""+b);
	}
	public static void main(String[] args) {
		VariablesDemo obj=new VariablesDemo();
		System.out.println(obj.b);
		System.out.println(VariablesDemo.a);

	}

}
