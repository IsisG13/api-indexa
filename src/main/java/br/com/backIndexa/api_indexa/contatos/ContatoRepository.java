package br.com.backIndexa.api_indexa.contatos;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contatos, Long> {
    boolean existsByTelefone(@NotBlank String telefone);

    boolean existsByEmail(@NotBlank String email);
}
