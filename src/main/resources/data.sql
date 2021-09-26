INSERT INTO categoria(id, imagemSimboloUrl, nome, descricao)
VALUES (1, 'Test', 'Camisa', 'Categoria de camisetas');

INSERT INTO categoria(id, imagemSimboloUrl, nome, descricao)
VALUES (2, 'Test', 'Tenis', 'Categoria dos Tênis');

INSERT INTO categoria(id, imagemSimboloUrl, nome, descricao)
VALUES (3, 'Test', 'Casaco', 'Categoria dos Casaco');


INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario, categoria)
VALUES (1, 'Vans Old Schol', 'Tênis da marca Vans', 'teste', '23/09/2021', '23/09/2021', 50.0, 2);

INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario, categoria)
VALUES (2, 'Camisa', 'Camisa da marca da Nike', 'teste', '23/09/2021', '23/09/2021', 55.99, 1);

INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario, categoria)
VALUES (3, 'Casaco','Casaco da marca da Adidas', 'teste', '23/09/2021', '23/09/2021', 189.99, 3);

