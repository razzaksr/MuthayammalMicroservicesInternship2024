package com.doctor.doctor_api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Feign-Interceptor",url = "http://localhost:8085/patient")
public interface FiegnCommunicator {
    @GetMapping("/byDoctor/{docId}")
    public List<Patient> callPatients(@PathVariable("docId") int docId);
}
