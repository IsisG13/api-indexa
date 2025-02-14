package br.com.backIndexa.api_indexa.controller;

import br.com.backIndexa.api_indexa.DTO.CadastroContatos;
import br.com.backIndexa.api_indexa.contatos.ContatoRepository;
import br.com.backIndexa.api_indexa.contatos.Contatos;
import br.com.backIndexa.api_indexa.exception.ExceptionUnique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("formulario")
public class indexaController {

    @Autowired
    private ContatoRepository repository;

    @PostMapping
    public ResponseEntity<CadastroContatos> cadastrar(@RequestBody CadastroContatos dados) {
        if (repository.existsByTelefone(dados.telefone())) {
            throw new ExceptionUnique("O telefone já esta em uso!");
        }

        if (repository.existsByEmail(dados.email())) {
            throw new ExceptionUnique("O email já esta em uso!");
        }

        repository.save(new Contatos(dados));
        return ResponseEntity.status(HttpStatus.CREATED).body(dados);
    }
}
