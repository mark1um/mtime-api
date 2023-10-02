CREATE TABLE users(
                      id TEXT PRIMARY KEY UNIQUE NOT NULL,
                      login TEXT NOT NULL UNIQUE,
                      password TEXT NOT NULL,
                      role TEXT NOT NULL
);

CREATE TABLE atividades(
                           id TEXT PRIMARY KEY UNIQUE NOT NULL,
                           titulo TEXT NOT NULL,
                           descricao TEXT NOT NULL,
                           usuario_id TEXT NOT NULL,
                           data_atividade TIMESTAMP NOT NULL,
                           data_inicio TIMESTAMP NOT NULL,
                           data_fim TIMESTAMP NOT NULL,
                           horas DECIMAL NOT NULL,
                           FOREIGN KEY (usuario_id) REFERENCES USERS (id)
);