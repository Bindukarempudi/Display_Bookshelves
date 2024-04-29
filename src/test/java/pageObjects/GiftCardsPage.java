package pageObjects;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utilities.ExcelUtility;

public class GiftCardsPage {
	
	public WebDriver driver;
	JavascriptExecutor js;
	String dataPath=System.getProperty("user.dir")+"\\testData\\Data.xlsx";
	ExcelUtility excel=new ExcelUtility(dataPath);
	
	public GiftCardsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		js=(JavascriptExecutor)driver;
	}
	
	
	@FindBy(xpath="//ul[@class='featuredLinksBar__linkContainer']/li[3]/a")
	public WebElement giftCard;
	
	@FindBy(xpath="//*[@class='_2sedU']/li[3]/div/h3")
	public WebElement birthday;
	
	@FindBy(xpath="//*[@class='_2sedU']/li[3]/div/div/button")
	public WebElement choose;
	
	@FindBy(xpath=" //div[@class='_3jn98 _23tqD _3k9Vm']/button[1]")
	public WebElement amount;
	
	@FindBy(xpath="//*[@class='_1IFIb _1fVSi action-button _1gIUf _1XfDi']")
	public WebElement next;
	
	@FindBy(xpath="//*[@name='recipient_name']")
	public WebElement toName;
	
	@FindBy(xpath="//input[@name='recipient_email']")
	public WebElement toEmail;
	
	@FindBy(xpath="//*[@name='recipient_mobile_number']")
	public WebElement toMobileNo;
	
	
	@FindBy(xpath="//*[@name='customer_name']")
	public WebElement fromName;
	
	
	@FindBy(xpath="//input[@name='customer_email']")
	public WebElement fromEmail;
	
	
	@FindBy(xpath="//*[@name='customer_mobile_number']")
	public WebElement fromMobileNo;
	
	
	
	@FindBy(xpath="//*[@name='customer_address']")
	public WebElement fromAddress;
	
	
	@FindBy(xpath="//*[@name='zip']")
	public WebElement pincode;
	
	
	@FindBy(xpath="//button[text()='Confirm']")
			//*[@type='submit']")
	public WebElement confirm;
	
	public void clickOnGiftCard() {
		//clicking giftcard
		
		giftCard.click();
	}
	
	public void moveToBirthdayElement() {
		//Moveing to Birthday Element
		Actions ac=new Actions(driver);
		ac.moveToElement(birthday).perform();
	}
	
	public void clickOnChoose() {
		//Clicking on Choose
		choose.click();
	}
	
	public void clickOnAmount() {
		//Clicking on Amount 
		amount.click();
	}
	
	public void clickOnNextButton() {
		//Clicking on Next Button
		next.click();
	}

	public void enter_invaild_Details() {
		String[] data=new String[8];
		for(int i=0;i<8;i++) {
			data[i]=excel.getCellData("InvalidData",i, 0);
		}
		toName.sendKeys(data[0]);
		toEmail.sendKeys(data[1]);
		toMobileNo.sendKeys(data[2]);
		fromName.sendKeys(data[3]);
		fromEmail.sendKeys(data[4]);
		fromMobileNo.sendKeys(data[5]);
		fromAddress.sendKeys(data[6]);
		pincode.sendKeys(data[7]);
		confirm.click();
		Actions ac=new Actions(driver);
		ac.click(confirm).perform();
		//js.executeScript("arguments[0].click();",confirm);
		
		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
