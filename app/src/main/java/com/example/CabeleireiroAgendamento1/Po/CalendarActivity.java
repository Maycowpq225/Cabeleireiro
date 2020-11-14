package com.example.CabeleireiroAgendamento1.Po;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.CabeleireiroAgendamento1.R;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class CalendarActivity extends AppCompatActivity {

    static String servicoMudar;
    static String servicoMudar2;
    static String precoTrocar;
    static String mediaTempoTrocar;

    private TextView servico;
    private TextView servico2;
    private TextView preco;
    private TextView mediaTempo;

    private CalendarView calendario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        Toolbar toolbar = findViewById(R.id.toolbarCalendar);
        setSupportActionBar(toolbar);
        trocarServico(servicoMudar, servicoMudar2, precoTrocar, mediaTempoTrocar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_reservas) {
            Toast.makeText(getApplicationContext(), "Minhas reservas selecionadas", Toast.LENGTH_LONG).show();
            return true;
        }

        if (id == R.id.action_perfil) {
            Toast.makeText(getApplicationContext(), "Perfil selecionado", Toast.LENGTH_LONG).show();
            return true;
        }

        if (id == R.id.action_sair) {
            Toast.makeText(getApplicationContext(), "Sair selecionado", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Muda o TextView de principal para o servico solicitado
     *
     * @param servicoTrocar
     */
    public void trocarServico(String servicoTrocar, String servicoTrocar2, String precoTrocar, String mediaTempoTrocar) {
        servico = findViewById(R.id.servico_editar);
        servico.setText(servicoTrocar);

        //-----------------------------------------
        servico2 = findViewById(R.id.servico_editar2);
        servico2.setText(servicoTrocar2);
        //-----------------------------------------
        preco = findViewById(R.id.textViewValor);
        preco.setText(precoTrocar);

        //-----------------------------------------
        mediaTempo = findViewById(R.id.textViewMediaTempo);
        mediaTempo.setText(mediaTempoTrocar);
    }

    /**
     * volta para aba anterior
     *
     * @param view
     */
    public void voltarServicos(View view) {
        Intent intent = new Intent(this, ServicesActivity.class);
        startActivity(intent);
        this.finish();
    }

    public void avancarServicos(View view) {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date((calendario = findViewById(R.id.calendarView)).getDate());
        PerfilEReservasActivity.diaPerfilReserva_mudar = sdf1.format(date);
        Intent intent = new Intent(this, HorariosDisponiveisActivity.class);
        startActivity(intent);
        this.finish();
    }
}