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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author carls
 */
@Entity
public class ProgramaInvestigacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String departamento;

    @OneToMany(mappedBy = "programaInvestigacion")
    public Collection<PubCongreso> listaPubCongresos;

    
    @OneToMany(mappedBy = "programaInvestigacion")
    public Collection<PubRevistas> listaPubRevista;

    @OneToMany(mappedBy = "programaInvestigacion")
    public Collection<LineaInvestigacion> listaLineasInvestigacion;
    
    @OneToOne
    private Doctor encargado;

    @OneToMany(mappedBy = "programaInvestigacion")
    private Collection<ProyectoInvestigacion> proyectosInvestigacion;

    public Doctor getEncargado() {
        return encargado;
    }

    public void setEncargado(Doctor encargado) {
        this.encargado = encargado;
    }

    public Collection<ProyectoInvestigacion> getProyectosInvestigacion() {
        return proyectosInvestigacion;
    }

    public void setProyectosInvestigacion(ArrayList<ProyectoInvestigacion> proyectosInvestigacion) {
        this.proyectosInvestigacion = proyectosInvestigacion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof ProgramaInvestigacion)) {
            return false;
        }
        ProgramaInvestigacion other = (ProgramaInvestigacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.ProgramaInvestigacion[ id=" + id + " ]";
    }

}
