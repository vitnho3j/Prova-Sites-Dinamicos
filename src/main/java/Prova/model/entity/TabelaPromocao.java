package Prova.model.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class TabelaPromocao {
    private Integer id;
    private String nome;
    private String descricao;
    private Date dataInicio;
    private Date dataFim;
    private DateTimeFormat dataCadastro;
    private DateTimeFormat dataUltimaAtualizacao;
    private Administrador administrador;

}
