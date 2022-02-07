package lamdaexpressionfeb07;
//program to demo for each loop with lambda expression


import java.util.*;
class Data{
	private String name;
	public Data(String name) {
		super();
		this.name=name;
	}
	@Override
	public String toString() {
		return "Data [name=" + name +"]";
	}
	public String getName() {
		return name;
	}
}
public class Demo4 {

	public static void main(String[] args) 
	{
		List<Data> list=new ArrayList<>();
		list.add(new Data("vikas"));
		list.add(new Data("john"));
		list.add(new Data("mia"));	
		list.add(new Data("angelina"));	
	list.add(new Data("roy"));	
		
	list.forEach(temp -> {System.out.println(temp.getName());});
	//concept of consumer functional interface
	//funtional interface is like only one parameters,not more than that	
	}

}
