CREATE TABLE produto(

    id         INT          NOT NULL,
    nome       VARCHAR(45)  NOT NULL,
    descricao  VARCHAR(100),
    fotoUrl    VARCHAR(100),
    dataCadastro VARCHAR(45),
    dataUltimaAtualizacao VARCHAR(45),
    valorUnitario FLOAT,
    categoria INT
);

CREATE TABLE promocaoItem(
    id         INT          NOT NULL,
    idItem      INT         NOT NULL,
    valorPromocao       FLOAT,
    dataCadastro  VARCHAR(45),
    dataUltimaAtualizacao  VARCHAR(45)
);

CREATE TABLE categoria(
      id         INT          NOT NULL,
      imagemSimboloUrl       VARCHAR(45),
      nome  VARCHAR(100),
      descricao    VARCHAR(100)
);

CREATE TABLE tabelaPromocao(
      id         INT          NOT NULL,
      nome       VARCHAR(45),
      descricao  VARCHAR(100),
      dataInicio    VARCHAR(45),
      dataFim   VARCHAR(45),
      dataCadastro  VARCHAR(45),
      dataUltimaAtualizacao VARCHAR(45)
);

CREATE TABLE tabelaPromocaoItem(
       id         INT          NOT NULL,
       idPromocaoItem    INT,
       idTabelaPromocao  INT
);