package firsttestngpackage;
//My TestNG project

import org.testng.annotations.Test;

public class Dependency {
@Test
public void logintest()
{
	System.out.println("login test");
	
}
@Test(dependsOnMethods="logintest")
public void Homepagetest()
{
	System.out.println("home page test");
}
}
