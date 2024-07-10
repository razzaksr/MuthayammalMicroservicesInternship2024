package cse.poc.spring_poc_crud;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

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
}
