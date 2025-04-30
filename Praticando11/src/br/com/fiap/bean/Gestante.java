package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Gestante {

    //atributo
    private String nome;
    private LocalDate dataDaGestacao;

    //construtor
    public Gestante() {
    }
    public Gestante(String nome, LocalDate dataDaGestacao) {
        this.nome = nome;
        setDataDaGestacao(dataDaGestacao);
        //this.dataDaGestacao = dataDaGestacao;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataDaGestacao() {
        return dataDaGestacao;
    }
    public void setDataDaGestacao(LocalDate dataDaGestacao) {
        LocalDate inicio = LocalDate.parse("2024-04-30");
        LocalDate fim = LocalDate.now();
        try {
            if (dataDaGestacao.isAfter(inicio) && dataDaGestacao.isBefore(fim)){
                this.dataDaGestacao = dataDaGestacao;
            }else {
                throw new Exception("Data fora da faixa permitida");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);//encerra
        }
    }
    //classes (particulares)
    public int tempoDeGestacao(){
        LocalDate dataAtual = LocalDate.now();
        Period gestacao= Period.between(dataDaGestacao, dataAtual);
        return gestacao.getMonths();
    }
}
