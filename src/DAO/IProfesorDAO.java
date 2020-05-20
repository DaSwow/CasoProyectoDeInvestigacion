package DAO;

import entidades.Profesor;

public interface IProfesorDAO {

    public void create(Profesor profesor);

    public Profesor read(Integer id);

    public void update(Profesor profesor);

    public void delete(Profesor profesor);

}
