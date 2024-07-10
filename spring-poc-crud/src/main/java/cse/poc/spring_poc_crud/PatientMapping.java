package cse.poc.spring_poc_crud;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/patient")
public class PatientMapping {
    private List<Patient> dharanHospitals=new ArrayList<>();

    @PostConstruct
    public void admit(){
        dharanHospitals.add(new Patient(122,"Gowshika",19,"O+","SAlem",7654567865L,"Breathing trouble"));
        dharanHospitals.add(new Patient(110,"Aarthi",19,"B+","SAlem",654567876L,"Fever"));
        dharanHospitals.add(new Patient(972,"Abhinaya",19,"A+","SAlem",87645678234L,"Cough"));
        dharanHospitals.add(new Patient(918,"Anisha",19,"A+","SAlem",65456789L,"Cold"));
    }

    @PutMapping("/")
    public String progress(@RequestBody Patient patient){
        int index = -1;
        // find the index in the list of given patient id
        for(int pos=0;pos< dharanHospitals.size();pos++){
            if(dharanHospitals.get(pos).getPatientId()== patient.getPatientId()) {
                index = pos;
                break;
            }
        }
        if(index!=-1){
            dharanHospitals.set(index,patient);
            return patient.getPatientName()+" has updated";
        }
        else{
            return patient.getPatientName()+" hasn't updated";
        }
    }

    @DeleteMapping("/{id}")
    public String discharge(@PathVariable("id") int id){
        int oldSize=dharanHospitals.size();
        dharanHospitals=dharanHospitals.stream().filter((obj)->{
            return obj.getPatientId()!=id;
        }).collect(Collectors.toList());
        if(oldSize!= dharanHospitals.size())
            return id+" has been discharged";
        else
            return id+" not in the IP";
    }

    @GetMapping("/")
    public List<Patient> viewAll(){
        return dharanHospitals;
    }

    @PostMapping("/")
    public Patient ip(@RequestBody Patient patient){
        dharanHospitals.add(patient);
        return patient;
    }
}
