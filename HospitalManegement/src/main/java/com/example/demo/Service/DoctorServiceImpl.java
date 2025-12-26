package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Doctor;
import com.example.demo.Repository.HospitalRepo;

@Service
public class DoctorServiceImpl implements HospitalService {

	@Autowired
	HospitalRepo hr;

	@Override
	public void save(Doctor d) {
		hr.save(d);
	}

	@Override
	public void delete(int id) {
		hr.deleteById(id);
	}

	@Override
	public Doctor getDoctor(int id) {
		return hr.findById(id).get();
	}

	@Override
	public void deleteAll() {
		hr.deleteAll();
	}

}
