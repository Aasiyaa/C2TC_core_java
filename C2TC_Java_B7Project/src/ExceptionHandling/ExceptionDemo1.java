package ExceptionHandling;

public class ExceptionDemo1 {

		public static void main(String[] args) {
			try {
				int data=100/0;
			
			}
			catch (ArithmeticException ae)
			{
				ae.printStackTrace();
			}
	      System.out.println("Exception Handling Demo");
		}

	
	}


