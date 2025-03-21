package net.haji.ormspringdatajpa.dao.repositories;

import net.haji.ormspringdatajpa.dao.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
