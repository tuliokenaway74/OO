package animais;

public class Gato extends Animal implements AnimalDeEstimacao{

    public Gato(String nome) {
        super(nome, 4);
    }

    public Gato() {
        this("");
    }

    @Override
    public void brincar() {
        System.out.println(nome + " brinca com a bola de meia.");
    }

    @Override
    public void comer() {
        System.out.println(nome + " come racao.\n");
    }
}
