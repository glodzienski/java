package exprovadois;

public class ExProvaDois {

    public static void main(String[] args) {

        PlayList primeira = new PlayList();
        
        Musica um = new Musica("Brasília", "Mamonas Assassinas", 2);
        Musica dois = new Musica("1406", "Mamonas Assassinas", 2);
        Musica tres = new Musica("Pelados em Santos", "Mamonas Assassinas", 2);
        Musica quatro = new Musica("Money", "Mamonas Assassinas", 2);

        primeira.adicionaMusica(um);
        primeira.adicionaMusica(dois);
        primeira.adicionaMusica(tres);
        primeira.adicionaMusica(quatro);

        primeira.listar();
        
        System.out.println("Duração total playlist " + primeira.totalDuracao() + " min.");
        
        System.out.println("========");
        
        primeira.removeMusica("Brasília");
        
        primeira.listar();

    }

}
