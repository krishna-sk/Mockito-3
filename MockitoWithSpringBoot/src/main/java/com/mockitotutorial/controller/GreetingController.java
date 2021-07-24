package com.mockitotutorial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mockitotutorial.service.BookingService;

@RestController
public class GreetingController {

	private BookingService bookingService;
	
	@RequestMapping("/greeting")
	public String index() {
		return "Greetings from The Happy Hotel. We've got enough beds for " + bookingService.getAvailablePlaceCount() + " guests!";
	}

	public GreetingController(BookingService bookingService) {
		this.bookingService = bookingService;
	}
	
}
