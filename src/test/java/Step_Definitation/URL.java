package Step_Definitation;

import Path2Usa_Locators.Search;
import Path2Usa_TestBase.TestBase_Testbase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class URL extends Search
{

	@Given("^I want to open Chrome Browser$")
	public void i_want_to_open_Chrome_Browser_and_hit_the_URL() throws Throwable 
	{
		TestBase_Testbase.initialization();
				//Search url= new Search();
				System.out.println("The site got opened successfully");		
	}


	@Then("^Verify that Open Path(\\d+)Usa site$")
	public void verify_that_Open_Path_Usa_site(int arg1) throws Throwable 
	{
		
		System.out.println("Sucessfully opened the URL");
	}


	
}
