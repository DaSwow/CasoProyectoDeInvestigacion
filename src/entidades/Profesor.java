/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author carls
 */
@Entity
public class Profesor extends Usuario implements Serializable {


    public Doctor supervisor;

    public Periodo periodo;

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
    
    
    
    public Doctor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Doctor supervisor) {
        this.supervisor = supervisor;
    }


    


    @Override
    public String toString() {
        return "entidades.Profesor[ id=" + id + " ]";
    }
    
}
