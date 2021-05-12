package com.example.CabeleireiroAgendamento1.dominio.entidades;

public class Reserva {

    private String servico;
    private String data_e_hora_agendamento;
    private Double valor;
    private Cliente cliente;

    public Reserva(String servico, String data_e_hora_agendamento, Double valor, Cliente cliente) {
        this.servico = servico;
        this.data_e_hora_agendamento = data_e_hora_agendamento;
        this.valor = valor;
        this.cliente = cliente;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getData_e_hora_agendamento() {
        return data_e_hora_agendamento;
    }

    public void setData_e_hora_agendamento(String data_e_hora_agendamento) {
        this.data_e_hora_agendamento = data_e_hora_agendamento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
