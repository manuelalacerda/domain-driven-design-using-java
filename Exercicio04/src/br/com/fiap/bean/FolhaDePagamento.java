package br.com.fiap.bean;

public class FolhaDePagamento {

    //atributos

    public double salarioBruto;
    public int numeroDeDependentes;
    public double descontoINSS;
    public double valorPlanoDeSaude;

    //métodos

    public double calcularSalarioLiquido(){
        double descontoSaude = (numeroDeDependentes+ 1) * valorPlanoDeSaude;
        double desconto = salarioBruto * (descontoINSS/100);
        double salarioLiquido = salarioBruto - descontoSaude - desconto;
        return salarioLiquido;
    }



}
