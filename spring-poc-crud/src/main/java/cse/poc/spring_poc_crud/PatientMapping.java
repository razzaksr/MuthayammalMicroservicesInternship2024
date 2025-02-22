package cse.poc.spring_poc_crud;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/patient")
public class PatientMapping {

    @Autowired
    private PatientService service;

    @GetMapping("/byDoctor/{docId}")
    public List<Patient> callByDoc(@PathVariable("docId") int docId){
        return service.implementFindDoc(docId);
    }

    @GetMapping("/{id}")
    public Patient fetchOne(@PathVariable("id") int id){
        return service.implementFindById(id);
    }

    @PutMapping("/")
    public Patient progress(@RequestBody Patient patient){
        return service.implementSave(patient);
    }

    @DeleteMapping("/{id}")
    public String discharge(@PathVariable("id") int id){
        service.implementDelete(id);
        return id+" has discharged";
    }

    @GetMapping("/")
    public List<Patient> viewAll(){
        return service.implementFindAll();
    }

    @PostMapping("/")
    public Patient ip(@RequestBody Patient patient){
        return service.implementSave(patient);
    }
}
