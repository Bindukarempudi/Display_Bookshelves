package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	JavascriptExecutor js;
	Actions act;
    
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		 js=(JavascriptExecutor)driver;
		 act=new Actions(driver);
	}
	
	@FindBy(xpath="//*[@id='topnav_wrapper']/ul/li[7]/span")
	public WebElement Study;
	
	@FindBy(xpath="//*[@class='subnavlist rt']//span[text()='Bookshelves']")
	public WebElement bookshelves;
	
	@FindBy(xpath="//*[@id='filters-form']/div[1]/div/div/ul/li[2]")
	public WebElement storageType;  
	
	@FindBy(xpath="//a[@data-gaaction='popup.auth.close']")
	public WebElement close;
	
	@FindBy(xpath="//*[@id='filters_storage_type_Open']")
	public WebElement open;
	
	@FindBy(xpath="//*[@id='filters_availability_In_Stock_Only']")
	public WebElement outOfStock;
	
	@FindBy(xpath="//*[@class='grouplist clearfix']//li[@data-group='price'][@class='item']")
	public WebElement price;
	
	@FindBy(xpath="//div[@class='noUi-base']/div[2]/div")
			//div[@class='connect']")
			//input[@name='filters[price][max]']")
	//noUi-handle noUi-handle-upper
			//*[@class='noUi-handle noUi-handle-upper']")
	public WebElement slide;
	
	@FindBy(xpath="//ul[contains(@class,'productgrid')]/li[1]//span[@itemprop='name']")
	public WebElement product1_Name;
	
	@FindBy(xpath="//ul[contains(@class,'productgrid')]/li[2]//span[@itemprop='name']")
	public WebElement product2_Name;
	
	@FindBy(xpath="//ul[contains(@class,'productgrid')]/li[3]//span[@itemprop='name']")
	public WebElement product3_Name;
	
	@FindBy(xpath="//ul[contains(@class,'productgrid')]/li[1]//div[@class='price-number']//span")
	public WebElement product1_price;
	
	@FindBy(xpath="//ul[contains(@class,'productgrid')]/li[2]//div[@class='price-number']//span")
	public WebElement product2_price;
	
	@FindBy(xpath="//ul[contains(@class,'productgrid')]/li[3]//div[@class='price-number']//span")
	public WebElement product3_price;
	
	@FindBy(xpath="//ul[@class='topnav bodytext']/li[11]/span")
	public WebElement Trending;
	
	@FindBy(xpath="//ul[@class='topnav bodytext']/li[11]/div/div/ul/li[4]/div/a")
	public WebElement ulCollection;
	
	@FindBy(xpath="//*[@class='filters-list-wrapper']/ul/li[1]")
	public WebElement category;
	
	@FindBy(xpath="//*[@class='clearfix options']/li")
	public List<WebElement> listofDropDown;
	
	@FindBy(xpath="//ul[contains(@class,'productgrid')]/li//div[@class='price-number']//span")
    public List<WebElement> priceList;	
	
	@FindBy(xpath="//ul[contains(@class,'productgrid')]/li//span[@itemprop='name']")
	public List<WebElement> nameList;
	
	
	
	public void clickOnStudy() {
		//Clicking on study Element
		//Study.click();
		js.executeScript("arguments[0].click();",Study);
		
	}
	
	public void clickOnBookshelves() {
		//Clicking on Bookshelves Element
		//bookshelves.click();
		js.executeScript("arguments[0].click();",bookshelves);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void closePopUp() {
		//Clicking close button on popup
		//close.click();
		js.executeScript("arguments[0].click();",close);
	}
	
	public void clickOutOfStockCheckBox() {
		//Clicking out of Stock CheckBox
		//outOfStock.click();
		js.executeScript("arguments[0].click();",outOfStock);
	}
	
	public void clickStorageType() {
		//Clicking on Storage Type Element
		//storageType.click();
		js.executeScript("arguments[0].click();",storageType);
	}
	
	public void selectOpenfromDropDown() {
		//Selecting Open From DropDown of the Storage Type
	//	open.click();
		js.executeScript("arguments[0].click();",open);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickPrice() {
		//Clicking on Price filter
		price.click();
		
		//js.executeScript("arguments[0].click();",price);
		
		
	}
	
	public void setSliderBar() throws InterruptedException {
		//seting the slider bar to below Rs 15000
		
	 act.dragAndDropBy(slide,-275, 0).perform();

	 price.click();
		
	}
	
	public void clickTrending() {
		//Clicking on Trending element
		//Trending.click();
		js.executeScript("arguments[0].click();",Trending);
		//ac.moveToElement(Trending).perform();
	}
	
	public void clickOnUlCollection() {
		//Clicking on ULCollection 
		//ulCollection.click();
		js.executeScript("arguments[0].click();",ulCollection);
		
	}
	
	public void clickOnCategory() {
		//Clicking on Category Filter
		category.click();
		js.executeScript("arguments[0].click();",category);
		//ac.moveToElement(category).perform();
	}

}
