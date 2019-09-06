package firsttestngpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class invocationcounttest {
	@Test()
	public void sum()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("the sum is"+c);
		Assert.assertEquals(c,30,"Sum is not equal to 30");
	}

}
