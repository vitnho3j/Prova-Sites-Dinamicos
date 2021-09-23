package Prova.repository;

import Prova.model.entity.Produto;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.data.relational.core.sql.SQL;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoMapper implements RowMapper<Produto> {

    @Override
    public Produto mapRow(ResultSet resultSet, int i) throws SQLException{
        Produto produto = new Produto();
        produto.setId(resultSet.getInt("id"));
        produto.setNome(resultSet.getNString("nome"));
        produto.setDescricao(resultSet.getString("descricao"));
        produto.setFotoUrl(resultSet.getString("fotoUrl"));
        produto.setDataCadastro(resultSet.getString("dataCadastro"));
        produto.setDataUltimaAtualizacao(resultSet.getString("dataUltimaAtualizacao"));
        produto.setValorUnitario(resultSet.getFloat("valorUnitario"));
        return produto;
    }
}
