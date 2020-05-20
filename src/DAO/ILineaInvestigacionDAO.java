package DAO;

import entidades.LineaInvestigacion;
import java.util.Collection;

public interface ILineaInvestigacionDAO {

    public void create(LineaInvestigacion lineaInvestigacion);

    public LineaInvestigacion read(Integer id);

    public void update(LineaInvestigacion lineaInvestigacion);

    public void delete(LineaInvestigacion lineaInvestigacion);

     public Collection<LineaInvestigacion> getAll();
    
    
}
