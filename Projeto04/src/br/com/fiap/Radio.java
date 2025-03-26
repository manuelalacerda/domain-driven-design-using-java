package br.com.fiap;

public class Radio {
    //Atributos
    public int volume;
    public float estacao;

    //Metodos
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void trocarEstacao(float frequencia){
        estacao = frequencia;
    }


}
