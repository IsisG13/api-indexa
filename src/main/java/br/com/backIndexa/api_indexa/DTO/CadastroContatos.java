package br.com.backIndexa.api_indexa.DTO;

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
}
