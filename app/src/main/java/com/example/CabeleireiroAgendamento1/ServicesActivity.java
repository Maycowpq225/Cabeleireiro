package com.example.CabeleireiroAgendamento1;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

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
            return true;
        }

        return super.onOptionsItemSelected(item);

    }
}