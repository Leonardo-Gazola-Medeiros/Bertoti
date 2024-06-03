package soc.classes;

import soc.interfaces.Grafico;
import soc.interfaces.Render_Strategy;

public class Render_HD implements Render_Strategy {
    @Override
    public void render(Grafico grafico) {
        System.out.println("Renderização HD");
        grafico.desenhar();
    }
    
}
