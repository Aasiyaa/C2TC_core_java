//demo for variables in lambda
package lamdaexpressionfeb07;
//import java.util.*;
interface Lambda

{
	abstract public int demo();
	//reason for adding abstract is for 
	//functional interface(it has only one abstract method)
	
	
}
public class Demo3 {

	public static void main(String[] args)
	{
		Lambda obj= () -> (10+10+30-100/25);
		//System.out.println("value of x is"+x);
		System.out.println(obj.demo());
		//};
		//obj.demo(29);

	}

}
