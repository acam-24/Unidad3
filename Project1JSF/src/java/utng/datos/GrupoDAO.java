package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Grupo;

public class GrupoDAO extends DAO<Grupo>{

    public GrupoDAO() {
        super(new Grupo());
    }

    
    protected Grupo getOneById(Grupo grupo) 
            throws HibernateException {
        return super.getOneById(grupo.getIdGrupo()); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
