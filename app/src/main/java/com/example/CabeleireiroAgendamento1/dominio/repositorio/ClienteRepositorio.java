package com.example.CabeleireiroAgendamento1.dominio.repositorio;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.example.CabeleireiroAgendamento1.dominio.entidades.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepositorio {

    private SQLiteDatabase conexao;

    public ClienteRepositorio(SQLiteDatabase conexao) {
        this.conexao = conexao;
    }

    public void inserir(Cliente cliente) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("nome", cliente.nome);
        contentValues.put("email", cliente.email);
        contentValues.put("senha", cliente.senha);

            conexao.insertOrThrow("cliente", null, contentValues);

    }

    public void excluir(int cliente_id) {
        String[] parametros = new String[1];
        parametros[0] = String.valueOf(cliente_id);

        conexao.delete("cliente", "cliente_id = ?", parametros);

    }

    public void alterar(Cliente cliente) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("nome", cliente.nome);
        contentValues.put("email", cliente.email);
        contentValues.put("senha", cliente.senha);

        String[] parametros = new String[1];
        parametros[0] = String.valueOf(cliente.cliente_id);

        conexao.update("cliente", contentValues, "cliente_id = ?", parametros);

    }

    public List<Cliente> consultar() {

        List<Cliente> clientes = new ArrayList<Cliente>();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT *");
        sql.append("FROM cliente");

        Cursor resultado = conexao.rawQuery(sql.toString(), null);

        if (resultado.getCount() > 0) {
            resultado.moveToFirst();

            do {
                Cliente cli = new Cliente();
                cli.nome = resultado.getString(resultado.getColumnIndexOrThrow("nome"));
                cli.email = resultado.getString(resultado.getColumnIndexOrThrow("email"));
                cli.senha = resultado.getString(resultado.getColumnIndexOrThrow("senha"));

                clientes.add(cli);
            } while (resultado.moveToNext());
        }

        return clientes;
    }

    public Cliente buscarCliente(String email) {

        Cliente cliente = new Cliente();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT cliente_id, nome, email, senha ");
        sql.append("FROM cliente ");
        sql.append("WHERE email = ? COLLATE NOCASE ");
        String[] parametros = new String[1];
        parametros[0] = String.valueOf(email);

        Cursor resultado = conexao.rawQuery(sql.toString(), parametros);

        if (resultado.getCount() > 0) {
            resultado.moveToFirst();
            cliente.cliente_id = resultado.getInt(resultado.getColumnIndexOrThrow("cliente_id"));
            cliente.nome = resultado.getString(resultado.getColumnIndexOrThrow("nome"));
            cliente.email = resultado.getString(resultado.getColumnIndexOrThrow("email"));
            cliente.senha = resultado.getString(resultado.getColumnIndexOrThrow("senha"));
        }
        return cliente;
    }
}
