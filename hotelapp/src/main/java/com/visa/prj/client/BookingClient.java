package com.visa.prj.client;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.visa.prj.entity.Booking;
import com.visa.prj.entity.Hotel;
import com.visa.prj.entity.User;
import com.visa.prj.service.BookingService;


public class BookingClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.visa");
		ctx.refresh();
		
		BookingService service=ctx.getBean("bookingService",BookingService.class);
		
		User u1=service.getUser("n@gmail.com","n");
		//User u2=new User("Nandini123","a@gmail.com","a");
		Hotel h=service.findHotelById(2);
		Booking b1=new Booking(h,u1);
		
		
//		
//		Booking booking=new Booking(h, u1);
		long bid=service.createBooking(b1);
		System.out.println(bid);
		
		
		
	}

}
