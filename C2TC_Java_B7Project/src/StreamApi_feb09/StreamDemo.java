package StreamApi_feb09;
import java.util.*;
import java.util.stream.Stream;
public class StreamDemo 
{
	public static void main(String[] ars)
	{
		Integer[] value=new Integer[] {10,20,30};
		
		List<String>ll=new ArrayList<String>();
		ll.add("java");
		ll.add("python");
		ll.add("ruby");
		
		System.out.println("array elements");
		Stream<Integer>mystream=Arrays.stream(value);
		mystream.forEach(System.out::println);
		 
		System.out.println("-------------------");
		System.out.println("list elements");
		Stream<String> mystream1=ll.stream();
		mystream1.forEach(System.out::println);
		
		
		Stream<String> mystream3=Stream.of("A","B","C","D");
		System.out.println("-------------------");
		System.out.println("STREAM ELEMENTS");
		mystream3.forEach(System.out::println);
	}
}































