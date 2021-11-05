import com.arelance.empresa.imd.dao.ClienteDAO;
import com.arelance.empresa.imd.domain.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Manuel
 */
@Stateless
public class ClienteDAOImpl implements ClienteDAO {

    @PersistenceContext(unitName = "ImdPU")
    EntityManager em;

    @Override
    public List<Cliente> listarClientes() {
        return em.createNamedQuery("Cliente.findAll").getResultList();
    }

    @Override
    public Cliente EncontrarClientePorID(Cliente cliente) {
        return em.find(Cliente.class, cliente.getIdCliente());
    }

    @Override
    public Cliente EncontrarClientePorNick(Cliente cliente) {
        try {
            Query q = em.createNamedQuery("Cliente.findByNick").setParameter("nick", cliente.getNick());
            return (Cliente) q.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public void AñadirCliente(Cliente cliente) {
        em.persist(cliente);
    }

    @Override
    public void ModificarCliente(Cliente cliente) {
        em.merge(cliente);
    }

    @Override
    public void RemoverCliente(Cliente cliente) {
        em.remove(em.merge(cliente));
    }

    @Override
    public Cliente EncontrarClientePorPassword(Cliente cliente) {
        try {
            Query q = em.createNamedQuery("Cliente.findByPassword").setParameter("password", cliente.getPassword());
            return (Cliente) q.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public Cliente ValidarCliente(Cliente cliente) {
        try {
            Query q = em.createNamedQuery("Cliente.ValidarCliente").setParameter("nick", cliente.getNick()).
                    setParameter("password", cliente.getPassword());
            return (Cliente) q.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

}
