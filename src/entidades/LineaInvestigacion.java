package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import static org.eclipse.persistence.expressions.ExpressionOperator.any;

@Entity
public class LineaInvestigacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;

    public String nombre;

    public ArrayList<String> descriptores;

    public ArrayList<Object> listaProfesoresInvolucrados;

    public ArrayList<Object> getListaProfesoresInvolucrados() {
        return listaProfesoresInvolucrados;
    }

    public void setListaProfesoresInvolucrados(ArrayList<Object> listaProfesoresInvolucrados) {
        this.listaProfesoresInvolucrados = listaProfesoresInvolucrados;
    }

    public ArrayList<String> getDescriptores() {
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
