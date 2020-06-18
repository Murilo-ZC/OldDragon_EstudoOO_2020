package dragon.pack.ote.dados;

import java.util.*;

public class Dado {
    public static final int lancarDado(int numeroDeFaces){
        return new Random().nextInt(numeroDeFaces) + 1;
    }

    public static final List<Integer> lancarMultiplusDados(int numeroDeFaces, int numeroDeLancamentos){
        final List<Integer> resultados = new ArrayList<>();
        for (int i = 0; i < numeroDeLancamentos; i++) {
            resultados.add(lancarDado(numeroDeFaces));
        }
        return resultados;
    }

    public static final Map<Integer, List<Integer>> lancarMultiplusDados(Map<Integer, Integer> configuracoesDeLancamento){
        final HashMap<Integer, List<Integer>> resultadosFinais = new HashMap<>();
        for (int numeroDeFaces : configuracoesDeLancamento.keySet()) {
            final List<Integer> resultadosDadosDaFace = new ArrayList<>();
            System.out.println("Chave atual:" + numeroDeFaces);
            resultadosFinais.put(numeroDeFaces,
                    lancarMultiplusDados(numeroDeFaces, configuracoesDeLancamento.get(numeroDeFaces)));
        }
        return resultadosFinais;
    }
}
