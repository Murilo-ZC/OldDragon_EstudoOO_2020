package dragon.pack.ote.testes;

import dragon.pack.ote.enumeracoes.Classes;
import dragon.pack.ote.enumeracoes.Racas;
import dragon.pack.ote.personagens.Personagem;

public class PersonagemTest {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("Roberto Carlos Paulinho - O implacavel!", Racas.AANAO, Classes.MAGO);
        Personagem p2 = new Personagem("Jorge Rodolfo", Racas.ELFO, Classes.CLERIGO);
        System.out.println("P1");
        System.out.println(p1);
        System.out.println("P2");
        System.out.println(p2);

    }
}
