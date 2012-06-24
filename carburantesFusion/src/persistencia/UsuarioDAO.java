package persistencia;


import modelo.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author HOUSE
 */
public class UsuarioDAO {

    public UsuarioDAO() {
    }

    
   public static Usuario buscar(String cuenta, String contrasenia)
   { 
       Usuario u = null;
   SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
   Session sesion = sessionFactory.openSession();
    
    Transaction tx = sesion.beginTransaction();
    
   
    
    String consulta = "from Usuario as us  WHERE us.cuenta = :c  and us.contrasenia = :p" ;
    Query q = sesion.createQuery(consulta);
    q.setString("c", cuenta);
    q.setString("p", contrasenia);
    
    u = (Usuario) q.uniqueResult();
    
    tx.commit();
    sesion.close();
   return u;
   }
    
    
}