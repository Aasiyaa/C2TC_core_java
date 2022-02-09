package StreamApi_feb09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Client
{
 public static void main(String[] arg)
 {
	Employee e1=new Employee(101,"john","Manager",50000); 
	Employee e2=new Employee(101,"mark","lead",700000); 
	Employee e3=new Employee(101,"ben","helper",50000); 
	Employee e4=new Employee(101,"lexi","associate",50000); 
	Employee e5=new Employee(101,"hensler","senior manager",80000); 
	Employee e6=new Employee(101,"michel","Manager",50000); 
	
	List<Employee> ll=new ArrayList<Employee>();
	//use this below line to add value or u can use the above one 
	//ll.add(new Employee(101,"john","Manager",50000);
	ll.add(e1);
	ll.add(e2);
	ll.add(e3);
	ll.add(e4);
	ll.add(e5);
	ll.add(e6);
	
	Stream<Employee>pstream=ll.parallelStream();
	pstream.forEach(System.out::println);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 }
}
