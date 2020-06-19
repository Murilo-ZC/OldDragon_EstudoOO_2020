package dragon.pack.ote.personagens;

import dragon.pack.ote.dados.Dado;
import dragon.pack.ote.enumeracoes.AtributosPersonagem;
import dragon.pack.ote.enumeracoes.Classes;
import dragon.pack.ote.enumeracoes.Racas;

import java.util.HashMap;
import java.util.Map;

public class Personagem {
    private Map<AtributosPersonagem, Integer> atributos;
    private final String nome;
    private final Racas raca;
    private final Classes classe;

    public Personagem(String nome, Racas raca, Classes classe) {
        atributos = gerarAtributos();
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
    }

    private final Map<AtributosPersonagem, Integer> gerarAtributos() {
        final Map<AtributosPersonagem, Integer> resultado = new HashMap<>();
        for (AtributosPersonagem atributo : AtributosPersonagem.values()) {
            int total = 0;
            for (int valor : Dado.lancarMultiplusDados(6, 3)) {
                total += valor;
            }
            resultado.put(atributo, total);
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "atributos=" + atributos + "," +
                "nome=" + this.nome + "," +
                "raca=" + this.raca + "," +
                "classe=" + this.classe +
                '}';
    }
}
