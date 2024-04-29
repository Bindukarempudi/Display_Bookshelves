package stepDefinitions;

import java.util.ArrayList;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import utilities.ExcelUtility;


public class ListOfCollection {
	
	String dataPath=System.getProperty("user.dir")+"\\testData\\OutputData.xlsx";
	ExcelUtility excel;
	HomePage hp;
	ArrayList<String> ls=new ArrayList<String>();
	
	@Given("user open  urbanladder website in his browser")
	public void user_open_urbanladder_website_in_his_browser() {
		hp=new HomePage(BaseClass.getDriver());
		excel=new ExcelUtility(dataPath);
	}

	@When("user click on the Trending")
	public void user_click_on_the_trending() {
		BaseClass.getLogger().info("clicking on the Trending");
		hp.clickTrending();
	}

	@When("selects UL Collections from the dropdown")
	public void selects_ul_collections_from_the_dropdown() {
		BaseClass.getLogger().info("selecting UL Collections from the dropdown");
		hp.clickOnUlCollection();
	}

	@When("click on the Category")
	public void click_on_the_category() {
		BaseClass.getLogger().info("clicking on the Category");
		hp.clickOnCategory(); 
	}

	@Then("extract sub-menu items and store it in a List")
	public void extract_sub_menu_items_and_store_it_in_a_list() {
		BaseClass.getLogger().info("extracting sub-menu items and store it in a List");

		for(int i=0;i<hp.listofDropDown.size();i++) {
			String p=hp.listofDropDown.get(i).getText();
			ls.add(p);
			
		}
	}

	@Then("displays the same List in the console")
	public void displays_the_same_list_in_the_console() {
		BaseClass.getLogger().info("displaying the same List in the console");
		for(String s:ls) {
			
			System.out.println("List sub-menu items"+" "+":- "+s);
		}
		System.out.println("=================*******************===============================");
	}

	@Then("store data in excel sheet")
	public void store_data_in_excel_sheet() {
		BaseClass.getLogger().info("storing data in excel sheet");
		try {
			for(int i=0;i<ls.size();i++) {
				excel.write_Data("Collections",ls.get(i),i+1,0);
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}


}
