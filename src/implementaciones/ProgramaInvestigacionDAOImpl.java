/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import DAO.IProgramaInvestigacionDAO;
import entidades.ProgramaInvestigacion;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author carls
 */
public class ProgramaInvestigacionDAOImpl implements IProgramaInvestigacionDAO {

    EntityManager em;

    public ProgramaInvestigacionDAOImpl(EntityManager em) {

        this.em = em;
    }

    @Override
    public void create(ProgramaInvestigacion programaInvestigacion) {
        ensureTransaction();
        if (programaInvestigacion.getId() == null) {
            this.em.persist(programaInvestigacion);
            em.getTransaction().commit();

        } else {
            em.getTransaction().commit();
            this.em.merge(programaInvestigacion);

        }
    }

    @Override
    public ProgramaInvestigacion read(Integer id) {
        ensureTransaction();
        ProgramaInvestigacion programaInvestigacion = (ProgramaInvestigacion) em.find(ProgramaInvestigacion.class, id);

        return programaInvestigacion;
    }

    @Override
    public void update(ProgramaInvestigacion programaInvestigacion) {
        ensureTransaction();
        em.merge(programaInvestigacion);
        em.getTransaction().commit();
    }

    @Override
    public void delete(ProgramaInvestigacion programaInvestigacion) {
        ensureTransaction();

        em.remove(em.merge(programaInvestigacion));

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
    public Collection<ProgramaInvestigacion> getAll() {
        Query query = em.createQuery("from " + ProgramaInvestigacion.class.getName()  + " c");

        ArrayList lista = new ArrayList(query.getResultList());
       
        return lista;
    }

}
