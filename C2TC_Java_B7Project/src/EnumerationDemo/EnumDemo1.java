package EnumerationDemo;
import java.util.List;
import java.util.Vector;
import java.util.Enumeration;
public class EnumDemo1 {

	public static void main(String[] args) {
		Vector<Integer>vector=new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		Enumeration<Integer>elements=vector.elements();
		while(elements.hasMoreElements()) {
			Integer integer=elements.nextElement();
			//vector.add(100);//fail-safe
		}
		System.out.println(vector);
	}

}
