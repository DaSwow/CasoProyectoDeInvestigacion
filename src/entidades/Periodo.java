
package entidades;

import java.io.Serializable;
import java.util.Date;



public class Periodo implements Serializable {

    private static final long serialVersionUID = 1L;
 
   Date inicio;
   Date fin;

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

   
    
}
