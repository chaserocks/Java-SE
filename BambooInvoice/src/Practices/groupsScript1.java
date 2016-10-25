package Practices;

import org.testng.Reporter;
import org.testng.annotations.Test;

// Ho do u execute only the required methods present in testNG class. Ans: By Using the TestNG Groups

public class groupsScript1 {
	
	@Test(priority=1,groups={"smoke","user"})
	
	public void createUser(){
		Reporter.log("CreateUser",true);
	}
	
@Test(priority=2,groups={"user"})
	
	public void editUser(){
		Reporter.log("editUser",true);
	}

@Test(priority=3,groups={"negative","user"})

public void deleteUser(){
	Reporter.log("deleteUser",true);
 }
}
