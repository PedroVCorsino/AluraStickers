package br.com.alura;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import com.google.gson.Gson;
import br.com.alura.model.entity.Filme;
import br.com.alura.model.entity.pojo.Filmes;



/**
 * Hello world!
 *
 */
public class App {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";

    public static void main( String[] args ) throws IOException, InterruptedException, Exception{

        


        String url = "https://api.mocki.io/v2/549a5d8b";
        URI uri = URI.create(url);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(uri).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();

       
        Filmes filmes = new Gson().fromJson(body, Filmes.class);

        for (Filme filme : filmes.getFilmes()) {
            System.out.println("Classificação: " + filme.getRatingAsStars(filme.getImDbRating()));
            System.out.println("Titulo: "+ ANSI_RED_BACKGROUND + filme.getTitle()+ ANSI_RESET);
            System.out.println("Imagem: "+ filme.getImage());
            System.out.println();
        }            
    }


}
