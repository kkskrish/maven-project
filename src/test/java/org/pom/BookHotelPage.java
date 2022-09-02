package org.pom;

import org.lo.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement dDnFirstName;
	
	
	@FindBy(id="last_name")
	private WebElement dDnLastName ;
	
	@FindBy(id="address")
	private WebElement dDnAddress;
	
	@FindBy(id="cc_num")
	private WebElement dDnCCNum;
	
	@FindBy(id="cc_type")
	private WebElement dDnCCType;
	
	@FindBy(id="cc_exp_month")
	private WebElement dDnExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement dDnExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement dDnCcv;
	
	@FindBy(id="book_now")
	private WebElement btnBookNow;

	public WebElement getdDnFirstName() {
		return dDnFirstName;
	}

	public WebElement getdDnLastName() {
		return dDnLastName;
	}

	public WebElement getdDnAddress() {
		return dDnAddress;
	}

	public WebElement getdDnCCNum() {
		return dDnCCNum;
	}

	public WebElement getdDnCCType() {
		return dDnCCType;
	}

	public WebElement getdDnExpMonth() {
		return dDnExpMonth;
	}

	public WebElement getdDnExpYear() {
		return dDnExpYear;
	}

	public WebElement getdDnCcv() {
		return dDnCcv;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	
	public void BookHotelPages(String firstName,String lastName,String address,String 
			ccNum,String ccType,String expMonth,String expYear,String ccv) {
		sendkeys(getdDnFirstName(), firstName);
		sendkeys(getdDnLastName(), lastName);
		sendkeys(getdDnAddress(), address);
		sendkeys(getdDnCCNum(), ccNum);
		selectByText(getdDnCCType(), ccType);
		selectByText(getdDnExpMonth(), expMonth);
		selectByText(getdDnExpYear(),expYear );
		sendkeys(getdDnCcv(), ccv);
		click(getBtnBookNow());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
