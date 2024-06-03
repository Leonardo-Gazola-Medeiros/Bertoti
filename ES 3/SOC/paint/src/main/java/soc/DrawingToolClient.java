package soc;

import soc.interfaces.Grafico;
import soc.classes.*;

public class DrawingToolClient {
    public static void main(String[] args) {
        // Create simple shapes
        Grafico circulo = new Circulo();
        Grafico retangulo = new Retangulo();

        // Create a composite graphic
        Grafico_Composto composto = new Grafico_Composto();
        composto.adicionar(circulo);
        composto.adicionar(retangulo);

        // Set up rendering strategies
        Quadro canvas = new Quadro();
        canvas.setRenderStrategy(new Render_Normal());
        canvas.renderGrafico(composto);

        canvas.setRenderStrategy(new Render_HD());
        canvas.renderGrafico(composto);

        // Set up observable canvas and views
        QuadroView quadroView = new QuadroView();
        ViewZoom zoomView = new ViewZoom();
        ViewMap mapView = new ViewMap();

        quadroView.attach(zoomView);
        quadroView.attach(mapView);

        // Change state of the canvas and notify observers
        quadroView.changeState();
    }
}