package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Docente;

public class DocenteDAO extends DAO<Docente>{

    public DocenteDAO() {
        super(new Docente());
    }

    protected Docente getOneById(Docente docente) throws HibernateException {
        return super.getOneById(docente.getIdDocente()); //To change body of generated methods, choose Tools | Templates.
    }

    
     

}
