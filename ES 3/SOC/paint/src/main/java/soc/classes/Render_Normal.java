package soc.classes;

import soc.interfaces.Grafico;
import soc.interfaces.Render_Strategy;

public class Render_Normal implements Render_Strategy {
    
    @Override
    public void render(Grafico grafico) {
        System.out.println("Renderização Normal");
        grafico.desenhar();
    }
}
