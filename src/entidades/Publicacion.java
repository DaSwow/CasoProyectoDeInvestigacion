package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public abstract class Publicacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="idPublicacion")
    private Integer id;

    @Column (name="idProyecto")
    private Integer idProyecto;

    @Column (name="titulo")
    private String titulo;


    @ManyToMany(cascade=CascadeType.PERSIST)
    @JoinColumn(name="listaDoctoresInvolucrados")
    private ArrayList<Doctor> listaDoctoresInvolucrados;
    
    @ManyToMany(cascade=CascadeType.PERSIST)
    @JoinColumn(name="listaProfesoresInvolucrados")
    private ArrayList<Profesor> listaProfesoresInvolucrados;


    private ArrayList<LineaInvestigacion> listaLineasInvestigacion;

    private ArrayList<String> OrdenFirmas;

    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<LineaInvestigacion> getListaLineasInvestigacion() {
        return listaLineasInvestigacion;
    }

    public void setListaLineasInvestigacion(ArrayList<LineaInvestigacion> listaLineasInvestigacion) {
        this.listaLineasInvestigacion = listaLineasInvestigacion;
    }

    public ArrayList<String> getOrdenFirmas() {
        return OrdenFirmas;
    }

    public void setOrdenFirmas(ArrayList<String> OrdenFirmas) {
        this.OrdenFirmas = OrdenFirmas;
    }

    public ArrayList<Doctor> getListaDoctoresInvolucrados() {
        return listaDoctoresInvolucrados;
    }

    public void setListaDoctoresInvolucrados(ArrayList<Doctor> listaDoctoresInvolucrados) {
        this.listaDoctoresInvolucrados = listaDoctoresInvolucrados;
    }

    
    
    public ArrayList<Profesor> getListaProfesoresInvolucrados() {
        return listaProfesoresInvolucrados;
    }

    public void setListaProfesoresInvolucrados(ArrayList<Profesor> listaProfesoresInvolucrados) {
        this.listaProfesoresInvolucrados = listaProfesoresInvolucrados;
    
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
        if (!(object instanceof Publicacion)) {
            return false;
        }
        Publicacion other = (Publicacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Publicacion[ id=" + id + " ]";
    }

}
