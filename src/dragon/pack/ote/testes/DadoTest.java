package dragon.pack.ote.testes;

import dragon.pack.ote.dados.Dado;

import java.util.HashMap;

public class DadoTest {
    public static void main(String[] args) {
        System.out.println("Lançamento de um D4:" + Dado.lancarDado(4));
        System.out.println("Lançamento de um D6:" + Dado.lancarDado(6));
        System.out.println("Lançamento de um D8:" + Dado.lancarDado(8));

        System.out.println("Lançamento de um D4 x 3 vezes (3d4):" + Dado.lancarMultiplusDados(4,3));
        System.out.println("Lançamento de um D20 x 5 vezes (5d20):" + Dado.lancarMultiplusDados(20,5));


        System.out.println("Lançamento de (5d20), (2d6), (3d4) e (3d12):" + Dado.lancarMultiplusDados(
                new HashMap<Integer, Integer>(){
                    {
                        put(20,5);
                        put(6,2);
                        put(4,3);
                        put(12,3);
                    }
                }
        ));
    }
}
