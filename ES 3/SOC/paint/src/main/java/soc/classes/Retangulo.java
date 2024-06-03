package soc.classes;

import soc.interfaces.Grafico;

public class Retangulo implements Grafico{
    @Override
    public void desenhar() {
        System.out.println("Desenhando um retangulo");
    }
}
