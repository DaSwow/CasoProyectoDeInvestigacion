/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author carls
 */
@Entity
public class PubCongreso extends Publicacion implements Serializable {

    @ManyToOne
    private ProgramaInvestigacion programaInvestigacion;

    @ManyToOne
    private LineaInvestigacion lineaInvestigacion;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id=super.getId();
    private String nombreCongreso;
    
    private String tipo="Publicación en Congreso";
    
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    
    private String lugar;
    
    private String pais;
    
    private String editorialActas;

    
    @ManyToMany(fetch=FetchType.LAZY)
    private Collection<Doctor> listaDoctoresInvolucrados = super.getListaDoctoresInvolucrados();

    
    @ManyToMany(fetch=FetchType.LAZY)
    private Collection<Profesor> listaProfesoresInvolucrados = super.getListaProfesoresInvolucrados();


    @ManyToMany(fetch=FetchType.LAZY)
    private Collection<LineaInvestigacion> listaLineasInvestigacion = super.getListaLineasInvestigacion();
    
    public String getNombreCongreso() {
        return nombreCongreso;
    }

    public void setNombreCongreso(String nombreCongreso) {
        this.nombreCongreso = nombreCongreso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEditorialActas() {
        return editorialActas;
    }

    public void setEditorialActas(String editorialActas) {
        this.editorialActas = editorialActas;
    }

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

    
    
}
