
//program to sort the list with and without using lamda
package lamdaexpressionfeb07;
import java.util.*;
class Data {
	private String name;
	public Data(String name) {
		super();
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

@Override
public String toString() {
	return "Data [name=" + name + "]";
}
}
public class Demo2
{
	public static void main(String args[])
	{
		List<Data>list=new ArrayList<>();
		list.add(new Data("Vikas"));
		list.add(new Data("ed"));
		list.add(new Data("Angelina"));
		list.add(new Data("madhu"));
		list.add(new Data("john"));
	
Collections.sort(list,(Data o1,Data o2)      ->
{
	return o1.getName().compareTo(o2.getName());//sorting using lamda
});

for (Data data:list) {
	System.out.println(data.getName());
}
	}
}





