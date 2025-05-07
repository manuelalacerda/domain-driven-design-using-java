package br.com.fiap.bean;

public class Quadrado {
    private float lado;
    //contrutores
    public Quadrado(){

    }
    public Quadrado(float lado){
        this.lado = lado;
    }
    //metodos getters/setters
    public float getLado(){
        return lado;
    }
    public  void setLado(float lado){
        this.lado = lado;
    }
    //metodos da classe(particulares)
    public float calcularArea(){
        return lado * lado;
    }
}
