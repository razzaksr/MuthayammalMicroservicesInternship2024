package cse.poc.spring_poc_crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    PatientRemote remote;

    public List<Patient> implementFindDoc(int docId){
        return remote.findAllByDoctorId(docId);
    }

    public Patient implementFindById(int patientID){
        return remote.findById(patientID).orElse(new Patient());
    }

    public void implementDelete(int id){
        remote.deleteById(id);
    }

    public List<Patient> implementFindAll(){
        return remote.findAll();
    }

    public Patient implementSave(Patient patient){
        return remote.save(patient);
    }
}
