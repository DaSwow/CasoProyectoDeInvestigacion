/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class PubRevistas extends Publicacion implements Serializable {

    @ManyToOne
    private ProgramaInvestigacion programaInvestigacion;

    @ManyToOne
    private LineaInvestigacion lineaInvestigacion;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id = super.getId();

    private String editorial;

    private String nombre;

    private Integer numero;

    private Integer pagInicio;

    private Integer pagFin;

  
    @ManyToMany(fetch=FetchType.LAZY)
    private Collection<Doctor> listaDoctoresInvolucrados = super.getListaDoctoresInvolucrados();

    
    @ManyToMany(fetch=FetchType.LAZY)
    private Collection<Profesor> listaProfesoresInvolucrados = super.getListaProfesoresInvolucrados();

    
    @ManyToMany(fetch=FetchType.LAZY)
    private Collection<LineaInvestigacion> listaLineasInvestigacion = super.getListaLineasInvestigacion();

    public LineaInvestigacion getLineaInvestigacion() {
        return lineaInvestigacion;
    }

    public void setLineaInvestigacion(LineaInvestigacion lineaInvestigacion) {
        this.lineaInvestigacion = lineaInvestigacion;
    }

   
    @Override
    public Collection<Doctor> getListaDoctoresInvolucrados() {
        return listaDoctoresInvolucrados;
    }

    
    @Override
    public void setListaDoctoresInvolucrados(ArrayList<Doctor> listaDoctoresInvolucrados) {
        this.listaDoctoresInvolucrados = listaDoctoresInvolucrados;
    }

    @Override
    public Collection<Profesor> getListaProfesoresInvolucrados() {
        return listaProfesoresInvolucrados;
    }

    @Override
    public void setListaProfesoresInvolucrados(ArrayList<Profesor> listaProfesoresInvolucrados) {
        this.listaProfesoresInvolucrados = listaProfesoresInvolucrados;
    }

    @Override
    public Collection<LineaInvestigacion> getListaLineasInvestigacion() {
        return listaLineasInvestigacion;
    }

    @Override
    public void setListaLineasInvestigacion(ArrayList<LineaInvestigacion> listaLineasInvestigacion) {
        this.listaLineasInvestigacion = listaLineasInvestigacion;
    }

    
    
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getPagInicio() {
        return pagInicio;
    }

    public void setPagInicio(Integer pagInicio) {
        this.pagInicio = pagInicio;
    }

    public Integer getPagFin() {
        return pagFin;
    }

    public void setPagFin(Integer pagFin) {
        this.pagFin = pagFin;
    }

}
