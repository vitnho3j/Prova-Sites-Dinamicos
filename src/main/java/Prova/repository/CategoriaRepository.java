package Prova.repository;

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

    public List<Produto> listarTodosPorNomeValor(Integer id, String nome, Float valor){
        return jdbcTemplate.query("select * from produto where categoria = ???", new Object[]{id, nome, valor}, new ProdutoMapper());
    }

    public List<Produto> listarTodosPorNomeValor(Integer id, String nome){
        return jdbcTemplate.query("select * from produto where categoria = ??", new Object[]{id, nome}, new ProdutoMapper());
    }

    public List<Produto> listarTodosPorNomeValor(Integer id, Float valor){
        return jdbcTemplate.query("select * from produto where categoria = ??", new Object[]{id, valor}, new ProdutoMapper());
    }
}
