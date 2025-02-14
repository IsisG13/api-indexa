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
        this.nome = dados.nome();
        this.telefone = dados.telefone();
        this.email = dados.email();
        this.aniversario = dados.aniversario();
        this.redes = dados.redes();
        this.observacoes = dados.observacoes();
    }
}
