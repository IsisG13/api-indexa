package br.com.backIndexa.api_indexa.contatos;

import br.com.backIndexa.api_indexa.DTO.CadastroContatos;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "contatos")
@Entity(name = "Contato")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Contatos {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String telefone;

    @Column(unique = true)
    private String email;
    private String aniversario;
    private String redes;
    private String observacoes;

    public Contatos(CadastroContatos dados) {
        this.id = dados.id();
        this.nome = dados.nome();
        this.telefone = dados.telefone();
        this.email = dados.email();
        this.aniversario = dados.aniversario();
        this.redes = dados.redes();
        this.observacoes = dados.observacoes();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getAniversario() {
        return aniversario;
    }

    public String getRedes() {
        return redes;
    }

    public String getObservacoes() {
        return observacoes;
    }
}
