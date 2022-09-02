package org.pom;

import org.lo.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	public SearchHotel() {
		PageFactory.initElements(driver,this);
		
	}

	@FindBy(id="location")
	private WebElement dDnLocation;



	@FindBy(id="hotels")
	private WebElement dDnHotels ;

	@FindBy(id="room_type")
	private WebElement dDnRoomType;

	@FindBy(id="room_nos")
	private WebElement dDnRoomNo;

	@FindBy(id="datepick_in")
	private WebElement dDnPickIn;

	@FindBy(id="datepick_out")
	private WebElement dDnPickOut;

	@FindBy(id="adult_room")
	private WebElement dDnAdultRoom;

	@FindBy(id="child_room")
	private WebElement dDnChildRoom;

	@FindBy(id="Submit")
	private WebElement btnSearch;

	public WebElement getdDnLocation() {
		return dDnLocation;

	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnRoomNo() {
		return dDnRoomNo;
	}

	public WebElement getdDnPickIn() {
		return dDnPickIn;
	}

	public WebElement getdDnPickOut() {
		return dDnPickOut;
	}

	public WebElement getdDnAdultRoom() {
		return dDnAdultRoom;
	}

	public WebElement getdDnChildRoom() {
		return dDnChildRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public void SearchHotels(String location,String hotels,String roomtype,String noOfRoom,String 
			checkInDate,String checkOutDate,String adultPerRoom,String childPerRoom) {
		selectByText(getdDnLocation(), location);
		selectByText(getdDnHotels(), hotels);
		selectByText(getdDnRoomType(), roomtype);
		selectByText(getdDnRoomNo(), noOfRoom);
		clearMethod(getdDnPickIn());
		sendkeys(getdDnPickIn(), checkInDate);
		clearMethod(getdDnPickOut());
		sendkeys(getdDnPickOut(), checkOutDate);
		selectByText(getdDnAdultRoom(), adultPerRoom);
		selectByText(getdDnChildRoom(), childPerRoom);
		click(getBtnSearch());


	}








}
