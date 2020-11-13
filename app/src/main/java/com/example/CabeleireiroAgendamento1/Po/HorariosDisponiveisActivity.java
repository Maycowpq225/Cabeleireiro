package com.example.CabeleireiroAgendamento1.Po;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.CabeleireiroAgendamento1.R;

import java.util.List;

public class HorariosDisponiveisActivity extends AppCompatActivity {

    static String servicoMudar1;
    static String servicoMudar21;
    static String precoTrocar1;
    static String mediaTempoTrocar1;

    private TextView servico;
    private TextView servico2;
    private TextView preco;
    private TextView mediaTempo;

    private CheckBox checkbox_meat1;
    private CheckBox checkbox_meat2;
    private CheckBox checkbox_meat3;
    private CheckBox checkbox_meat4;
    private CheckBox checkbox_meat5;
    private CheckBox checkbox_meat6;
    private CheckBox checkbox_meat7;
    private CheckBox checkbox_meat8;
    private CheckBox checkbox_meat9;
    private CheckBox checkbox_meat10;
    private CheckBox checkbox_meat11;
    private CheckBox checkbox_meat12;

    CheckBox[] checkBoxes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horarios_disponiveis);
        Toolbar toolbar = findViewById(R.id.toolbarCalendarHorarios);
        setSupportActionBar(toolbar);
        trocarServico(servicoMudar1,servicoMudar21,precoTrocar1,mediaTempoTrocar1);
        checkbox_meat1 = findViewById(R.id.checkbox_meat1);
        checkbox_meat2 = findViewById(R.id.checkbox_meat2);
        checkbox_meat3 = findViewById(R.id.checkbox_meat3);
        checkbox_meat4 = findViewById(R.id.checkbox_meat4);
        checkbox_meat5 = findViewById(R.id.checkbox_meat5);
        checkbox_meat6 = findViewById(R.id.checkbox_meat6);
        checkbox_meat7 = findViewById(R.id.checkbox_meat7);
        checkbox_meat8 = findViewById(R.id.checkbox_meat8);
        checkbox_meat9 = findViewById(R.id.checkbox_meat9);
        checkbox_meat10 = findViewById(R.id.checkbox_meat10);
        checkbox_meat11 = findViewById(R.id.checkbox_meat11);
        checkbox_meat12 = findViewById(R.id.checkbox_meat12);
        checkBoxes = new CheckBox[]{checkbox_meat1, checkbox_meat2, checkbox_meat3, checkbox_meat4, checkbox_meat5, checkbox_meat6, checkbox_meat7, checkbox_meat8, checkbox_meat9, checkbox_meat10, checkbox_meat11, checkbox_meat12};
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
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void trocarServico(String servicoTrocar,String servicoTrocar2, String precoTrocar, String mediaTempoTrocar) {
        servico = findViewById(R.id.textViewHorario);
        servico.setText(servicoTrocar);
        //-----------------------------------------
        servico2 = findViewById(R.id.servico_editar_marcado);
        servico2.setText(servicoTrocar2);
        //-----------------------------------------
        preco = findViewById(R.id.textView_preco2);
        preco.setText(precoTrocar);
        //-----------------------------------------
        mediaTempo = findViewById(R.id.textView_tempo2);
        mediaTempo.setText(mediaTempoTrocar);
    }


    /**
     * volta para aba anterior
     *
     * @param view
     */
    public void voltarCalendario(View view) {
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
        this.finish();
    }

    public void desmarcarCheckBox1(View view){
        for(int i=0;i<checkBoxes.length;i++){
            if(checkBoxes[i].getId() != checkbox_meat1.getId()){
                checkBoxes[i].setChecked(false);
            }
        }
    }
    public void desmarcarCheckBox2(View view){
        for (CheckBox a:checkBoxes
        ) {
            System.out.println(a.getText());
        }
        for(int i=0;i<checkBoxes.length;i++){
            if(checkBoxes[i].getId() != checkbox_meat2.getId()){
                checkBoxes[i].setChecked(false);
            }
        }
    }
    public void desmarcarCheckBox3(View view){
        for(int i=0;i<checkBoxes.length;i++){
            if(checkBoxes[i].getId() != checkbox_meat3.getId()){
                checkBoxes[i].setChecked(false);
            }
        }
    }
    public void desmarcarCheckBox4(View view){
        for(int i=0;i<checkBoxes.length;i++){
            if(checkBoxes[i].getId() != checkbox_meat4.getId()){
                checkBoxes[i].setChecked(false);
            }
        }
    }
    public void desmarcarCheckBox5(View view){
        for(int i=0;i<checkBoxes.length;i++){
            if(checkBoxes[i].getId() != checkbox_meat5.getId()){
                checkBoxes[i].setChecked(false);
            }
        }
    }
    public void desmarcarCheckBox6(View view){
        for(int i=0;i<checkBoxes.length;i++){
            if(checkBoxes[i].getId() != checkbox_meat6.getId()){
                checkBoxes[i].setChecked(false);
            }
        }
    }
    public void desmarcarCheckBox7(View view){
        for(int i=0;i<checkBoxes.length;i++){
            if(checkBoxes[i].getId() != checkbox_meat7.getId()){
                checkBoxes[i].setChecked(false);
            }
        }
    }
    public void desmarcarCheckBox8(View view){
        for(int i=0;i<checkBoxes.length;i++){
            if(checkBoxes[i].getId() != checkbox_meat8.getId()){
                checkBoxes[i].setChecked(false);
            }
        }
    }
    public void desmarcarCheckBox9(View view){
        for(int i=0;i<checkBoxes.length;i++){
            if(checkBoxes[i].getId() != checkbox_meat9.getId()){
                checkBoxes[i].setChecked(false);
            }
        }
    }
    public void desmarcarCheckBox10(View view){
        for(int i=0;i<checkBoxes.length;i++){
            if(checkBoxes[i].getId() != checkbox_meat10.getId()){
                checkBoxes[i].setChecked(false);
            }
        }
    }
    public void desmarcarCheckBox11(View view){
        for(int i=0;i<checkBoxes.length;i++){
            if(checkBoxes[i].getId() != checkbox_meat11.getId()){
                checkBoxes[i].setChecked(false);
            }
        }
    }
    public void desmarcarCheckBox12(View view){
        for(int i=0;i<checkBoxes.length;i++){
            if(checkBoxes[i].getId() != checkbox_meat12.getId()){
                checkBoxes[i].setChecked(false);
            }
        }
    }
    public void horarioMarcadoComSucesso(View view){
        Intent intent = new Intent(this, HorarioMarcadoActivity.class);
        startActivity(intent);
        this.finish();
    }
}