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
public class PubRevistas extends Publicacion implements Serializable {


    private String editorial;
    
    private String nombre;
    
    private Integer numero;
    
    private Integer pagInicio;
    
    private Integer pagFin;

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getPagInicio() {
        return pagInicio;
    }

    public void setPagInicio(Integer pagInicio) {
        this.pagInicio = pagInicio;
    }

    public Integer getPagFin() {
        return pagFin;
    }

    public void setPagFin(Integer pagFin) {
        this.pagFin = pagFin;
    }


    
}
