package com.example.CabeleireiroAgendamento1.dominio.entidades;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.example.CabeleireiroAgendamento1.database.AgendamentoCabeleireiroOpenHelper;

public class Cliente {

    private Integer cliente_id;
    private String nome;
    private String email;
    private String senha;



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

    public void setCliente_id(Integer cliente_id) {
        this.cliente_id = cliente_id;
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
