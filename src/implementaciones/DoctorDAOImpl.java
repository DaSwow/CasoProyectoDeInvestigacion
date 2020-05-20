/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import DAO.IDoctorDAO;
import entidades.Doctor;
import java.util.ArrayList;

import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author carls
 */
public class DoctorDAOImpl implements IDoctorDAO {

    EntityManager em;

    public DoctorDAOImpl(EntityManager em) {

        this.em = em;
    }

    @Override
    public void create(Doctor doctor) {
        ensureTransaction();
        if (doctor.getId() == null) {
            this.em.persist(doctor);
            em.getTransaction().commit();

        } else {
            em.getTransaction().commit();
            this.em.merge(doctor);

        }
    }

    @Override
    public Doctor read(Integer id) {
        ensureTransaction();
        Doctor doctor = (Doctor) em.find(Doctor.class, id);

        return doctor;
    }

    @Override
    public void update(Doctor doctor) {
        ensureTransaction();
        em.merge(doctor);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Doctor doctor) {
        ensureTransaction();

        em.remove(em.merge(doctor));

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
    public Collection<Doctor> getAll() {
       Query query = em.createQuery("from " + Doctor.class.getName()  + " c");

        ArrayList lista = new ArrayList(query.getResultList());
       
        return lista;
    }

}
