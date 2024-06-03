package soc.classes;

import soc.interfaces.Grafico;
import soc.interfaces.Render_Strategy;

public class Quadro {
    private Render_Strategy renderStrategy;

    public void setRenderStrategy(Render_Strategy renderStrategy){
    
    this.renderStrategy = renderStrategy;
    }

    public void renderGrafico(Grafico grafico) {
        renderStrategy.render(grafico);
    }

}
