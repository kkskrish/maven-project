package org.pom;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.lo.BaseClass;

public class Integration extends BaseClass {

	@BeforeClass
	public static void BeforeClass() {
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		maximize();
	}
	@Test 
	public void bookhotels() throws IOException, InterruptedException {
		LoginPage loginPage=new LoginPage();
		loginPage.Login(getData("Adactin", 1, 0), getData("Adactin", 1, 1));
		
		//searchHotel
		
		SearchHotel searchhotel=new SearchHotel();
		searchhotel.SearchHotels(getData( "Adactin", 1, 2),getData("Adactin", 1, 3),
		getData("Adactin", 1, 4),getData("Adactin", 1, 5),getData("Adactin", 1, 6),
		getData("Adactin", 1, 7),getData("Adactin", 1, 8),getData("Adactin", 1, 9));
		
		//selecthotel
		SelectHotel hotel=new SelectHotel();
		hotel.selectHotel();
		
		//bookhotel
		
		BookHotelPage bookhotelpage=new BookHotelPage();
		bookhotelpage.BookHotelPages(getData("Adactin", 1, 10), getData("Adactin", 1, 11), 
	    getData("Adactin", 1, 12), getData("Adactin", 1, 13), getData("Adactin", 1, 14), 
		getData("Adactin", 1, 15), getData("Adactin", 1, 16), getData("Adactin", 1, 17));
		
		
		//Booking confirmation
		
		BookingConfirmPage bookingConfirmPage=new BookingConfirmPage();
		bookingConfirmPage.bookingconfirmation();
		
		// cancel booking
		CancelBookingPage cancelBookingPage=new CancelBookingPage();
		cancelBookingPage.cancelbooking(getData("Adactin", 1, 18));


	}  
}