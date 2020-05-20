/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Doctor;
import entidades.ProgramaInvestigacion;
import java.util.Collection;

/**
 *
 * @author carls
 */
public interface IProgramaInvestigacionDAO {
    
     public void create(ProgramaInvestigacion programaInvestigacion);

    public ProgramaInvestigacion read(Integer id);

    public void update(ProgramaInvestigacion programaInvestigacion);

    public void delete(ProgramaInvestigacion programaInvestigacion);

     public Collection<ProgramaInvestigacion> getAll();
    
    
}
