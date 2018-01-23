package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Pessoa")
@Table(name = "Pessoa")
@SequenceGenerator(name = "pessoa_id",allocationSize = 1)
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(generator = "pessoa_id", strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome")
    private String nome;

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;

        Pessoa pessoa = (Pessoa) o;

        return getId() == pessoa.getId();
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
