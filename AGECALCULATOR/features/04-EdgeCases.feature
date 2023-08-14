Feature: Edge Cases

  		Scenario: Birthdate from different century
  		Given user opened chrome browser and enter url "https://howoldru.m-messiah.cc/"
			When user enter "Khyati Gondaliya" in username textbox
			And user enters a birthdate "02/02/1800" from a different century
			And user click on submit button
			Then Verify that "you are too old to use it" error message should be displayed 
 		
 		
 		
