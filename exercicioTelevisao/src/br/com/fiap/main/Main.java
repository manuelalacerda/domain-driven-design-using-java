package br.com.fiap.main;

import br.com.fiap.bean.Televisor;

public class Main {
    public static void main(String[] args) {
        Televisor televisor = new Televisor();
        televisor.setVolume(15);
        televisor.setCanal(2);
        televisor.aumentarVolume();
        televisor.aumentarVolume();
        televisor.aumentarVolume();
        televisor.getCanal();
    }
}
