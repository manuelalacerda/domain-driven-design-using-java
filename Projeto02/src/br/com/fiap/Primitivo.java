package br.com.fiap;

public class Primitivo {
    public static void main(String[] args) {
        //declaração e inicialização (opcional) de variaveis

        char sexo = 'F';
        //; (ponto e virgula) fim da linha de comando

        byte idade = 21;
        //byte (numero inteiro de -128 + 127)

        short codigo = 15635;
        //short (vai de -32.768 a + 32.767)

        int alunos = 50, classes = 11;

        long brasileiros = 216535103700L;

        //long (vai de 9.223.372.036.854.775.808 a +9.223.372.036.854.775.807)(coloca o L para indicar que é long sempre maiusculo

        float media = 8.55f;
        //float (vai de -3.4029234f+38 a +3.40292347E+38)(coloca o f indica que é float sempre minusculo)

        double dolar = 5.68;
        //double (sempre com ponto por causa do padrao norte americano) (vai de -1.7976931486231570+308 a -1.7976931486231570E+308 )

        boolean alternativa = false;
        //boolean (não utiliza aspas)(sempre false ou true)

        String nomeCompleto = "Manuela de Driven Java";

        System.out.println("Sexo: " + sexo + " Idade: " + idade + " anos");
        //nao pode usar virgula pra contatenar

        System.out.println("Codigo: " + codigo + " Alunos: " + alunos + " Turmas: " + classes + " Média: " + media);

        System.out.println("Habitantes: " + brasileiros + " Cotação do dólar: U$ " + dolar + " Alternativa: " + alternativa);

        System.out.println("Nome: " + nomeCompleto);







    }
}
