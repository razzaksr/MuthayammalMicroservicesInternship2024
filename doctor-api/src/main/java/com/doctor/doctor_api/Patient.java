package com.doctor.doctor_api;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private int patientId;
    private String patientName;
    private int age;
    private String bloodGroup;
    private String address;
    private long contact;
    private String issue;
    private int doctorId;
}
