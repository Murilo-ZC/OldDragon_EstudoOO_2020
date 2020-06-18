package dragon.pack.ote.personagens;

import dragon.pack.ote.dados.Dado;
import dragon.pack.ote.enumeracoes.AtributosPersonagem;

import java.util.HashMap;
import java.util.Map;

public class Personagem {
    private Map<AtributosPersonagem, Integer> atributos;

    public Personagem() {
        atributos = gerarAtributos();
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
                "atributos=" + atributos +
                '}';
    }
}
