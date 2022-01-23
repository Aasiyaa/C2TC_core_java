package jan18_hashmap;

public class Employee {
	
	private Integer eid;
	private String ename;
	private double sal;
	private String email;
	
	public Employee(Integer eid,String ename,Double sal,String email) {
		super();
		this.eid=eid;
		this.ename=ename;
		this.sal=sal;
		this.email=email;
		
	}
	
	public Integer getEid() {
		return eid;
	}
	
	public String getEname() {
		return ename;
		
	}
	public double getSal() {
		return sal;
	}
	public String getEmail() {
		return email;
	}
	@override
	public int hashCode() {
		final int prime=31;
		int result=1;
		result=prime*result+((email==null)?0:email.hashCode());
		result=prime*result+((eid==null)?0:eid.hashCode());
		result=prime*result+((ename==null)?0:ename.hashCode());
		result=prime*result+((sal==null)?0:sal.hashCode());
		return result;
		
	}
	@override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Employee other=(Employee) obj;
		if(email==null) {
			if(other.email!=null)
				return false;
		}else if(!email.equals(other.email))
			return false;
		if(eid==null) {
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
