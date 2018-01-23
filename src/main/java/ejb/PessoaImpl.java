package ejb;

import model.Pessoa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PessoaImpl implements PessoaEJB {

    @PersistenceContext(unitName = "Tarefa")
    EntityManager entityManager;

    public void insert(Pessoa pessoa) {
        entityManager.persist(pessoa);
    }

    @Override
    public void delete(Pessoa pessoa) {

    }

    @Override
    public void update(Pessoa pessoa) {

    }

    @Override
    public void find(Pessoa pessoa) {

    }
}
