package com.example.CabeleireiroAgendamento1.Po;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.CabeleireiroAgendamento1.R;

public class HorarioMarcadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario_marcado);
        Toolbar toolbar = findViewById(R.id.toolbarHorarioMarcado);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_reservas) {
            //TODO fazer tela de reservas
            Toast.makeText(getApplicationContext(), "Minhas reservas selecionadas", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, PerfilEReservasActivity.class);
            startActivity(intent);
            this.finish();
            return true;
        }

        if (id == R.id.action_perfil) {
            //TODO fazer tela de perfil
            Toast.makeText(getApplicationContext(), "Perfil selecionado", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, PerfilEReservasActivity.class);
            startActivity(intent);
            this.finish();
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
    public void voltarParaOMenuPrincipal(View view){
        Intent intent = new Intent(this, ServicesActivity.class);
        startActivity(intent);
        this.finish();
    }
}