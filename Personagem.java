public class Personagem {
    private String nome;
    private String tipo;
    private int nivel;
    private int vida;

    public Personagem(String nome, String tipo, int nivel, int vida) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
        this.vida = vida;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }

    public int getVida() { return vida; }
    public void setVida(int vida) {
        if (vida >= 0 && vida <= 100) {
            this.vida = vida;
        }
    }

    public void atacar() {
        System.out.println(nome + " realizou um ataque!");
    }

    public void subirNivel() {
        nivel++;
    }

    public void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) {
            vida = 0;
        }
    }

    public void recuperarVida(int pontos) {
        vida += pontos;
        if (vida > 100) {
            vida = 100;
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    @Override
    public String toString() {
        return "Personagem: " + nome
             + " | Tipo: " + tipo
             + " | Nível: " + nivel
             + " | Vida: " + vida;
    }
}