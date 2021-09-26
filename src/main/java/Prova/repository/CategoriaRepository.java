package Prova.repository;

import Prova.model.entity.Categoria;
import Prova.model.entity.Produto;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class CategoriaRepository {
    private JdbcTemplate jdbcTemplate;

    public CategoriaRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Produto> listarTodos(Integer id){
        return jdbcTemplate.query("select * from produto where categoria = ?", new Object[]{id}, new ProdutoMapper());
    }

    public Integer getId(String nome){
        return jdbcTemplate.queryForObject("select * from categoria where nome = ?", new Object[]{nome}, new CategoriaMapper()).getId();
    }

    public List<Produto> listarTodos(String nome){
        CategoriaRepository categoria = new CategoriaRepository(jdbcTemplate);
        Integer categoriaNumero = categoria.getId(nome);
        return jdbcTemplate.query("select * from produto where categoria = ?", new Object[]{categoriaNumero}, new ProdutoMapper());
    }


    public List<Produto> listarTodosPorNome(Integer id, String nome){
        return jdbcTemplate.query("select * from produto where categoria = ? and nome = ?", new Object[]{id, nome}, new ProdutoMapper());
    }

    public List<Produto> listarTodosPorNomeValor(Integer id, String nome, Float valor){
        return jdbcTemplate.query("select * from produto where categoria = ? and nome = ? and valorUnitario between ? and ?+100", new Object[]{id, nome, valor, valor}, new ProdutoMapper());
    }
}
