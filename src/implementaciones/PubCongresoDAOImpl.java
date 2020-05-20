/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import DAO.IPubCongresoDAO;
import entidades.PubCongreso;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author carls
 */
public class PubCongresoDAOImpl implements IPubCongresoDAO {

    EntityManager em;
    
   public PubCongresoDAOImpl(EntityManager em) {

        this.em = em;
    }

    @Override
    public void create(PubCongreso pubCongreso) {
        ensureTransaction();
        if (pubCongreso.getId() == null) {
            this.em.persist(pubCongreso);
            em.getTransaction().commit();

        } else {
            em.getTransaction().commit();
            this.em.merge(pubCongreso);

        }
    }

    @Override
    public PubCongreso read(Integer id) {
        ensureTransaction();
        PubCongreso pubCongreso = (PubCongreso) em.find(PubCongreso.class, id);

        return pubCongreso;
    }

    @Override
    public void update(PubCongreso pubCongreso) {
        ensureTransaction();
        em.merge(pubCongreso);
        em.getTransaction().commit();
    }

    @Override
    public void delete(PubCongreso pubCongreso) {
        ensureTransaction();

        em.remove(em.merge(pubCongreso));

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
    
}
