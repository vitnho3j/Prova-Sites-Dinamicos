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


    @GetMapping("/{id}")
    public List<Produto> buscar
}



