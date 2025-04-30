package br.com.fiap.main;

import br.com.fiap.bean.Gestante;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Gestante gestante1;
        String auxiliar , nome, dataEUA;
        LocalDate dataGestacao;
        try {
            nome = JOptionPane.showInputDialog("Digite seu nome");
            auxiliar = JOptionPane.showInputDialog("Digite a data de inicio da gestação (dd/MM/yyyy)");
            //arrumando a string no formato ano-mês-dia
            // 0 1 2 3 4 5 6 7 8 9
            // 1 5 / 0 8 / 2 0 0 3
            String ano = auxiliar.substring(6,10);
            String mes = auxiliar.substring(3,5);
            String dia = auxiliar.substring(0,2);
            dataEUA = ano + "-" + mes + "-" + dia; //2003-08-15
            dataGestacao = LocalDate.parse(dataEUA);

            gestante1 = new Gestante(nome, dataGestacao);

        JOptionPane.showMessageDialog(null, String.format("Formato EUA \nData de Nascimento: %s ", gestante1.getDataDaGestacao()));
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        JOptionPane.showMessageDialog(null, String.format("Dados Pessoais \nNome: %s \nData de Gestação: %s \nIdade: %d mês ", gestante1.getNome(), gestante1.getDataDaGestacao().format(dft), gestante1.tempoDeGestacao()));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
