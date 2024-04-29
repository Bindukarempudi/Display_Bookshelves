package stepDefinitions;



import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import utilities.ExcelUtility;

public class DisplayBookShelves {
	
	HomePage hp;
	String product1;
	String product2;
	String product3;
	String p1;
	String p2;
	String p3;
	int j=0;
	String dataPath=System.getProperty("user.dir")+"\\testData\\OutputData.xlsx";
	 ExcelUtility excel;
	@Given("user has the urbanladder website open in his browser")
	public void user_has_the_urbanladder_website_open_in_his_browser() {
		BaseClass.getLogger().info("Open urban_ladder application");
		hp=new HomePage(BaseClass.getDriver());
		
		excel=new ExcelUtility(dataPath);
	}

	@When("user click on the study")
	public void user_click_on_the_study() {
		BaseClass.getLogger().info("clicking on the study");
		hp.clickOnStudy();
	}

	@When("selects Bookshelves from the dropdown")
	public void selects_bookshelves_from_the_dropdown() {
		BaseClass.getLogger().info("selecting bookshelves from the dropdown");
		hp.clickOnBookshelves();
	}

	@Then("signup pop will be displayed")
	public void signup_pop_will_be_displayed() {
	   BaseClass.getLogger().info("Popup will be displayed");
	   hp.close.isDisplayed();
	}

	@When("user  close the popup")
	public void user_close_the_popup() {
		BaseClass.getLogger().info("closeing the popup");
		hp.closePopUp();
	}

	@When("selects Exclude Out Of Stock filter from the page")
	public void selects_exclude_out_of_stock_filter_from_the_page() {
		BaseClass.getLogger().info("selecting Exclude Out Of Stock filter from the page");
		hp.clickOutOfStockCheckBox();
	}

	@When("click on the Storage Type")
	public void click_on_the_storage_type() {
		BaseClass.getLogger().info("clicking on the storage type");
		hp.clickStorageType();
	}

	@When("selects Open from the dropdown")
	public void selects_open_from_the_dropdown() {
		BaseClass.getLogger().info("selecting open from the dropdown");
		hp.selectOpenfromDropDown();
	}

	@When("click on the Price")
	public void click_on_the_price() {
		BaseClass.getLogger().info("clicked on the price");
		hp.clickPrice();
	}

	@When("slide the price slide bar")
	public void slide_the_price_slide_bar() {
		try {
			BaseClass.getLogger().info("slideing the price slide bar");
			hp.setSliderBar();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 

	@Then("extract name and price of the Bookshelves")
	public void extract_name_and_price_of_the_Bookshelves() {
		BaseClass.getLogger().info("extracting name and price of the bookshelves");
		 product1 = hp.product1_Name.getText();
		 product2 = hp.product2_Name.getText();
		 product3 = hp.product3_Name.getText();
		
		p1=hp.product1_price.getText();
		p2=hp.product2_price.getText();
		p3=hp.product3_price.getText();
		
      
		try {
		for(int i=3;i<hp.priceList.size();i++) {
			String p=hp.priceList.get(i).getText();
			if(p.equals(p1)|| p.equals(p2)|| p.equals(p3))
			{
			  System.out.println(hp.nameList.get(i).getText());
			  System.out.println(p);
			  j++;
				
		   }
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Then("displays the same in the console")
	public void displays_the_same_in_the_console() {
		BaseClass.getLogger().info("displaying the same in the console");
		
		System.out.println("name of the first product"+" : "+product1);	
		System.out.println("name of the second product"+" : "+product2);	
		System.out.println("name of the thried product"+" : "+product3);
		System.out.println("Price of the first product"+" : "+p1);
		System.out.println("Price of the second product"+" : "+p2);
		System.out.println("Price of the thried product"+" : "+p3);
		System.out.println("=================*******************===============================");
		if(j==0) {
			System.out.println();
			System.out.println("No matching price in items");
			System.out.println("=================*******************===============================");
		}
	}

	@Then("store data  in excel sheet")
	public void store_data_in_excel_sheet() {
		BaseClass.getLogger().info("storeing data in excel sheet");
		try {
			excel.write_Data("BookShelves",product1,1,0);
			excel.write_Data("BookShelves",product2,2,0);
			excel.write_Data("BookShelves",product3,3,0);
			excel.write_Data("BookShelves",p1,1,1);
			excel.write_Data("BookShelves",p2,2,1);
			excel.write_Data("BookShelves",p3,3,1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
