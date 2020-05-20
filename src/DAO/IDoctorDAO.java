package DAO;

import entidades.Doctor;
import java.util.Collection;

public interface IDoctorDAO {

    public void create(Doctor doctor);

    public Doctor read(Integer id);

    public Collection<Doctor> getAll();
    
    public void update(Doctor doctor);

    public void delete(Doctor doctor);

}
