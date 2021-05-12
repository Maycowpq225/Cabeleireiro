package com.example.CabeleireiroAgendamento1.database;

public class ScriptDLL {

    public static String getCreateTableCliente() {
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE IF NOT EXISTS cliente( ");
        sql.append("cliente_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
        sql.append("nome varchar(30) NOT NULL, ");
        sql.append("email varchar(40) UNIQUE NOT NULL, ");
        sql.append("senha varchar(40) NOT NULL ");
        sql.append(") ");

        return sql.toString();
    }

    public static String createTableReservas(){
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE IF NOT EXISTS reserva( ");
        sql.append("agendamento_id INTEGER PRIMARY KEY AUTOINCREMENT, ");
        sql.append("servico varchar(30) NOT NULL, ");
        sql.append("data_e_hora_agendamento varchar(16) UNIQUE NOT NULL, ");
        sql.append("valor DECIMAL NOT NULL, ");
        sql.append("cliente_id INTEGER ");
        sql.append("FOREIGN KEY (client_id) REFERENCES cliente(client_id) ");
        sql.append(") ");

        return sql.toString();

    }
}
