package fr.ajaate.dora.dao;

import fr.ajaate.dora.entities.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {

    Staff findByUsername(String username);
    Staff findByEmail(String email);
    Staff findByID(Long staffID);
}