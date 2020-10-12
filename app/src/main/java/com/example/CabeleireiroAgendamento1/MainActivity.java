package com.example.CabeleireiroAgendamento1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import com.example.CabeleireiroAgendamento1.database.AgendamentoCabeleireiroOpenHelper;

public class MainActivity extends AppCompatActivity {

    private SQLiteDatabase conexao;

    private AgendamentoCabeleireiroOpenHelper agendamentoCabeleireiroOpenHelper;

    private ConstraintLayout constraintLayoutMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicarFazerCadastro(View e){
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }



}