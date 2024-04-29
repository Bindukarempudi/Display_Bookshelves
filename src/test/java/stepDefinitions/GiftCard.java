package stepDefinitions;

import java.io.IOException;



import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GiftCardsPage;
import utilities.ExcelUtility;


public class GiftCard {
	
	GiftCardsPage gcp;
	String dataPath=System.getProperty("user.dir")+"\\testData\\OutputData.xlsx";
	ExcelUtility excel;
	String f1;
	String f2;
	
	@Given("urbanladder website open in his browser")
	public void urbanladder_website_open_in_his_browser() {
         gcp=new GiftCardsPage(BaseClass.getDriver());
		
		excel=new ExcelUtility(dataPath);
	}

	@When("user click on the GiftCard")
	public void user_click_on_the_gift_card() {
		BaseClass.getLogger().info("clicking on the gift card");
		gcp.clickOnGiftCard();
	}

	@When("hovers over the Birthday\\/Anniversary")
	public void hovers_over_the_birthday_anniversary() {
		BaseClass.getLogger().info("hovering over the birthday anniversary");
		gcp.moveToBirthdayElement();
	}

	@When("click on the Chosen")
	public void click_on_the_chosen() {
		BaseClass.getLogger().info("clicking on the Chosen");
		gcp.clickOnChoose(); 
	}

	@When("click on the Amount")
	public void click_on_the_amount() {
		BaseClass.getLogger().info("clicking on the Amount");
		gcp.clickOnAmount();
	}

	@When("click on next button")
	public void click_on_next_button() {
		BaseClass.getLogger().info("clicking on next button");
		gcp.clickOnNextButton();
	}

	@When("fill the form")
	public void fill_the_form() {
		BaseClass.getLogger().info("fill the form");
		
		gcp.enter_invaild_Details();
	}

	@Then("extract error message from to details")
	public void extract_error_message_from_to_details() {
		BaseClass.getLogger().info("extracting error message from to details");
	    
	    
		f2=gcp.toMobileNo.getAttribute("title");

	}

	@Then("displays the error message in the console")
	public void displays_the_error_message_in_the_console() {
		BaseClass.getLogger().info("displaying the error message in the console");
		System.out.println("=================*******************===============================");
		
	    System.out.println(f2);
	    System.out.println("=================*******************===============================");
	}

	@Then("store error message data in excel sheet")
	public void store_error_message_data_in_excel_sheet() {
		BaseClass.getLogger().info("storing error message data in excel sheet");
		
		try {
			
			excel.write_Data("ErrorMessage",f2,1,0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
