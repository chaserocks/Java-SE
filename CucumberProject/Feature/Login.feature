Feature:  Login and logout functionality
	Scenario: Login functionality
	 	Given User launches the browser and navigates to the url
	 	When user enters username and password
	 	Then clicks on login button
	 	And welocome msg should come on the screen
	 	
	 Scenario: Logout functionality
	    When the user clicks on logout
	    Then he shoul come to the login page
	 	
