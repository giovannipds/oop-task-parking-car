/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carroestacionamento;

/**
 *
 * @author giovannipds
 */
public class Tempo {
    private int horas;
    private int minutos;
    private int segundos;
    
    // TODO: validar hora entre 0 e 12 e minuto e segundo entre 0 e 60
    public Tempo() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }
    
    public Tempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public String getHoraFormatada() {
        String hora = this.horas < 10 ? "0" + this.horas : Integer.toString(this.horas);
        String minuto = this.minutos < 10 ? "0" + this.minutos : Integer.toString(this.minutos);
        return hora + ":" + minuto;
    }

    /**
     * @return the horas
     */
    public int getHoras() {
        return this.horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * @return the minutos
     */
    public int getMinutos() {
        return this.minutos;
    }

    /**
     * @param minutos the minutos to set
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    /**
     * @return the segundos
     */
    public int getSegundos() {
        return this.segundos;
    }

    /**
     * @param segundos the segundos to set
     */
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
}
