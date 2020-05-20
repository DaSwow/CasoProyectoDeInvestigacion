
package implementaciones;

import DAO.ILineaInvestigacionDAO;
import entidades.LineaInvestigacion;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class LineaInvestigacionDAOImpl implements ILineaInvestigacionDAO{

    EntityManager em;
    
   public LineaInvestigacionDAOImpl(EntityManager em) {

        this.em = em;
    }

    @Override
    public void create(LineaInvestigacion lineaInvestigacion) {
        ensureTransaction();
        if (lineaInvestigacion.getId() == null) {
            this.em.persist(lineaInvestigacion);
            em.getTransaction().commit();

        } else {
            em.getTransaction().commit();
            this.em.merge(lineaInvestigacion);

        }
    }

    @Override
    public LineaInvestigacion read(Integer id) {
        ensureTransaction();
        LineaInvestigacion lineaInvestigacion = (LineaInvestigacion) em.find(LineaInvestigacion.class, id);

        return lineaInvestigacion;
    }

    @Override
    public void update(LineaInvestigacion lineaInvestigacion) {
        ensureTransaction();
        em.merge(lineaInvestigacion);
        em.getTransaction().commit();
    }

    @Override
    public void delete(LineaInvestigacion lineaInvestigacion) {
        ensureTransaction();

        em.remove(em.merge(lineaInvestigacion));

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
