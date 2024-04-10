package Trial;

public class MyException {
	
	void myMethod() {
	int a=33;
	int b=0;
	try {
		MyInterface.display();
		int result=a/b;
		System.out.println("result");
	}
	
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
	}
}
