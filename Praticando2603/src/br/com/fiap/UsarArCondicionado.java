package br.com.fiap;

public class UsarArCondicionado {
    public static void main(String[] args) {
        ArCondicionado ArCondicionado1; //declaração
        ArCondicionado1 = new ArCondicionado();//instanciação

        //Exemplo
        //ArCondicionado ArCondicionado = new ArCondicionado(); //declarando e instanciando

        ArCondicionado1.temperatura = 20;
        ArCondicionado1.modo = "Aquecer";
        ArCondicionado1.AumentaTemperatura();
        ArCondicionado1.trocarModo("Ventilar");
        System.out.println("Temperatura atual: " + ArCondicionado1.temperatura + "\nModo atual/: " + ArCondicionado1.modo);
    }
}
