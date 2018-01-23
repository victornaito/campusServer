package Test;

import com.mysql.cj.core.exceptions.ExceptionFactory;
import model.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.logging.Logger;


public class PessoaTest {

    private String string;

    public static void main(String[] args) throws RuntimeException {

        EntityManager entityManager = null;
        Pessoa pessoa = new Pessoa();

        try {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Tarefa");
            entityManager = entityManagerFactory.createEntityManager();

            pessoa.setNome("Naito");

            entityManager.getTransaction().begin();
            entityManager.persist(pessoa);
            entityManager.getTransaction().commit();

        } catch (RuntimeException exceptionFactory) {
            System.out.println(exceptionFactory.toString());
        } finally {
            entityManager.close();
            System.out.println("Conexão Fechada!");
        }

    }

    @Override
    public String toString() {
        string = "Pessoa: " + this;
        return string;
    }
}
