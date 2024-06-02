package pastas;

import pastas.classes.Arquivo;
import pastas.classes.Diretorio;
import pastas.interfaces.ArquivoSistema;

public class Client {
    public static void main(String[] args) {
        ArquivoSistema arquivo1 = new Arquivo("arquivo1.txt");
        ArquivoSistema arquivo2 = new Arquivo("arquivo2.txt");
        ArquivoSistema arquivo3 = new Arquivo("arquivo3.txt");

        Diretorio diretorio1 = new Diretorio("dir1");
        Diretorio diretorio2 = new Diretorio("dir2");

        diretorio1.add(arquivo1);
        diretorio1.add(arquivo2);

        diretorio2.add(arquivo3);
        diretorio2.add(diretorio1);

        diretorio2.display();
    }
}
