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
}
