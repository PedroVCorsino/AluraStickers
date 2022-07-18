package br.com.alura.model.entity.pojo;

import java.util.List;

import br.com.alura.model.entity.Filme;

public class Filmes {
    
    private List<Filme> items;
    
    public List<Filme> getFilmes() {
        return items;
    }
    public void setFilmes(List<Filme> items) {
        this.items = items;
    }
    
}
