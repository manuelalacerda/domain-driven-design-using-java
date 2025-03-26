package br.com.fiap;

public class ArCondicionado {
    //Atributos
    public int temperatura;
    public String modo;

    //Metodos
    public void aumentaTemperatura(){temperatura++;}
    public void diminuirTemperatura(){temperatura--;}
    public void trocarModo(String novoModo){modo = novoModo;}
}
