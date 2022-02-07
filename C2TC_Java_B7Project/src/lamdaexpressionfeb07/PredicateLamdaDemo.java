package lamdaexpressionfeb07;
import java.util.*;
import java.util.function.IntPredicate;

//using both lambda and predicate
public class PredicateLamdaDemo {

	/*public static void main(String[] args)
	{
		
    IntPredicate obj=new IntPredicate() 
    {@Override
    	public boolean test(int age)
    	{
    	if(age<18)
    	{
    		return false;
    	}
    	else
    	{
    		return true;
    	}
    	}
    	
    };
    
    System.out.println(obj.test(15));
    
    
    
	}*/

	
	//using lambda expression
	public static void main(String[]args) {
		IntPredicate obj1 = i -> i>18;
		IntPredicate obj2= i -> i<40;

		System.out.println(obj1.or(obj2).test(22));
	}
}
