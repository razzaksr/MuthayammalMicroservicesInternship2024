package com.doctor.doctor_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorRemote remote;

    @Autowired
    FiegnCommunicator fiegnCommunicator;

    public Doctor implementFindByID(int id){
        Doctor obj = remote.findById(id).orElse(new Doctor());
        if(obj!=null){
            obj.setMyPatients(fiegnCommunicator.callPatients(obj.getDoctorId()));
        }
        return obj;
    }

    public List<Doctor> implementFindAll(){
        return remote.findAll();
    }

    public Doctor implementSave(Doctor doctor){
        return remote.save(doctor);
    }
}
