package com.doctor.doctor_api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRemote extends JpaRepository<Doctor,Integer> {

}
