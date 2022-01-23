package box;

class Animals
{
	int legs;
	String name;
	String color;

public Animals()
{
	System.out.println("this is a default constructor");
}

public Animals(String name){
	this();
	this.name=name;
}

public Animals(String name,String color) {
	this(name);
	this.color=color;
}

public Animals(int legs,String name,String color ) {
	this(name,color);
	this.legs=legs;
}
void display() {
	System.out.println("animal description");
	System.out.println(color+""+"color"+"name"+"with"+"legs");
}
}
public class Animal {

	public static void main(String[] args) {
		Animals obj1=new Animals(4,"cat","white");
		obj1.display();
		
		Animals obj2=new Animals("dog","black");
		obj2.display();
	}

}
