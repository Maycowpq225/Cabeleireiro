package com.example.CabeleireiroAgendamento1;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.CabeleireiroAgendamento1.database.AgendamentoCabeleireiroOpenHelper;
import com.example.CabeleireiroAgendamento1.dominio.entidades.Cliente;
import com.example.CabeleireiroAgendamento1.dominio.repositorio.ClienteRepositorio;

public class MainActivity extends AppCompatActivity {

    private SQLiteDatabase conexao;
    private ClienteRepositorio clienteRepositorio;
    private AgendamentoCabeleireiroOpenHelper agendamentoCabeleireiroOpenHelper;
    private Cliente cliente;
    private TextView digitar_email1_login;
    private TextView digitar_senha_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        criarConexao(this);
    }

    /**
     * Classe reponsavel por fazer o login caso os dados estejam certos
     */
    public void clicarLogin(View e){
        digitar_email1_login = findViewById(R.id.digitar_email1_login);
        String email = digitar_email1_login.getText().toString();
        digitar_senha_login = findViewById(R.id.digitar_senha_login);
        String senha = digitar_senha_login.getText().toString();
        cliente = clienteRepositorio.buscarCliente(email);
       if(!email.equalsIgnoreCase("") && !senha.equalsIgnoreCase("") && cliente.getEmail() != null && cliente.getSenha().equals(senha)){
           //TODO implementar função de entrar na tela serviços
            this.finish();
        }else{
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle("erro");
            dlg.setIcon(R.drawable.ic_baseline_error_24);
            dlg.setMessage("Algo deu errado, verifique os campos!");
            dlg.setNeutralButton("OK", null);
            dlg.show();
        }
    }

    /**
     * Metodo para ir ao CadastroActivity
     *
     * @param e não sei oque é, mas sem ele nao aparece o metodo mo activity_cadastro.xml para fazer o click
     */
    public void clicarFazerCadastro(View e){
        Intent intent = new Intent(this, CadastroActivity.class);
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