package StreamApi_feb09;

public class Employee 
{
	int eid;
	String name;
	String des;
	float sal;
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", des=" + des + ", sal=" + sal + "]";
	}
	public Employee(int eid, String name, String des, float sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.des = des;
		this.sal = sal;
	}
	
	
}
