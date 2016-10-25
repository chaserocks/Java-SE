package Practices;



import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// log 4j : It is a logging tool or reporting tool, It can be used to write the message into create file , file or html.

// https://www.mkyong.com/logging/log4j-log4j-properties-examples/
public class log4jDemo {
	
	public Logger l;
	@BeforeMethod
	
	public void preCondition()
	{
		l=Logger.getLogger("log4jDemo"); // Always give the present class name 
		l.info("preConditions");
	}
	
	@Test
	public void testDemo(){
	l.info("testDemo");

}
}
