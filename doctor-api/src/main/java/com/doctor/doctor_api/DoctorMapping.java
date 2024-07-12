package com.doctor.doctor_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorMapping {
    @Autowired
    DoctorService service;

    @PostMapping("/")
    public Doctor callSave(@RequestBody Doctor doctor){
        return service.implementSave(doctor);
    }

    @GetMapping("/{id}")
    public Doctor callOne(@PathVariable("id") int id){
        return service.implementFindByID(id);
    }

    @GetMapping("/")
    public List<Doctor> callFetch(){
        return service.implementFindAll();
    }
}
