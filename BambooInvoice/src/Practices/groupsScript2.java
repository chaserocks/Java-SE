package Practices;

import org.testng.Reporter;
import org.testng.annotations.Test;

// Note: Create an .xml file name it testNggroups.xml, Look fot TestNg.xml file in the testNg.xml file 
public class groupsScript2 {
	// Ho do u execute only the required methods present in testNG class. Ans: By Using the TestNG Groups
		
		@Test(priority=1,groups={"smoke","task"})
		
		public void createTasks(){
			Reporter.log("createTasks",true);
		}
		
	@Test(priority=2,groups={"task"})
		
		public void editTask(){
			Reporter.log("editTask",true);
		}

	@Test(priority=3,groups={"negative","task"})

	public void deleteTask(){
		Reporter.log("deleteTask",true);
	 }
	}


