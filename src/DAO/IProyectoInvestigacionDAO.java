/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entidades.Profesor;
import entidades.ProyectoInvestigacion;

/**
 *
 * @author carls
 */
public interface IProyectoInvestigacionDAO {
    
     public void create(ProyectoInvestigacion proyectoInvestgaInvestigacion);

    public ProyectoInvestigacion read(Integer id);

    public void update(ProyectoInvestigacion proyectoInvestgaInvestigacion);

    public void delete(ProyectoInvestigacion proyectoInvestgaInvestigacion);

    
}
