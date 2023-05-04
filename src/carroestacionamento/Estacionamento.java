/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carroestacionamento;

/**
 *
 * @author giovannipds
 */
public class Estacionamento {
    private String placa;
    private String modelo;
    private Tempo horaEntrada;
    private Tempo horaSaida;
    static int custo = 2;

    public void Estacionamento() {
        this.placa = null;
        this.modelo = null;
        this.horaEntrada = new Tempo();
        this.horaSaida = new Tempo();
    }

    public void imprimir() {
        System.out.println("Carro estacionado, modelo: '" + this.modelo + "', placa: '" + this.placa + "'");
    }

    public void calcular() {
        int valor = 0;
        int horas = this.horaSaida.getHoras() - this.horaEntrada.getHoras();
        valor = horas * Estacionamento.custo;
        System.out.println("Valor a ser pago: R$ " + valor);
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the horaEntrada
     */
    public Tempo getHoraEntrada() {
        return horaEntrada;
    }

    /**
     * @param horaEntrada the horaEntrada to set
     */
    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    /**
     * @return the horaSaida
     */
    public Tempo getHoraSaida() {
        return horaSaida;
    }

    /**
     * @param horaSaida the horaSaida to set
     */
    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida = horaSaida;
    }
}
