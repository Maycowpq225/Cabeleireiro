package com.example.CabeleireiroAgendamento1.Po;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.CabeleireiroAgendamento1.R;

public class PerfilEReservasActivity extends AppCompatActivity {

    static String NomePerfilReserva_mudar;
    static String servicoPerfilReserva_mudar;
    static String servico2PerfilReserva_mudar;
    static String diaPerfilReserva_mudar;
    static String precoPerfilReserva_mudar;
    static String horarioPerfilReserva_mudar;

    private TextView textViewNomePerfil;
    private TextView servico;
    private TextView servico2;
    private TextView dia;
    private TextView preco;
    private TextView horario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_e_reservas);
        trocarServico(NomePerfilReserva_mudar, servicoPerfilReserva_mudar, servico2PerfilReserva_mudar, diaPerfilReserva_mudar, precoPerfilReserva_mudar, horarioPerfilReserva_mudar);
    }

    @SuppressLint({"WrongConstant", "WrongViewCast"})
    public void trocarServico(String NomePerfilReserva_mudar, String servicoPerfilReserva_mudar, String servico2PerfilReserva_mudar, String diaPerfilReserva_mudar, String precoPerfilReserva_mudar, String horarioPerfilReserva_mudar) {

        textViewNomePerfil = findViewById(R.id.textViewNomePerfil);
        textViewNomePerfil.setText(NomePerfilReserva_mudar);

        //-----------------------------------------------------------

        servico = findViewById(R.id.servico_editar_perfil_reservas);
        servico.setText(servicoPerfilReserva_mudar);

        //-----------------------------------------------------------

        servico2 = findViewById(R.id.servico2_editar_perfil_reservas);
        servico2.setText(servico2PerfilReserva_mudar);

        //-----------------------------------------------------------

        dia = findViewById(R.id.dia_marcado_reserva_perfil);
        dia.setText(diaPerfilReserva_mudar);

        //-----------------------------------------------------------

        preco = findViewById(R.id.preco_marcado_reserva_horario);
        preco.setText(precoPerfilReserva_mudar);

        //-----------------------------------------------------------

        horario = findViewById(R.id.horario_marcado_reserva_perfil);
        horario.setText(horarioPerfilReserva_mudar);
    }

    public void voltarServicosdePerfil(View view) {
        Intent intent = new Intent(this, ServicesActivity.class);
        startActivity(intent);
        this.finish();
    }

    @SuppressLint({"WrongConstant", "WrongViewCast"})
    public void excluirServico(View view) {
        servico = findViewById(R.id.servico_editar_perfil_reservas);
        servico2 = findViewById(R.id.servico2_editar_perfil_reservas);
        dia = findViewById(R.id.dia_marcado_reserva_perfil);
        preco = findViewById(R.id.preco_marcado_reserva_horario);
        horario = findViewById(R.id.horario_marcado_reserva_perfil);

        //-----------------------------------------------------------

        servico.setText("");
        servico2.setText("");
        dia.setText("");
        preco.setText("");
        horario.setText("");
    }
}