package pastas.classes;

import pastas.interfaces.ArquivoSistema;

import java.util.ArrayList;
import java.util.List;


public class Diretorio implements ArquivoSistema {
    private String nome;
    private List<ArquivoSistema> components = new ArrayList<>();

    public Diretorio(String nome) {
        this.nome = nome;
    }

    @Override
    public void display() {
        System.out.println(nome);
        for (ArquivoSistema component : components) {
            component.display();
        }
    }

    public void add(ArquivoSistema component) {
        components.add(component);
    }

    public void remove(ArquivoSistema component) {
        components.remove(component);
    }

    public ArquivoSistema getChild(int i) {
        return components.get(i);
    }
}
