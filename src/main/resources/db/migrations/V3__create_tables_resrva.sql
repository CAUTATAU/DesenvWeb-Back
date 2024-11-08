CREATE TABLE IF NOT EXISTS Reserva (
            ID_reserva INT AUTO_INCREMENT NOT NULL,
            ID_cliente INT NOT NULL,
            data DATE NOT NULL,
            status_reserva ENUM('PENDENTE','CONFIRMADO', 'CANCELADO') NOT NULL,
            PRIMARY KEY (ID_reserva, ID_cliente),
            FOREIGN KEY (ID_cliente) REFERENCES usuario (id)
    )