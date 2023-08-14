Feature: Input Validation

  		Scenario: Empty username and birthdate fields
  		Given user opened chrome browser and enter url "https://howoldru.m-messiah.cc/"
			When user leaves username field empty
			And user leaves date of birth fiels empty
			And user click on submit button
			Then Verify that "incorrect symbols" error message should be displayed 
		
		
			Scenario: Invalid date format
    	Given user opened chrome browser and enter url "https://howoldru.m-messiah.cc/"
    	When user enter "Khyati Gondaliya" in username textbox
    	And the user enters an invalid date format "12/12/11111" in the birthdate field
    	And user click on submit button
    	Then verify that "Wrong date" error message should be displayed 
    

    	Scenario: Calculate age for future birthdate 
   		Given user opened chrome browser and enter url "https://howoldru.m-messiah.cc/"
			When user enter "Khyati Gondaliya" in username textbox
			And user sets the date as per age "-1" in the birthay field 
			And user click on submit button
			Then Verify that "your birthday must be in the past" error text should be displayed
		
		
			Scenario: Username with excessive length
  		Given user opened chrome browser and enter url "https://howoldru.m-messiah.cc/"
  		When user enters a username with a very long string "ghugrighfewhufeifghegeiggheiugehwufielwgauiduauygagriugvkfbv@@@432654546566@@fgdfgfgfgghugrighfewhufeifghegeiggheiugehwufielwgauiduauygagriugvkfbv@@@432654546566@@fgdfgfgfgghugrighfewhufeifghegeiggheiugehwufielwgauiduauygagriugvkfbv@@@432654546566@@fgdfgfgfg"
  		And user select the "30/05/2005" in date of birth textbox
  		And user click on submit button
  		Then Verify that "ghugrighfewhufeifghegeiggheiugehwufielwgauiduauygagriugvkfbv@@@432654546566@@fgdfgfgfgghugrighfewhufeifghegeiggheiugehwufielwgauiduauygagriugvkfbv@@@432654546566@@fgdfgfgfgghugrighfewhufeifghegeiggheiugehwufielwgauiduauygagriugvkfbv@@@432654546566@@fgdfgfgfg..." text should be displayed 