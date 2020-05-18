package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public String programaInvestigacion;

    public String acronimo;

    public float presupuesto;

    public String programaFinanciador;

    public Date fechaInicio;

    public Date fechaFin;

    public String descripcion;

    public Doctor encargado;

    public Integer numeroPublicaciones;

    public String getProgramaInvestigacion() {
        return programaInvestigacion;
    }

    public void setProgramaInvestigacion(String programaInvestigacion) {
        this.programaInvestigacion = programaInvestigacion;
    }

    public String getAcronimo() {
        return acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getProgramaFinanciador() {
        return programaFinanciador;
    }

    public void setProgramaFinanciador(String programaFinanciador) {
        this.programaFinanciador = programaFinanciador;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Doctor getEncargado() {
        return encargado;
    }

    public void setEncargado(Doctor encargado) {
        this.encargado = encargado;
    }

    public Integer getNumeroPublicaciones() {
        return numeroPublicaciones;
    }

    public void setNumeroPublicaciones(Integer numeroPublicaciones) {
        this.numeroPublicaciones = numeroPublicaciones;
    }

    
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        if (!(object instanceof Proyecto)) {
            return false;
        }
        Proyecto other = (Proyecto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Proyecto[ id=" + id + " ]";
    }

}
