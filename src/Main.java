import personagens.Guerreiro;

public class Main {
    public static void main(String[] args) {
        Guerreiro primeiroGuerreiro = new Guerreiro("Arthas", 10, 120, "espada");
        Guerreiro segundoGuerreiro = new Guerreiro("Borin", 8, 95, "machado");

        primeiroGuerreiro.atacar();
        primeiroGuerreiro.atacar(30);
        primeiroGuerreiro.atacar(45, "orc");

        primeiroGuerreiro.exibirInfo();
        segundoGuerreiro.exibirInfo();

        if (primeiroGuerreiro.getPontosDeVida() > segundoGuerreiro.getPontosDeVida()) {
            System.out.println(primeiroGuerreiro.getNome() + " esta em melhor estado.");
        } else if (primeiroGuerreiro.getPontosDeVida() < segundoGuerreiro.getPontosDeVida()) {
            System.out.println(segundoGuerreiro.getNome() + " esta em melhor estado.");
        } else {
            System.out.println("Os dois guerreiros estao em igual estado.");
        }
    }
}
