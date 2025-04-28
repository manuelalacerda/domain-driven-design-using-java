package br.com.fiap.main;

import javax.swing.*;

public class Usuario {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Digite uma frase");
        JOptionPane.showMessageDialog(null, frase.length());
        JOptionPane.showMessageDialog(null, frase.toUpperCase());
        String palavraNova = JOptionPane.showInputDialog("Digite uma palavra que existe na frase");
        String palavraSubstuida = JOptionPane.showInputDialog("Digite uma palavra para substitui pela primeira palavra");
        JOptionPane.showMessageDialog(null, frase.replace(palavraNova, palavraSubstuida));
        JOptionPane.showMessageDialog(null, palavraSubstuida.length() + frase.length());


    }
}
