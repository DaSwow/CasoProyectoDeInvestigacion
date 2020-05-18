/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import DAO.IAdministradorDAO;
import entidades.Administrador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class AdministradorDAOImpl implements IAdministradorDAO {

    private ResultSet result = null;
    private PreparedStatement pst = null;

    public AdministradorDAOImpl(EntityManager em) {
        this.em = em;
    }

    EntityManager em;

    @Override
    public boolean validarSesion(String nombre, String contra) {
        ensureTransaction();
        Administrador admin=new Administrador();   
        admin = (Administrador) em.find(Administrador.class, nombre);
        
        return admin.getContra().equalsIgnoreCase(contra);
    }

    public void ensureTransaction() {

        if (!em.getTransaction().isActive()) {
            em.getTransaction().begin();
        }
        EntityTransaction transaction = this.em.getTransaction();
        if (!transaction.isActive()) {
            transaction.begin();
        }

    }

}
