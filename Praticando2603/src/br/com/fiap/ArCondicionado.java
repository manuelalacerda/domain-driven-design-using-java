package br.com.fiap;

public class ArCondicionado {
    //Atributos
    public int temperatura;
    public String modo;

    //Metodos
    public void AumentaTemperatura(){temperatura++;}
    public void DiminuirTemperatura(){temperatura--;}
    public void trocarModo (String novoModo){modo = novoModo;}
}
