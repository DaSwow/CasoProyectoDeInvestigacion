/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import DAO.IProfesorDAO;
import entidades.Profesor;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author carls
 */
public class ProfesorDAOImpl implements IProfesorDAO {
    
    EntityManager em;
    
       public ProfesorDAOImpl(EntityManager em) {

        this.em = em;
    }

    @Override
    public void create(Profesor profesor) {
        
        ensureTransaction();
        if (profesor.getId() == null) {
            this.em.persist(profesor);
            em.getTransaction().commit();

        } else {
            em.getTransaction().commit();
            this.em.merge(profesor);

        }
    }

    @Override
    public Profesor read(Integer id) {
        ensureTransaction();
        Profesor profesor = (Profesor) em.find(Profesor.class, id);

        return profesor;
    }

    @Override
    public void update(Profesor profesor) {
        ensureTransaction();
        em.merge(profesor);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Profesor profesor) {
        ensureTransaction();

        em.remove(em.merge(profesor));

        em.getTransaction().commit();
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

    @Override
    public Collection<Profesor> getAll() {
        Query query = em.createQuery("from " + Profesor.class.getName()  + " c");

        ArrayList lista = new ArrayList(query.getResultList());
       
        return lista;
    }
}
