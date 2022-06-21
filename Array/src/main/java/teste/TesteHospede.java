package teste;

public class TesteHospede {
    static int qntHospedes = 0;

    public static void main(String[] args) {

        Endereco end1 = new Endereco("Rua Maria Medeiros Paruci", 110, "casa");

        Hospede tulio = criarHospede("Tulio", "Trombini", 19, end1);
        exibeDados(tulio);
    }

    public static Hospede criarHospede(String nome, String sobrenome, int idade, Endereco e) {
        qntHospedes++;
        if(e == null) {
            return new Hospede(nome, sobrenome, idade);
        } else {
            return new Hospede(nome, sobrenome, idade, e);
        }
    }

    public static void exibeDados(Hospede h) {
        if(h.getEndereco() == null) {
            System.out.println("\nHospede " + qntHospedes + ":");
            System.out.println("Nome........: " + h.getNome());
            System.out.println("Sobrenome...: " + h.getSobrenome());
            System.out.println("Idade.......: " + h.getIdade());
        } else {
            System.out.println("\nHospede " + qntHospedes + ":");
            System.out.println("Nome........: " + h.getNome());
            System.out.println("Sobrenome...: " + h.getSobrenome());
            System.out.println("Idade.......: " + h.getIdade());
            System.out.println("Endereco....: " + h.getEndereco().getRua() + ", " + h.getEndereco().getNumero() + ", " + h.getEndereco().getComplemento());
        }
    }
}
