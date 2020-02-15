package fr.ajaate.dora.dao;

import fr.ajaate.dora.entities.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {

    Staff findByusername(String username);
    Staff findByemail(String email);
    Staff findByID(Long staffID);
}