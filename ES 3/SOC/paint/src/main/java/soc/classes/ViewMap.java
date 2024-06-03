package soc.classes;

import soc.interfaces.Observer;

public class ViewMap implements Observer {
    @Override
    public void update() {
        System.out.println("Map modificado");
    }
    
}
