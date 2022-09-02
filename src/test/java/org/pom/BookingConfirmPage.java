package org.pom;

import java.io.IOException;

import org.lo.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPage extends BaseClass{
	public static String attribute=null;
	
	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement orderno;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookitinerary;

	public WebElement getOrderno() {
		return orderno;
	}
	
	public WebElement getBookitinerary() {
		return bookitinerary;
	}

	public void bookingconfirmation() throws InterruptedException, IOException {
		
		Thread.sleep(5000);
		 attribute = getAttribute(getOrderno());
		System.out.println(attribute);
		writeData("Adactin", 1, 18, attribute);
		click(getBookitinerary());
		
	}
	
	
	
	

}
