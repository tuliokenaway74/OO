package animais;

public class TesteAnimais {
    public static void main(String[] args) {

        Peixe p = new Peixe("Nemo");
        Gato g = new Gato("Tom");
        Animal a = new Peixe("Peixoto");
        Animal ab = new Aranha("Aracnilda");
        AnimalDeEstimacao ae = new Gato("Pudim");

        imprimir(p);
        p.brincar();
        p.comer();

        imprimir(g);
        g.brincar();
        g.comer();

//        imprimir(a);
//        a.brincar();
//        a.comer();
//
//        imprimir(ab);
//        ab.brincar();
//        ab.comer();

//        imprimir(ae);
//        ae.brincar();
//        ((Gato) ae).comer();
    }
    public static void imprimir(Animal a) {
        if(a instanceof Peixe) {
            System.out.println(a.nome + " nao anda, nada.");
        } else {
            System.out.println(a.nome + " anda com " + a.numeroDePernas + " pernas");

        }
    }

//    public static void imprimir2(AnimalDeEstimacao ae) {
//        if(ae instanceof Peixe) {
//            System.out.println(ae.nome + " nao anda, nada.");
//        } else {
//            System.out.println(ae.nome + " anda com " + ae.numeroDePernas + " pernas");
//
//        }
//    }
}
