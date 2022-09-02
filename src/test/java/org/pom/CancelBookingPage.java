package org.pom;

import java.io.IOException;

import org.lo.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBookingPage extends BaseClass {
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_id_text")
	private WebElement txtorderid;
	
	@FindBy(id="search_hotel_id")
	private WebElement btngo;
	

	@FindBy(xpath="//input[@name='ids[]']")
	private WebElement btnradio;
	
	@FindBy(xpath="//input[@name='cancelall']")
	private WebElement btncancel;


	public WebElement getTxtorderid() {
		return txtorderid;
	}

	public WebElement getBtngo() {
		return btngo;
	}

	public WebElement getBtnradio() {
		return btnradio;
	}

	public WebElement getBtncancel() {
		return btncancel;
	}
	public void cancelbooking(String txtorderid) throws IOException, InterruptedException {
		
		sendkeys(getTxtorderid(), txtorderid);
		getData("Adactin", 1, 18);
		click(getBtngo());
		Thread.sleep(3000);
		click(getBtnradio());
		click(getBtncancel());
		acceptAlert();
		
	}

}
