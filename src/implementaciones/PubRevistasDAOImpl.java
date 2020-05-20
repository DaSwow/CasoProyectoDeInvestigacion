/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import DAO.IPubRevistasDAO;
import entidades.PubRevistas;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author carls
 */
public class PubRevistasDAOImpl implements IPubRevistasDAO {
    EntityManager em=null;
    
       public PubRevistasDAOImpl(EntityManager em) {

        this.em = em;
    }

    @Override
    public void create(PubRevistas pubRevistas) {
        ensureTransaction();
        if (pubRevistas.getId() == null) {
            this.em.persist(pubRevistas);
            em.getTransaction().commit();

        } else {
            em.getTransaction().commit();
            this.em.merge(pubRevistas);

        }
    }

    @Override
    public PubRevistas read(Integer id) {
        ensureTransaction();
        PubRevistas pubRevistas = (PubRevistas) em.find(PubRevistas.class, id);

        return pubRevistas;
    }

    @Override
    public void update(PubRevistas pubRevistas) {
        ensureTransaction();
        em.merge(pubRevistas);
        em.getTransaction().commit();
    }

    @Override
    public void delete(PubRevistas pubRevistas) {
        ensureTransaction();

        em.remove(em.merge(pubRevistas));

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
