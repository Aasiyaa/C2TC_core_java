package StreamApi_feb09;
//lazy initialization demo
import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		int result=0;
		List<Integer>values=Arrays.asList(12,20,35,46,55,60,68,75);
		
		//System.out.println(values.stream()
		//.filter(i->i%5==0)
		//.reduce(0,(c,e)->c+e));
		for(int i : values)
		{
			if(i%5==0)
			{
				result=i*2;
				break;
			}
		}
		
		System.out.println(result);
		System.out.println(values.stream()
				.filter(i->i%5==0)
				.map(i->i*2)
				.findFirst()
				.orElse(0));
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
