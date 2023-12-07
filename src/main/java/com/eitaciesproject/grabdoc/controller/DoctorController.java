package com.eitaciesproject.grabdoc.controller;

import com.eitaciesproject.grabdoc.entity.Doctor;
import com.eitaciesproject.grabdoc.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/grabdoc")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;


    @PostMapping(path = "/add/doctor/")
    public @ResponseBody Doctor add(@RequestBody Doctor doctor){
        System.out.println(doctor.toString());
        doctorService.save(doctor);
        return doctor;
    }
}
