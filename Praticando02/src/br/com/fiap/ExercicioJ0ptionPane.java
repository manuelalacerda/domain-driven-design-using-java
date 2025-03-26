package br.com.fiap;

import javax.swing.*;

public class ExercicioJ0ptionPane {
    public static void main(String[] args) {

        //MEDIA DE QUATRO NOTAS

        float primeiraNota, segundaNota, terceiraNota, quartaNota, media;
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Digite a primeira nota");
            primeiraNota = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a segunda nota");
            segundaNota = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a terceira nota");
            terceiraNota = Float.parseFloat(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a quarta nota");
            quartaNota = Float.parseFloat(auxiliar);
            media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
            JOptionPane.showMessageDialog(null,"Sua média é " + media);

        } catch (Exception e) {
            System.out.println("Número no formato errado");
        }

        //-----------IDADE DATA DE NASCIMENTO-----------

        int anoDeNascimeto, idadeDoUsuario, anoAtual;

        try {
            auxiliar = JOptionPane.showInputDialog("Digite o ano atual");
            anoAtual = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite o ano do seu nascimento");
            anoDeNascimeto = Integer.parseInt(auxiliar);
            idadeDoUsuario = anoAtual - anoDeNascimeto;
            JOptionPane.showInputDialog(null,"Sua idade è " + idadeDoUsuario);
        } catch (Exception e) {
            System.out.println("Número no formato errado");
        }

        //----------------RAIO----------------

        double areaDoCirculo, raioDoCirculo;

        try {
            auxiliar = JOptionPane.showInputDialog("Digite o valor do raio de um círculo");
            raioDoCirculo = Double.parseDouble(auxiliar);
            areaDoCirculo = Math.PI * (raioDoCirculo * raioDoCirculo);
            JOptionPane.showMessageDialog(null,"O valor da área deste círculo é de " + areaDoCirculo);
        } catch (Exception e) {
            System.out.println("Número no formato errado");
        }

    }
}
