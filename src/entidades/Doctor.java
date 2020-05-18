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
public class Doctor extends Usuario implements Serializable {

    Profesor supervisado;

    String doctorado;

    public Profesor getSupervisado() {
        return supervisado;
    }

    public void setSupervisado(Profesor supervisado) {
        this.supervisado = supervisado;
    }

    @Override
    public String toString() {
        return "entidades.Doctor[ id=" + id + " ]";
    }

}
