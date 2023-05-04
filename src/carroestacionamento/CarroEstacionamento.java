/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carroestacionamento;

/**
 *
 * @author giovannipds
 */
public class CarroEstacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estacionamento carro1 = new Estacionamento();
        
        carro1.setModelo("Palio");
        carro1.setPlaca("IZX-2354");
        carro1.imprimir();
        carro1.setHoraEntrada(new Tempo(12, 0, 0));
        carro1.setHoraSaida(new Tempo(13, 30, 0));
        carro1.calcular();
        
        Estacionamento carro2 = new Estacionamento();
        
        carro2.setModelo("Polo");
        carro2.setPlaca("IQT-8648");
        carro2.imprimir();
        carro2.setHoraEntrada(new Tempo(19, 0, 0));
        carro2.setHoraSaida(new Tempo(22, 30, 0));
        carro2.calcular();
    }
    
}
