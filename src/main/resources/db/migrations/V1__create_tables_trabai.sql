CREATE TABLE IF NOT EXISTS  Usuario(
                         ID_cliente INT AUTO_INCREMENT NOT NULL,
                         nome VARCHAR(255) NOT NULL,
                         email VARCHAR(255) NOT NULL UNIQUE,
                         senha VARCHAR(255) NOT NULL,
                         data_nascimento VARCHAR(11) NOT NULL,
                         CPF VARCHAR(11) UNIQUE,
                         tipo_usuario ENUM('CLIENTE','ADM') NOT NULL,
                         PRIMARY KEY (ID_cliente)
);