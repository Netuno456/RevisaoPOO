public class Main {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("Luna", "Maga", 3, 100);
        Personagem p2 = new Personagem("Kael", "Guerreiro", 2, 100);

        System.out.println(p1);
        System.out.println(p2);

        p1.atacar();
        p2.receberDano(30);
        p1.subirNivel();
        p2.setTipo("Paladino");

        p1.setVida(150);
        System.out.println("Vida de Luna após setVida(150): " + p1.getVida());

        System.out.println(p1);
        System.out.println(p2);

        p2.receberDano(500);
        System.out.println("Kael está vivo? " + p2.estaVivo());
        p2.recuperarVida(40);
        System.out.println(p2);
    }
}