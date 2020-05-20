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
public class Doctor extends Usuario implements Serializable {

    Profesor supervisado;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id=super.getId();
    
    String doctorado;

    @ManyToMany(cascade=CascadeType.PERSIST,mappedBy="listaDoctoresInvolucrados")
    @JoinColumn(name="listaPublicaciones")
    private ArrayList<Publicacion> listaPublicaciones;


    public String getDoctorado() {
        return doctorado;
    }

    public void setDoctorado(String doctorado) {
        this.doctorado = doctorado;
    }

    public ArrayList<Publicacion> getListaPublicaciones() {
        return listaPublicaciones;
    }

    public void setListaPublicaciones(ArrayList<Publicacion> listaPublicaciones) {
        this.listaPublicaciones = listaPublicaciones;
    }
    
    
    
    public Profesor getSupervisado() {
        return supervisado;
    }

    public void setSupervisado(Profesor supervisado) {
        this.supervisado = supervisado;
    }

    @Override
    public String toString() {
        return "entidades.Doctor[ id=" + id + " ]";
    }

}
