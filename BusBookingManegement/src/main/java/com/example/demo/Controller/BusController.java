package com.example.demo.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.BusBooking;
import com.example.demo.Service.BusService;

@RestController
public class BusController {
	@PostMapping("bookBus")
	public String bookBus(@RequestBody BusBooking bb) {
		BusService bs=new BusService();
		           bs.busBookInDB(bb);
		           
		           return "Bus is book";
	}

}
