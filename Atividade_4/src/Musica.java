/*
classe Musica.
- Atributos: titulo, artista, duracaoSegundos.
- Método exibirTempoMinutos(): Converta os segundos   para o formato "Minutos:Segundos".
*/
public class Musica {
    String titulo;
    String artista;
    int duracaoSegundos;

    void exibirTempoMinutos(){
        int minutos = duracaoSegundos / 60;
        int segundos = duracaoSegundos % 60;
        System.out.println(minutos+":"+segundos);
    }

    void exibirNoPlayer(){
        /*
            Titulo
            Artista
            Duração (minutos e segundos)
         */
    }
}
