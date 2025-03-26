package br.com.fiap;

public class Televisor {
    //Atributos
    public int volume;
    public int canal;

    //Metodos
    public void aumentaVolume(){volume++;}
    public void diminuirVolume(){volume--;}
    public void trocarCanal(int novoCanal){canal = novoCanal;}
}
