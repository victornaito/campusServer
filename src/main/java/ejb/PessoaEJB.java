package ejb;

import model.Pessoa;

import javax.ejb.Local;

@Local
public interface PessoaEJB {
    void insert(Pessoa pessoa);
    void delete(Pessoa pessoa);
    void update(Pessoa pessoa);
    void find(Pessoa pessoa);
}
