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


@Entity
public class LineaInvestigacion implements Serializable {

    @ManyToMany(mappedBy = "listaLineasInvestigacion",fetch=FetchType.LAZY)
    private List<PubRevistas> pubRevistass;

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;

    private String nombre;

    private Collection<String> descriptores;

    @ManyToMany
    private Collection<Profesor> listaProfesoresInvolucrados;

    @ManyToMany
    private Collection<Doctor> listaDoctoresInvolucrados;
    
    @OneToMany(mappedBy = "lineaInvestigacion")
    private Collection<PubCongreso> pubCongresos;

    @OneToMany(mappedBy = "lineaInvestigacion")
    private Collection<PubRevistas> pubRevistas;
    
    
    public Collection<Doctor> getListaDoctoresInvolucrados() {
        return listaDoctoresInvolucrados;
    }

    public void setListaDoctoresInvolucrados(Collection<Doctor> listaDoctoresInvolucrados) {
        this.listaDoctoresInvolucrados = listaDoctoresInvolucrados;
    }
    
    public List<PubRevistas> getPubRevistass() {
        return pubRevistass;
    }

    public void setPubRevistass(List<PubRevistas> pubRevistass) {
        this.pubRevistass = pubRevistass;
    }

    public Collection<PubCongreso> getPubCongresos() {
        return pubCongresos;
    }

    public void setPubCongresos(Collection<PubCongreso> pubCongresos) {
        this.pubCongresos = pubCongresos;
    }

    public Collection<PubRevistas> getPubRevistas() {
        return pubRevistas;
    }

    public void setPubRevistas(Collection<PubRevistas> pubRevistas) {
        this.pubRevistas = pubRevistas;
    }

    
    
 
    
    public Collection<Profesor> getListaProfesoresInvolucrados() {
        return listaProfesoresInvolucrados;
    }

    public void setListaProfesoresInvolucrados(ArrayList<Profesor> listaProfesoresInvolucrados) {
        this.listaProfesoresInvolucrados = listaProfesoresInvolucrados;
    }

    public Collection<String> getDescriptores() {
        return descriptores;
    }

    public void setDescriptores(ArrayList<String> descriptores) {
        this.descriptores = descriptores;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return codigo;
    }

    public void setId(Long id) {
        this.codigo = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LineaInvestigacion)) {
            return false;
        }
        LineaInvestigacion other = (LineaInvestigacion) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.LineaInvestigacion[ id=" + codigo + " ]";
    }

}
