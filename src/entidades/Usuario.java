/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author carls
 */
@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String stringnombre;

    private String apellidos;

    private String telefono;

    private Integer numDespacho;

    private ArrayList<Publicacion> listaPublicaciones;

    private ArrayList<LineaInvestigacion> listaLineaInvParticipadas;

    public ArrayList<LineaInvestigacion> getListaLineaInvParticipadas() {
        return listaLineaInvParticipadas;
    }

    public void setListaLineaInvParticipadas(ArrayList<LineaInvestigacion> listaLineaInvParticipadas) {
        this.listaLineaInvParticipadas = listaLineaInvParticipadas;
    }

    public ArrayList<Publicacion>  getListaPublicaciones() {
        return listaPublicaciones;
    }

    public void setListaPublicaciones(ArrayList<Publicacion>  listaPublicaciones) {
        this.listaPublicaciones = listaPublicaciones;
    }

    public Integer getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(Integer numDespacho) {
        this.numDespacho = numDespacho;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getStringnombre() {
        return stringnombre;
    }

    public void setStringnombre(String stringnombre) {
        this.stringnombre = stringnombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Usuario[ id=" + id + " ]";
    }

}
