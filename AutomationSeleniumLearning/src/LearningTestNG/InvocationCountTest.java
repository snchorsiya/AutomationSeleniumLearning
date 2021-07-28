package LearningTestNG;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount = 10 )
	public void sum()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println("Sum is === " + c);
	}
	
	/*
	 * @Test(invocationTimeOut = 2, expectedExceptions =
	 * NumberFormatException.class) public void infinaitloop() { int i = 1; while (i
	 * == 1) { System.out.println(i); } }
	 */
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void test1()
	{
		String x = "100A";
		Integer.parseInt(x);
	}

}
