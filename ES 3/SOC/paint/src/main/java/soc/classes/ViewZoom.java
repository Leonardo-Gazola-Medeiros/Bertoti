package soc.classes;

import soc.interfaces.Observer;

public class ViewZoom implements Observer {
    @Override
    public void update() {
        System.out.println("Zoom modificado");
    }
    
}
