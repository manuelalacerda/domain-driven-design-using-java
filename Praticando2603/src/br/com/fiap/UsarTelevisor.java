package br.com.fiap;

public class UsarTelevisor {
    public static void main(String[] args) {
        Televisor televisor1; //declaração
        televisor1 = new Televisor(); //Intanciação

        //Exemplo
        //Televisor televisor1 = new Televisor(); //declarando e instanciando

        televisor1.canal = 5;
        televisor1.volume = 10;
        televisor1.trocarCanal(4);
        televisor1.aumentaVolume();
        televisor1.aumentaVolume();
        System.out.println("Volume atual: " + televisor1.volume + "\nCanal atual: " + televisor1.canal);
    }
}
