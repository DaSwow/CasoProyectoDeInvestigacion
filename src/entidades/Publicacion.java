package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publicacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Integer idProyecto;

    public String titulo;

    public ArrayList<Object> listaProfesoresInvolucrados;

    public ArrayList<LineaInvestigacion> listaLineasInvestigacion;

    public ArrayList<String> OrdenFirmas;

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

    public ArrayList<Object> getListaProfesoresInvolucrados() {
        return listaProfesoresInvolucrados;
    }

    public void setListaProfesoresInvolucrados(ArrayList<Object> listaProfesoresInvolucrados) {
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
