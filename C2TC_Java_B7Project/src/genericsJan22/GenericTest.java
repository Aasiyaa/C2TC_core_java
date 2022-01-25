package genericsJan22;
class GenericClassDemo<T>
{
	T obj;
	void add(T obj)
	{
		this.obj=obj;
	}
	
	T get()
	{
		return obj;
	}
}

public class GenericTest {

	public static void main(String[] args) {
		GenericClassDemo<Integer> obj=new GenericClassDemo<Integer>();
		obj.add(2);
		System.out.println(obj.get());
	}

}