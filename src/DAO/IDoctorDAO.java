package DAO;

import entidades.Doctor;

public interface IDoctorDAO {

    public void create(Doctor doctor);

    public Doctor read(Integer id);

    public void update(Doctor doctor);

    public void delete(Doctor doctor);

}
