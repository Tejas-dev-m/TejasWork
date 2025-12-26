package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Doctor;
import com.example.demo.Service.HospitalService;

@RestController
public class HospitalController {

	@Autowired
	HospitalService hs;

	@PostMapping("Doctor")
	public String addDoctor(@RequestBody Doctor d) {
		hs.save(d);
		return "Doctor Is Added";
	}

	@GetMapping("Doctor/{id}")
	public Doctor getDoctor(@PathVariable int id) {
		return hs.getDoctor(id);

	}

	@DeleteMapping("Doctor/{id}")
	public String deleteDoctor(int id) {
		hs.delete(id);
		return "Delete Doctor";

	}
	

}
