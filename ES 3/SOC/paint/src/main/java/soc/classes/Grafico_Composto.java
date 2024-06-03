package soc.classes;

import java.util.ArrayList;
import java.util.List;

import soc.interfaces.Grafico;

public class Grafico_Composto implements Grafico {
    private List<Grafico> children = new ArrayList<>();

    @Override
    public void desenhar() {
        for (Grafico grafico : children) {
            grafico.desenhar();
        }
    }
    
    public void adicionar(Grafico grafico) {
        children.add(grafico);
    }

    public void remover(Grafico grafico) {
        children.remove(grafico);
    }

    public Grafico getChild(int index) {
        return children.get(index);
    }

}
