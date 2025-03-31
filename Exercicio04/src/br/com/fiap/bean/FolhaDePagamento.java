package br.com.fiap.bean;

public class FolhaDePagamento {

    //atributos

    public double salarioBruto;
    public int numeroDeDependentes;
    public double descontoINSS;
    public double valorDeSaude;
    public double salario;

    //métodos

    public double calcularSalarioLiquido(){
        double descontoSaude = (numeroDeDependentes+ 1) * valorDeSaude;
        double desconto = descontoINSS/100;
        double salarioBruto = salario - descontoSaude - desconto;
        return calcularSalarioLiquido();
    }



}
