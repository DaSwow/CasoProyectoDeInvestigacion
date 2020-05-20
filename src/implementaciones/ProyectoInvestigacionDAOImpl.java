/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import DAO.IProyectoInvestigacionDAO;

import entidades.ProyectoInvestigacion;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author carls
 */
public class ProyectoInvestigacionDAOImpl implements IProyectoInvestigacionDAO {
    
    EntityManager em;

    public ProyectoInvestigacionDAOImpl(EntityManager em) {
        this.em = em;
    }
    
    
    @Override
    public void create(ProyectoInvestigacion proyectoInvestigacion) {
        ensureTransaction();
        if (proyectoInvestigacion.getId() == null) {
            this.em.persist(proyectoInvestigacion);
            em.getTransaction().commit();

        } else {
            em.getTransaction().commit();
            this.em.merge(proyectoInvestigacion);

        }
    }

    @Override
    public ProyectoInvestigacion read(Integer id) {
        ensureTransaction();
        ProyectoInvestigacion proyectoInvestigacion = (ProyectoInvestigacion) em.find(ProyectoInvestigacion.class, id);

        return proyectoInvestigacion;
    }

    @Override
    public void update(ProyectoInvestigacion proyectoInvestigacion) {
        ensureTransaction();
        em.merge(proyectoInvestigacion);
        em.getTransaction().commit();
    }

    @Override
    public void delete(ProyectoInvestigacion proyectoInvestigacion) {
        ensureTransaction();

        em.remove(em.merge(proyectoInvestigacion));

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
    public Collection<ProyectoInvestigacion> getAll() {
         Query query = em.createQuery("from " + ProyectoInvestigacion.class.getName()  + " c");

        ArrayList lista = new ArrayList(query.getResultList());
       
        return lista;
    }
}
