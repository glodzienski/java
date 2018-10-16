package exprovadois;

import java.util.ArrayList;

public class PlayList {

    ArrayList<Musica> PlayList = new ArrayList();

    void adicionaMusica(Musica nova) {
        PlayList.add(nova);
    }

    void removeMusica(String titulo) {
        for (Musica musica : PlayList) {
            if (musica.titulo.equals(titulo)) {
                PlayList.remove(musica);
                break;
            }
        }

    }

    int totalDuracao() {
        int total = 0;
        for (Musica musica : PlayList) {
            total = total + musica.duracao;
        }
        return total;

    }

    void listar() {
        for (Musica musica : PlayList) {
            System.out.println("Titulo: " + musica.titulo);
            System.out.println("Autor: " + musica.autor);
            System.out.println("Duração: " + musica.duracao);
        }
        System.out.println("------");
    }

}
