INSERT INTO categoria(id, imagemSimboloUrl, nome, descricao)
VALUES (1, 'Test', 'Camisa', 'Categoria de camisetas');

INSERT INTO categoria(id, imagemSimboloUrl, nome, descricao)
VALUES (2, 'Test', 'Tenis', 'Categoria dos Tênis');

INSERT INTO categoria(id, imagemSimboloUrl, nome, descricao)
VALUES (4, 'Test', 'Chuteira', 'Categoria dos Tênis');

INSERT INTO categoria(id, imagemSimboloUrl, nome, descricao)
VALUES (3, 'Test', 'Casaco', 'Categoria dos Casaco');


INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario, categoria)
VALUES (1, 'Vans Old Schol', 'Tênis da marca Vans', 'teste', '23/09/2021', '23/09/2021', 50.0, 2);

INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario, categoria)
VALUES (5, 'Vans Old Schol', 'Tênis da marca Vans', 'teste', '23/09/2021', '23/09/2021', 50.0, 4);

INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario, categoria)
VALUES (4, 'Supra TK', 'Tênis da marca Supra', 'teste', '23/09/2021', '23/09/2021', 200.0, 2);

INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario, categoria)
VALUES (2, 'Camisa', 'Camisa da marca da Nike', 'teste', '23/09/2021', '23/09/2021', 55.99, 1);

INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario, categoria)
VALUES (3, 'Casaco','Casaco da marca da Adidas', 'teste', '23/09/2021', '23/09/2021', 189.99, 3);


INSERT INTO promocaoItem(id, idItem, valorPromocao, dataCadastro, dataUltimaAtualizacao)
VALUES (1, 3, 50.0, '23/09/2021', '23/09/2021');

INSERT INTO tabelaPromocao(id, nome, descricao, dataInicio, dataFim, dataCadastro, dataUltimaAtualizacao)
VALUES (1, 'BLACK FRIDAY', 'TODOS OS NOSSOS CASACOS EM PROMOÇÃO', '23/09/2021', '25/09/2021', '23/09/2021', '23/09/2021');

INSERT INTO tabelaPromocaoItem(id, idPromocaoItem, idTabelaPromocao)
VALUES (1, 1, 1);

INSERT INTO categoria(id, imagemSimboloUrl, nome, descricao)
VALUES (3, 'Test', 'Casaco', 'Categoria dos Casaco');

