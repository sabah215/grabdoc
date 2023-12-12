package com.eitaciesproject.grabdoc.service;

import com.eitaciesproject.grabdoc.entity.Doctor;
import com.eitaciesproject.grabdoc.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DoctorService {

//    @Autowired
//    private DoctorRepository doctorRepository;
    @Autowired
    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository  doctorRepository){
        this.doctorRepository = doctorRepository;
    }

    public void save(Doctor doctor){

        doctorRepository.save(doctor);
    }

}