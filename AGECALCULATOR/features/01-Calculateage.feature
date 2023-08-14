Feature: Age Calculation Feature 

			Scenario Outline: Calculate Age for Valid Birthdates   
   	  Given user opened chrome browser and enter url "https://howoldru.m-messiah.cc/"
			When user enter "Khyati Gondaliya" in username textbox
			And user sets the date as per age "<Age>" in the birthdate field
			And user click on submit button
			Then Verify that "Hello Khyati Gondaliya!Your age is <Age>" text should be displayed
			
			Examples:
			| Age|
			|26|
			|0|
		
			

 
 
    
    