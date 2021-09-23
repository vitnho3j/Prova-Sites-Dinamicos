package Prova.repository;

import Prova.model.entity.Produto;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ProdutoRepository {

    private JdbcTemplate jdbcTemplate;

    public ProdutoRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Produto> listarTodos(){
        return jdbcTemplate.query("select * from produto", new ProdutoMapper());

    }

    public Produto inserir(Produto produto) throws Exception{
        String sql = "insert into produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario) values (?, ?, ?, ?, ?, ?, ?)";
        int insert = jdbcTemplate.update(sql,
                produto.getId(),
                produto.getNome(),
                produto.getDescricao(),
                produto.getFotoUrl(),
                produto.getDataCadastro(),
                produto.getDataUltimaAtualizacao(),
                produto.getValorUnitario());

        if (insert == 1){
            return produto;
        }
        throw new Exception("O produto não foi inserido com sucesso");
    }

}
