package com.mycompany.app.Patterns.Strategy;

import com.mycompany.app.Patterns.Strategy.Interface.EstrategiaPublicacao;

public class PublicacaoArtigo implements EstrategiaPublicacao{
    public void publicar() {
        System.out.println("Publicando artigo...");
    }
}
