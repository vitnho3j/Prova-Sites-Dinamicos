package Prova.controller;

import Prova.model.entity.Categoria;
import Prova.model.entity.Produto;
import Prova.repository.CategoriaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    private CategoriaRepository CategoriaRepository;

    public CategoriaController(JdbcTemplate jdbcTemplate) {
        CategoriaRepository = new CategoriaRepository(jdbcTemplate);
    }

    @GetMapping("/{id}")
    public List<Produto> buscar(@PathVariable int id) {
        return CategoriaRepository.listarTodos(id);
    }


    @GetMapping("/{id}/{nome}")
    public List<Produto> buscarPorNomeProduto(@PathVariable("id") Integer id, @PathVariable("nome") String nome) {
        return CategoriaRepository.listarTodosPorNome(id, nome);
    }

    @GetMapping("/{id}/{nome}/{valor}")
    public List<Produto> buscarPorNome_Valor_Produto(@PathVariable("id") Integer id, @PathVariable("nome") String nome,  @PathVariable("valor") Float valor) {
        return CategoriaRepository.listarTodosPorNomeValor(id, nome, valor);
    }
}



