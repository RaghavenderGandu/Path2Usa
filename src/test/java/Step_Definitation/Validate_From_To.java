package Step_Definitation;

import Path2Usa_Locators.Search;
import Path2Usa_TestBase.TestBase_Testbase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Validate_From_To extends Search
{

		
		@Given("^Navigate to Path(\\d+)Usa site\\.$")
		public void navigate_to_Path_Usa_site(int arg1) throws InterruptedException
		{
			TestBase_Testbase.initialization();
					
		}

		@Given("^Enter From$")
		public void enter_From() throws Throwable
		{
			
			Search url= new Search();
			url.SelectDate();
			//url.SelectFrom();
			//url.SelectTo();
			
		}
		
		@Given("^Enter To$")
		public void enter_To() throws Throwable 
		{
		    
		}

		@Then("^Verify from and to fields are accepting the values\\.$")
		public void verify_from_and_to_fields_are_accepting_the_values() throws Throwable 
		{
		    
		}

	}
	


