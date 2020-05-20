/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author carls
 */
@Entity

public class Profesor extends Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id = super.getId();

    private Doctor supervisor;

    private Periodo periodo;

    @ManyToMany(mappedBy="listaProfesoresInvolucrados",cascade=CascadeType.PERSIST)
    @JoinColumn(name="listaPublicaciones")
    private ArrayList<Publicacion> listaPublicaciones;

    public ArrayList<Publicacion> getListaPublicaciones() {
        return listaPublicaciones;
    }

    public void setListaPublicaciones(ArrayList<Publicacion> listaPublicaciones) {
        this.listaPublicaciones = listaPublicaciones;
    }
    
    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public Doctor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Doctor supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return "entidades.Profesor[ id=" + id + " ]";
    }

}
