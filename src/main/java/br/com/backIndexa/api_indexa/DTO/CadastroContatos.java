package br.com.backIndexa.api_indexa.DTO;

import br.com.backIndexa.api_indexa.contatos.Contatos;
import jakarta.validation.constraints.NotBlank;

public record CadastroContatos(
        Long id,
        @NotBlank String nome,
        @NotBlank String telefone,
        @NotBlank String email,
        String aniversario,
        String redes,
        String observacoes
) {

    public CadastroContatos(Contatos contatos) {
        this(
                contatos.getId(),
                contatos.getNome(),
                contatos.getTelefone(),
                contatos.getEmail(),
                contatos.getAniversario(),
                contatos.getRedes(),
                contatos.getObservacoes()
        );
    }
}
