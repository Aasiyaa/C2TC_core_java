package EnumerationDemo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		Iterator<Integer>iterator=list.iterator();
		while(iterator.hasNext()) {
			Integer n=(Integer)iterator.next();
			System.out.println(n);
			if(n==5)
				iterator.remove();
			//list.remove(n);fail-fast
	}
		//System.out.println();
		System.out.println(list);
	}

}
