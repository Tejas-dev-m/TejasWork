package com.example.demo.Service;

import com.example.demo.Entity.Doctor;

public interface HospitalService {
	public void save(Doctor d);
	public void delete(int id);
	public Doctor getDoctor(int id);
	public void deleteAll();
	
	

}
