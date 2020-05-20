package DAO;

import entidades.LineaInvestigacion;

public interface ILineaInvestigacionDAO {

    public void create(LineaInvestigacion lineaInvestigacion);

    public LineaInvestigacion read(Integer id);

    public void update(LineaInvestigacion lineaInvestigacion);

    public void delete(LineaInvestigacion lineaInvestigacion);

}
