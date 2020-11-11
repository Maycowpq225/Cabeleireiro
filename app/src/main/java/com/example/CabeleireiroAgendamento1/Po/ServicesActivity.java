package com.example.CabeleireiroAgendamento1.Po;

import android.content.Intent;
import android.os.Bundle;

import com.example.CabeleireiroAgendamento1.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ServicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    /**
     * Clica no serviço de cortar cabelo
     *
     * @param view para o metodo aparecer no layout
     */
    public void clicarCorte(View view){
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
        CalendarActivity.servicoMudar = getString(R.string.Corte);
        CalendarActivity.precoTrocar = "20,00";
        CalendarActivity.mediaTempoTrocar = "1 Hora";
        HorariosDisponiveisActivity.servicoMudar1 = getString(R.string.Corte);
        HorariosDisponiveisActivity.precoTrocar1 = "20,00";
        HorariosDisponiveisActivity.mediaTempoTrocar1 = "1 Hora";
        this.finish();
    }
    /**
     * Clica no serviço de cortar cabelo
     *
     * @param view para o metodo aparecer no layout
     */
    public void clicarManicure(View view){
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
        CalendarActivity.servicoMudar = getString(R.string.Manicure);
        CalendarActivity.precoTrocar = "50,00";
        CalendarActivity.mediaTempoTrocar = "2 Hora";
        HorariosDisponiveisActivity.servicoMudar1 = getString(R.string.Manicure);
        HorariosDisponiveisActivity.precoTrocar1 = "50,00";
        HorariosDisponiveisActivity.mediaTempoTrocar1 = "2 Hora";
        this.finish();
    }
    /**
     * Clica no serviço de cortar cabelo
     *
     * @param view para o metodo aparecer no layout
     */
    public void clicarSobrancelha(View view){
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
        CalendarActivity.servicoMudar = getString(R.string.Sobrancelha);
        CalendarActivity.precoTrocar = "40,00";
        CalendarActivity.mediaTempoTrocar = "1 Hora";
        HorariosDisponiveisActivity.servicoMudar1 = getString(R.string.Sobrancelha);
        HorariosDisponiveisActivity.precoTrocar1 = "40,00";
        HorariosDisponiveisActivity.mediaTempoTrocar1 = "1 Hora";
        this.finish();
    }
    /**
     * Clica no serviço de cortar cabelo
     *
     * @param view para o metodo aparecer no layout
     */
    public void clicarPedicure(View view){
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
        CalendarActivity.servicoMudar = getString(R.string.Pedicure);
        CalendarActivity.precoTrocar = "20,00";
        CalendarActivity.mediaTempoTrocar = "1 Hora";
        HorariosDisponiveisActivity.servicoMudar1 = getString(R.string.Pedicure);
        HorariosDisponiveisActivity.precoTrocar1 = "20,00";
        HorariosDisponiveisActivity.mediaTempoTrocar1 = "1 Hora";
        this.finish();
    }
    /**
     * Clica no serviço de cortar cabelo
     *
     * @param view para o metodo aparecer no layout
     */
    public void clicarMaquiagem(View view){
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
        CalendarActivity.servicoMudar = getString(R.string.Maquiagem);
        CalendarActivity.precoTrocar = "30,00";
        CalendarActivity.mediaTempoTrocar = "1 Hora";
        HorariosDisponiveisActivity.servicoMudar1 = getString(R.string.Maquiagem);
        HorariosDisponiveisActivity.precoTrocar1 = "30,00";
        HorariosDisponiveisActivity.mediaTempoTrocar1 = "1 Hora";
        this.finish();
    }
    /**
     * Clica no serviço de cortar cabelo
     *
     * @param view para o metodo aparecer no layout
     */
    public void clicarColoracaoCapilar(View view){
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
        CalendarActivity.servicoMudar = getString(R.string.Coloracao);
        CalendarActivity.servicoMudar2 = getString(R.string.Capilar);
        CalendarActivity.precoTrocar = "60,00";
        CalendarActivity.mediaTempoTrocar = "2 Hora";
        HorariosDisponiveisActivity.servicoMudar1 = getString(R.string.Coloracao);
        HorariosDisponiveisActivity.servicoMudar21 = getString(R.string.Capilar);
        HorariosDisponiveisActivity.precoTrocar1 = "60,00";
        HorariosDisponiveisActivity.mediaTempoTrocar1 = "2 Hora";
        this.finish();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_reservas) {
            //TODO fazer tela de reservas
            Toast.makeText(getApplicationContext(), "Minhas reservas selecionadas", Toast.LENGTH_LONG).show();
            return true;
        }

        if (id == R.id.action_perfil) {
            //TODO fazer tela de perfil
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
}