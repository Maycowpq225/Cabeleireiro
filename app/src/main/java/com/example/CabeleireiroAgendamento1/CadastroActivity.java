package com.example.CabeleireiroAgendamento1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.CabeleireiroAgendamento1.database.AgendamentoCabeleireiroOpenHelper;
import com.example.CabeleireiroAgendamento1.dominio.entidades.Cliente;
import com.example.CabeleireiroAgendamento1.dominio.repositorio.ClienteRepositorio;

public class CadastroActivity extends AppCompatActivity {

    private SQLiteDatabase conexao;
    private ClienteRepositorio clienteRepositorio;
    private AgendamentoCabeleireiroOpenHelper agendamentoCabeleireiroOpenHelper;
    private Cliente cliente;
    private EditText digitar_nome1_cadastro = null;
    private EditText digitar_email1_cadastro = null;
    private EditText digitar_senha1_cadastro = null;
    private EditText digitar_senha2_cadastro = null;
    private boolean cadastro = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        criarConexao(this);
    }

    public void validarTodosCamposEEscrever(View e) throws InterruptedException {
        digitar_nome1_cadastro = findViewById(R.id.digitar_nome1_cadastro);
        digitar_email1_cadastro = findViewById(R.id.digitar_email1_cadastro);
        digitar_senha1_cadastro = findViewById(R.id.digitar_senha1_cadastro);
        digitar_senha2_cadastro = findViewById(R.id.digitar_senha2_cadastro);
        String nome = digitar_nome1_cadastro.getText().toString();
        String email = digitar_email1_cadastro.getText().toString();
        String senha = digitar_senha1_cadastro.getText().toString();
        String senha2 = digitar_senha2_cadastro.getText().toString();

        if (!nome.equalsIgnoreCase("") && !email.equalsIgnoreCase("") && !senha.equalsIgnoreCase("") && senha.equals(senha2)) {

            cliente = new Cliente(nome, email, senha);
            System.out.println(clienteRepositorio.buscarCliente(cliente.email).getEmail());
            System.out.println(cliente.getEmail());
            if (clienteRepositorio.buscarCliente(cliente.email).getEmail() == null) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(this);
                dlg.setTitle("Sucesso!");
                dlg.setIcon(R.drawable.ic_baseline_done_24);
                dlg.setMessage("Você tem certeza que seus dados estão corretos?");
                dlg.setCancelable(false);
                dlg.setNegativeButton("NÃO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Favor fazer o registro de conta novamente!", Toast.LENGTH_LONG).show();
                        voltarParaMain();
                    }
                });
                dlg.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Sua conta foi criada com sucesso!!", Toast.LENGTH_LONG).show();
                        clienteRepositorio.inserir(cliente);
                        voltarParaMain();
                    }
                });
                AlertDialog alertDialog = dlg.create();
                alertDialog.show();
            }else{
                AlertDialog.Builder dlg = new AlertDialog.Builder(this);
                dlg.setTitle("ERROR");
                dlg.setIcon(R.drawable.ic_baseline_error_24);
                dlg.setMessage("JÁ EXISTE UMA CONTA COM ESSE EMAIL");
                dlg.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "TENTAR NOVAMENTE", Toast.LENGTH_LONG).show();
                        voltarParaMain();
                    }
                });
                dlg.show();
            }
        } else {
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle("erro");
            dlg.setIcon(R.drawable.ic_baseline_error_24);
            dlg.setMessage("Algo deu errado, verifique os campos!");
            dlg.setNeutralButton("OK", null);
            dlg.show();
        }

    }

    public void voltarParaMain() {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

    /**
     * Cria a conexão com o banco de dados
     *
     * @param context activity a ser conectada
     */
    public void criarConexao(Context context) {

        try {

            agendamentoCabeleireiroOpenHelper = new AgendamentoCabeleireiroOpenHelper(context);

            conexao = agendamentoCabeleireiroOpenHelper.getWritableDatabase();

            clienteRepositorio = new ClienteRepositorio(conexao);


        } catch (SQLException ex) {

            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle("erro");
            dlg.setIcon(R.drawable.ic_baseline_error_24);
            dlg.setMessage(ex.getMessage());
            dlg.setNeutralButton("OK", null);
            dlg.show();
        }
    }
}