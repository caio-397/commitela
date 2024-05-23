# commitela

testando commitela

CREATE TABLE db_produtos2.tb_produtos (
	id INT auto_increment NOT NULL,
	nome varchar(100) NOT NULL,
	descricao varchar(100) NOT NULL,
	quantidade INT NOT NULL,
	preco DOUBLE NOT NULL,
	`data` varchar(100) NOT NULL,
	total DOUBLE NOT NULL,
	CONSTRAINT tb_produtos_pk PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;