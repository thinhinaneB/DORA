package fr.ajaate.dora.services;


import fr.ajaate.dora.entities.Staff;

public interface StaffService{

    void save(Staff staff);
    Staff findByUsername(String username);

     Staff findByEmail(String email);
    Staff findByID(Long staffID);

    public Staff updateStaff(Long id, Staff newStaff );
}