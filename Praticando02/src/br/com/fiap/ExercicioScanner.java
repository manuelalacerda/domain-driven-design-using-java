package br.com.fiap;

import java.util.Scanner;

public class ExercicioScanner {
    public static void main(String[] args) {

        //--------------MEDIA DE QUARTO NOTA-------------

        float primeiraNota, segundaNota, terceiraNota, quartaNota, media;
        Scanner scan; // declaração do objeto

        try {

            scan = new Scanner(System.in);
            System.out.println("Digite quatro nota e veja sua média");
            System.out.print("Primeira Nota: ");
            primeiraNota = scan.nextFloat();
            System.out.print("SegundaNota: ");
            segundaNota = scan.nextFloat();
            System.out.print("Terceira Nota: ");
            terceiraNota = scan.nextFloat();
            System.out.print("Quarta Nota: ");
            quartaNota = scan.nextFloat();
            media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
            System.out.println("Sua média é: " + media);

        } catch (Exception e) {
            System.out.println("Número no formato errado");
        }

        //----------IDADE-----------

        int anoDeNascimeto, idadeDoUsuario, anoAtual;

        try {
            scan = new Scanner(System.in);
            System.out.println("Descobrindo sua idade");
            System.out.print("Digite o ano atual: ");
            anoAtual = scan.nextInt();
            System.out.print("Digite seu ano de nascimento: ");
            anoDeNascimeto = scan.nextInt();
            idadeDoUsuario = anoAtual - anoDeNascimeto;
            System.out.println("A sua idade é: " + idadeDoUsuario );

        } catch (Exception e) {
            System.out.println("Número no formato errado");
        }

        //------------RAIO---------------

        double areaCirculo, raioCirculo;

        try {
            scan = new Scanner(System.in);
            System.out.println("Descobrindo a área do círculo");
            System.out.print("Digite o valor do raio de um círculo : ");
            raioCirculo = scan.nextDouble();
            areaCirculo = Math.PI * (raioCirculo * raioCirculo);
            System.out.println("A área do círculo é de: " + areaCirculo );
        } catch (Exception e) {
            System.out.println("Número no formato errado");
        }

    }
}
