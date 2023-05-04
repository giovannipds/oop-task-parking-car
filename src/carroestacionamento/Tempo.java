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
}
