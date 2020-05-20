/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author carls
 */
@Entity
public class Doctor extends Usuario implements Serializable {

    @ManyToMany(mappedBy = "listaDoctoresInvolucrados")
    private List<LineaInvestigacion> lineaInvestigacions;

    
    @ManyToMany(mappedBy = "listaDoctoresInvolucrados",fetch=FetchType.LAZY)
    private Collection<PubRevistas> pubRevistas;

    
    @ManyToMany(mappedBy = "listaDoctoresInvolucrados",fetch=FetchType.LAZY)
    private Collection<PubCongreso> pubCongresos;
    
    
    @OneToMany(mappedBy = "encargado",fetch=FetchType.LAZY)
    private Collection<ProyectoInvestigacion> proyectoInvestigacionsEncargado;

    @ManyToMany(fetch=FetchType.LAZY)
    private Collection<Profesor>  listaSupervisados;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id=super.getId();
    
    private String doctorado;

    
    
    
    public Collection<PubCongreso> getPubCongresos() {
        return pubCongresos;
    }

    public void setPubCongresos(Collection<PubCongreso> pubCongresos) {
        this.pubCongresos = pubCongresos;
    }

    public Collection<PubRevistas> getPubRevistas() {
        return pubRevistas;
    }

    public void setPubRevistas(ArrayList<PubRevistas> pubRevistas) {
        this.pubRevistas = pubRevistas;
    }

    public Collection<Profesor> getListaSupervisados() {
        return listaSupervisados;
    }

    public void setListaSupervisados(ArrayList<Profesor> listaSupervisados) {
        this.listaSupervisados = listaSupervisados;
    }

    public Collection<PubRevistas> getPubRevistass() {
        return pubRevistas;
    }

    public void setPubRevistass(ArrayList<PubRevistas> pubRevistass) {
        this.pubRevistas = pubRevistass;
    }
    
    public String getDoctorado() {
        return doctorado;
    }

    public void setDoctorado(String doctorado) {
        this.doctorado = doctorado;
    }

    public Collection<ProyectoInvestigacion> getProyectoInvestigacionsEncargado() {
        return proyectoInvestigacionsEncargado;
    }

    public void setProyectoInvestigacionsEncargado(ArrayList<ProyectoInvestigacion> proyectoInvestigacionsEncargado) {
        this.proyectoInvestigacionsEncargado = proyectoInvestigacionsEncargado;
    }

    @Override
    public String toString() {
        return "entidades.Doctor[ id=" + id + " ]";
    }

}
