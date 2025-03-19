package br.com.fiap;

public class Constante {
    public static void main(String[] args) {
        //declaração e inicialização de constantes

        final double PI = 3.1415;
        //final (se torna uma constante)(constante tudo maiusculo)(final mais o nome da variavel)

        final float GRAVIDADE_TERRESTRE = 9.8f;
        //_(underline) utilizado para não ter espaço

        //sequência de escape : \n (pula de linha)
        //sequência de Escape \t (Tabulação)(pode usar quantas tabulções quiser)
        System.out.println("Valor de PI:\t\t " + PI + "\nGravidade da Terra:\t " + GRAVIDADE_TERRESTRE);

    }
}
