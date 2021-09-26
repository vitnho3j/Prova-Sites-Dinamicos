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

CREATE TABLE categoria(
    id         INT          NOT NULL,
    imagemSimboloUrl       VARCHAR(45),
    nome  VARCHAR(100),
    descricao    VARCHAR(100)
);