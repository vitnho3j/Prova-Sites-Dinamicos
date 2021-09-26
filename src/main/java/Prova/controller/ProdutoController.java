package Prova.controller;


import Prova.model.entity.Produto;
import Prova.repository.ProdutoMapper;
import Prova.repository.ProdutoRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private ProdutoRepository ProdutoRepository;

    public ProdutoController(JdbcTemplate jdbcTemplate){
        ProdutoRepository = new ProdutoRepository(jdbcTemplate);
    }

    @GetMapping
    public List<Produto> listarTodos(){
        return ProdutoRepository.listarTodos();
    }

    @PostMapping
    public Produto inserir(@RequestBody Produto produto) throws Exception {
        return ProdutoRepository.inserir(produto);
    }

    @GetMapping("/{nome}")
    public List<Produto> buscarTodosProdutosPorNome(@PathVariable("nome") String nome){
        return ProdutoRepository.VisualizarDadosProduto(nome);
    }

}
