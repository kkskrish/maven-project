package org.lo;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AdactinHotel extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		AdactinHotel adactinHotel=new AdactinHotel();
		adactinHotel.bookedHotel();
		
		}
	
	private void bookedHotel() throws IOException, InterruptedException {
		
		
		
		getDriver();
		maximize();
		loadUrl("https://adactinhotelApp.com");
		
		WebElement txtUserName = findLocatorById("username");
		String userName = getData("Adactin", 1, 0);
		sendkeys(txtUserName,userName);
		
		WebElement txtPassword = findLocatorById("password");
		String pass = getData("Adactin", 1, 1);
		sendkeys(txtPassword,pass);
		
		WebElement logIn = findLocatorById("login");
		click(logIn);
		
		WebElement country = findLocatorById("location");
		 String location = getData("Adactin", 1, 2);
		 sendkeys(country,location);
		 
		 WebElement hotels = findLocatorById("hotels");
		 String hotel = getData("Adactin", 1, 3);
		 sendkeys(hotels,hotel);
		 
		 WebElement roomType = findLocatorById("room_type");
		 String type = getData("Adactin", 1, 4);
		 sendkeys(roomType,type);
		 
		 WebElement roomNo = findLocatorById("room_nos");
		 String num = getData("Adactin", 1, 5);
		 sendkeys(roomNo,num);
		 
		 WebElement checkIn = findLocatorById("datepick_in");
		 String datein = getData("Adactin", 1, 6);
		 sendkeys(checkIn,datein);
		 
		 WebElement checkOut = findLocatorById("datepick_out");
		 String dateOut = getData("Adactin", 1, 7);
		 sendkeys(checkOut,dateOut);
		 
		 WebElement adultRoom = findLocatorById("adult_room");
		 String adult = getData("Adactin", 1, 8);
		 sendkeys(adultRoom,adult);
		 
		 WebElement childRoom = findLocatorById("child_room");
		 String child = getData("Adactin", 1, 9);
		 sendkeys(childRoom,child);
		 
		 Thread.sleep(2000);
		 WebElement search = findLocatorById("Submit");
		 click(search);
		 
		 WebElement click = findLocatorById("radiobutton_0");
		 click(click);
		 
		 WebElement click1 = findLocatorById("continue");
		 click(click1);
		 
		 Thread.sleep(2000);
		 WebElement firstName = findLocatorById("first_name");
		 String data1 = getData("Adactin", 1, 10);
		 sendkeys(firstName,data1);
		 
		 WebElement lastName = findLocatorById("last_name");
		 String data2 = getData("Adactin", 1, 11);
		 sendkeys(lastName,data2);
		 
		 WebElement address = findLocatorById("address");
		 String data3 = getData("Adactin", 1, 12);
		 sendkeys(address,data3);
		 
		 WebElement cardNo = findLocatorById("cc_num");
		 String data4 = getData("Adactin", 1, 13);
		 sendkeys(cardNo,data4);
		 
		 WebElement ccType = findLocatorById("cc_type");
		 String data5 = getData("Adactin", 1, 14);
		 sendkeys(ccType,data5);
		 
		 WebElement ccmonth = findLocatorById("cc_exp_month");
		 String data6 = getData("Adactin", 1, 15);
		 sendkeys(ccmonth,data6);
		 
		 WebElement ccYear = findLocatorById("cc_exp_year");
		 String data7 = getData("Adactin", 1, 16);
		 sendkeys(ccYear,data7);
		 
		 WebElement cvv = findLocatorById("cc_cvv");
		 String data8 = getData("Adactin", 1, 17);
		 sendkeys(cvv,data8);
		 
		 WebElement click2 = findLocatorById("book_now");
		 click(click2);
		 Thread.sleep(8000);
		 
		 WebElement order = findLocatorById("order_no");
		 String attribute = getAttribute(order);
		 writeData("Adactin", 1, 18, attribute);
		 
		 
		}
	
	
		
	}
	

