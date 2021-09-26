package Prova.model.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class PromocaoItem {
    private Integer id;
    private Float valorPromocao;
    private DateTimeFormat dataCadastro;
    private DateTimeFormat dataUltimaAtualizacao;
    private TabelaPromocao tabelaPromocao;
    private Produto produto;


}
