package com.example.CabeleireiroAgendamento1.dominio.repositorio;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.style.AlignmentSpan;

import com.example.CabeleireiroAgendamento1.dominio.entidades.Cliente;
import com.example.CabeleireiroAgendamento1.dominio.entidades.Reserva;

import java.util.ArrayList;
import java.util.List;

public class ReservaRepositorio {

    private SQLiteDatabase conexao;

    public ReservaRepositorio(SQLiteDatabase conexao) {
        this.conexao = conexao;
    }

    /**
     * Insere uma reserva no banco de dados
     *
     * @param reserva reserva a ser inserida no banco
     */
    public void inserirReserva(Reserva reserva) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("data_e_hora_agendamento", reserva.getData_e_hora_agendamento());
        contentValues.put("valor", reserva.getValor());
        contentValues.put("cliente_id", reserva.getCliente().getCliente_id());
        contentValues.put("servico", reserva.getServico());
        conexao.insertOrThrow("reserva", null, contentValues);
    }


    public List<Reserva> buscarReserva(Cliente cliente) {

        List<Reserva> reservaList = new ArrayList<>();

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * ");
        sql.append("FROM reserva ");
        sql.append("WHERE client_id = ?");
        String[] parametros = new String[1];
        parametros[0] = String.valueOf(cliente.getCliente_id());
        Cursor resultado = conexao.rawQuery(sql.toString(), parametros);
        if (resultado.getCount() > 0) {
            //resultado.moveToFirst();
            String servico = resultado.getString(resultado.getColumnIndexOrThrow("servico"));
            String dataEhora = resultado.getString(resultado.getColumnIndexOrThrow("data_e_hora_agendamento"));
            Double valor = resultado.getDouble(resultado.getColumnIndexOrThrow("valor"));
            reservaList.add(new Reserva(servico,dataEhora,valor,cliente));
        }
        return reservaList;
    }
}
