package jan18_hashmap;
import java.util.*;
 import java.util.concurrent.ConcurrentHashMap;
public class HashtableDemo {
//https://github.com/Aasiyaa/C2TC_core_java
	public static void main(String[] args) {

		Employee e1 = new Employee(1009, "sam", 90000.00, "sam@gmail.com");
		Employee e2 = new Employee(2009, "zoya", 90000.00, "zoya@gmail.com");
		Employee e3 = new Employee(3009, "lokesh", 90000.00, "lokesh@gmail.com");
		Employee e4 = new Employee(4009, "abhi", 90000.00, "abhi@gmail.com");
		Employee e5 = new Employee(5009, "ramya", 90000.00, "ramya@gmail.com");
		Employee e6 = new Employee(6009, "mark", 90000.00, "mark@gmail.com");

Department d1=new Department(1001,"IT","BANGALORE");
Department d2=new Department(1002,"marketing","chennai");

Map<Employee,Department>=mymap=new Hashtable<>();

mymap.put(e1,d1);
mymap.put(e2,d1);
mymap.put(e3,d1);

mymap.put(e4,d2);
mymap.put(e5,d2);

mymap.put(null,d1);
mymap.put(e6,null);

Set<Entry<Employee,Department>>entrySet=mymap.entrySet();
Iterator<Entry<Employee,Department>>iterator=entrySet.iterator();
while(iterator.hasNext()) {
	Map.Entry<Employee,Department>entry=(Map.Entry<Employee,Department>)iterator.
	Employee employee=entry.getKey();
	Department department=entry.getValue();
	System.out.println(employee);
	System.out.println(department);
			
			
}

	}

}
