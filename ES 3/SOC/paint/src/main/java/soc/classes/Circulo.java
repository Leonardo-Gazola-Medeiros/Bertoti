package soc.classes;

import soc.interfaces.Grafico;

public class Circulo implements Grafico{
    @Override
    public void desenhar() {
        System.out.println("Desenhando um circulo");
    }
}
