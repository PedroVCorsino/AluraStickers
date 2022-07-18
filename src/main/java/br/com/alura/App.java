package br.com.alura;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import br.com.alura.model.entity.Filme;
import br.com.alura.model.entity.pojo.Filmes;



/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws IOException, InterruptedException, Exception{

        ObjectMapper mapper = new ObjectMapper();

        String url = "https://api.mocki.io/v2/549a5d8b";
        URI uri = URI.create(url);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(uri).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();

       
        Filmes filmes = new Gson().fromJson(body, Filmes.class);

        for (Filme filme : filmes.getFilmes()) {
            System.out.println("Classificação: " + filme.getImDbRating());
            System.out.println("Titulo: " + filme.getTitle());
            System.out.println("Imagem: "+ filme.getImage());
            System.out.println();
        }    

        
    }


}
