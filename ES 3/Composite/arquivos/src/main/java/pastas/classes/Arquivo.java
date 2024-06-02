package pastas.classes;

import pastas.interfaces.ArquivoSistema;

public class Arquivo implements ArquivoSistema {
    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void display() {
        System.out.println(nome);
    }
}
