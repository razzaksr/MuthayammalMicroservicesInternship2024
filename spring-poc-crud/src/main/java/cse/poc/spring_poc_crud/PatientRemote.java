package cse.poc.spring_poc_crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
save>>insert/update object into relational rows
findAll
findById
findByPropertyName
findAllByPropertyName
deleteById
 */

@Repository
public interface PatientRemote extends JpaRepository<Patient,Integer> {
    List<Patient> findAllByDoctorId(int docId);
}
