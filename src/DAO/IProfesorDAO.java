package DAO;

import entidades.Profesor;
import java.util.Collection;

public interface IProfesorDAO {

    public void create(Profesor profesor);

    public Profesor read(Integer id);

    public void update(Profesor profesor);

    public void delete(Profesor profesor);

     public Collection<Profesor> getAll();
    
}
