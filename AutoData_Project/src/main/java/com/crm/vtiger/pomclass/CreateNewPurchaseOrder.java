package com.crm.vtiger.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewPurchaseOrder {
	
	public CreateNewPurchaseOrder(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="subject")
	private WebElement subjecttf;
	@FindBy(xpath="(//img[@src='themes/softed/images/select.gif'])[1]")
	private WebElement purchaseorderimg;
	@FindBy(xpath="//a[.='KERTHAN']")
	private WebElement purchaselink;
	@FindBy(name="bill_street")
	private WebElement billaddress;
	@FindBy(name="ship_street")
	private WebElement shipaddress;
	@FindBy(id="searchIcon1")
	private WebElement itemimg;
	@FindBy(xpath="//a[.='BURGER']")
	private WebElement productlink;
	@FindBy(name="qty1")
	private WebElement quantity;
	@FindBy(name="Button")
	private WebElement addproductbtn;
	@FindBy(xpath="//img[@src='themes/images/down_layout.gif']")
	private WebElement downward;
	@FindBy(id="searchIcon2")
	private WebElement item1img;
	@FindBy(xpath="//a[.='CHICKEN BIRIYANI']")
	private WebElement product1link;
	@FindBy(name="qty2")
	private WebElement quantity1;
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement savebtn;
	public WebElement getSubjecttf() {
		return subjecttf;
	}
	public WebElement getPurchaseorderimg() {
		return purchaseorderimg;
	}
	public WebElement getPurchaselink() {
		return purchaselink;
	}
	public WebElement getBilladdress() {
		return billaddress;
	}
	public WebElement getShipaddress() {
		return shipaddress;
	}
	public WebElement getItemimg() {
		return itemimg;
	}
	public WebElement getProductlink() {
		return productlink;
	}
	public WebElement getQuantity() {
		return quantity;
	}
	public WebElement getAddproductbtn() {
		return addproductbtn;
	}
	public WebElement getDownward() {
		return downward;
	}
	public WebElement getItem1img() {
		return item1img;
	}
	public WebElement getProduct1link() {
		return product1link;
	}
	public WebElement getQuantity1() {
		return quantity1;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	public void createPurchaseOrderimg()
	{
		subjecttf.sendKeys("keer");	
		purchaseorderimg.click();
	}
	public void purchaseOrderlink()
	{
		purchaselink.click();
	}
	public void addresss()
	{
		billaddress.sendKeys("cgar");
		shipaddress.sendKeys("cgar");
		itemimg.click();
	}
	public void productLink()
	{
		productlink.click();
	}
    public void addProduct()
    {
    	addproductbtn.click();
    	item1img.click();
    }
    public void productLink1()
    {
    	product1link.click();
    }
    public void quantitytf()
    {
    	quantity.sendKeys("23");
    	quantity1.sendKeys("34");
    }
    public void downWard()
    {
    	downward.click();
    }
    public void savebutton()
    {
    	savebtn.click();
    }
	
}
