package com.doctor.doctor_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorRemote remote;

    public Doctor implementFindByID(int id){
        return remote.findById(id).orElse(new Doctor());
    }

    public List<Doctor> implementFindAll(){
        return remote.findAll();
    }

    public Doctor implementSave(Doctor doctor){
        return remote.save(doctor);
    }
}
