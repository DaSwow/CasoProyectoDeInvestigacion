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

/**
 *
 * @author carls
 */
@Entity

public class Profesor extends Usuario implements Serializable {

    @ManyToMany(mappedBy = "listaProfesoresInvolucrados")
    private List<LineaInvestigacion> lineaInvestigacions;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id = super.getId();

    private Periodo periodo;

    @ManyToMany(mappedBy = "listaSupervisados",fetch=FetchType.LAZY)
    private Collection<Doctor> listaSupervisores;
    
   
    @ManyToMany(mappedBy = "listaProfesoresInvolucrados",fetch=FetchType.LAZY)
    private Collection<PubRevistas> pubRevistas;


    @ManyToMany(mappedBy = "listaProfesoresInvolucrados",fetch=FetchType.LAZY)
    private Collection<PubCongreso> pubCongresos;

    public List<LineaInvestigacion> getLineaInvestigacions() {
        return lineaInvestigacions;
    }

    public void setLineaInvestigacions(List<LineaInvestigacion> lineaInvestigacions) {
        this.lineaInvestigacions = lineaInvestigacions;
    }

    public Collection<PubCongreso> getPubCongresos() {
        return pubCongresos;
    }

    public void setPubCongresos(ArrayList<PubCongreso> pubCongresos) {
        this.pubCongresos = pubCongresos;
    }
    
    public Collection<Doctor> getListaSupervisores() {
        return listaSupervisores;
    }

    public void setListaSupervisores(ArrayList<Doctor> listaSupervisores) {
        this.listaSupervisores = listaSupervisores;
    }

    public Collection<PubRevistas> getPubRevistas() {
        return pubRevistas;
    }

    public void setPubRevistas(ArrayList<PubRevistas> pubRevistas) {
        this.pubRevistas = pubRevistas;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "entidades.Profesor[ id=" + id + " ]";
    }

}
