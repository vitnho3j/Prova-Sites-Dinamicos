package Prova.repository;

import Prova.model.entity.Categoria;
import Prova.model.entity.Produto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoriaMapper implements RowMapper<Categoria> {
    @Override
    public Categoria mapRow(ResultSet resultSet, int i) throws SQLException {
        Categoria categoria = new Categoria();
        Produto produto = new Produto();
        categoria.setId(resultSet.getInt("id"));
        categoria.setNome(resultSet.getNString("nome"));
        categoria.setDescricao(resultSet.getString("descricao"));
        categoria.setImagemSimboloUrl(resultSet.getString("imagemSimboloUrl"));
        return categoria;
    }
}
