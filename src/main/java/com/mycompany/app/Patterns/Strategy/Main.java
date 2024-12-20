package com.mycompany.app.Patterns.Strategy;

import com.mycompany.app.Patterns.Strategy.Interface.EstrategiaPublicacao;

public class Main {
    public static void main(String[] args) {
        // Uso do padrão Estratégia
        EstrategiaPublicacao estrategia = new PublicacaoArtigo();
        estrategia.publicar();
    }
}
