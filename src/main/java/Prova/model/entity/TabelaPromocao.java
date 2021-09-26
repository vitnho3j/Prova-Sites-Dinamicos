package Prova.model.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class TabelaPromocao {
    private Integer id;
    private String nome;
    private String descricao;
    private Date dataInicio;
    private Date dataFim;
    private DateTimeFormat dataCadastro;
    private DateTimeFormat dataUltimaAtualizacao;
    private Administrador administrador;
    private List<Produto> produtos;

    public TabelaPromocao(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
