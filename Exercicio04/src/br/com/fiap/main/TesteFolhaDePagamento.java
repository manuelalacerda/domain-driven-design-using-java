package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

public class TesteFolhaDePagamento {
    public static void main(String[] args) {
        FolhaDePagamento salario = new FolhaDePagamento();
        salario.salarioBruto = 80000.00;
        salario.descontoINSS = 30;
        salario.valorPlanoDeSaude = 500.00;
        salario.numeroDeDependentes = 5;

        double resultadoSalarioLiquido = salario.calcularSalarioLiquido();
        System.out.printf("Teste Folha De Pagamento\nSalário Bruto: %.2f\nDesconto INSS: %.0f porcento\nDesconto Valor Do Plano De Saude: %.2f\nNúmero De Dependente: %d\nSalario Liquido: %.2f", salario.salarioBruto, salario.descontoINSS, salario.valorPlanoDeSaude, salario.numeroDeDependentes, resultadoSalarioLiquido);

    }
}
