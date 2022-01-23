package generics_jan23;

public class GenericDemo1 {
	
		
	   public <E>void displayArrayElements(E[] elements)
	   {
		  for(E element:elements) 
		  {
			  System.out.println("element is: "+element);
		  }
	   }
		public static void main(String[] args) 
		{
			GenericDemo1 obj=new GenericDemo1();
		Integer[] intarray= {10,20,30,40};
		String[] str= {"java","programming", "learning"};
		
		obj.displayArrayElements(intarray);
		obj.displayArrayElements(str);
		}

	}

