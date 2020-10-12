package com.example.CabeleireiroAgendamento1.dominio.entidades;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.example.CabeleireiroAgendamento1.database.AgendamentoCabeleireiroOpenHelper;

public class Cliente {

    public Integer cliente_id;
    public String nome;
    public String email;
    public String senha;



    public Cliente(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Cliente() {
    }

    public void cadastrar(){

    }
    public void logar(){

    }

    public Integer getCliente_id() {
        return cliente_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
