package arrays;

import teste.Endereco;
import teste.Hospede;

public class Lecture10Arrays {
    public static void main(String[] args) {

        int numbers[] = new int[5];

        for(int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        System.out.println();

//        for(int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        for(int x:numbers){
            System.out.println(x);
        }


        String names[] = new String[4];

        System.out.println();
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        names[0] = "Túlio";
        names[1] = "Sérgio";
        names[2] = "Rosa";
        names[3] = "Trombini";

        System.out.println();
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


        String weekend[] = {"Saturday", "Sunday"};
        System.out.println();
        for(int i = 0; i < weekend.length; i++) {
            System.out.println(weekend[i]);
        }
//        String weekend[] = new String[2];
//        weekend[0] = "Saturday";
//        weekend[1] = "Sunday";

        Hospede hospedes[] = new Hospede[2];

        Endereco end1 = new Endereco("Rua Maria Medeiros Paruci", 110, "casa");
        Hospede tulio = new Hospede("Túlio", "Trombini", 19, end1);
        hospedes[0] = tulio;

        Endereco end2 = new Endereco("Rua Luiz Severo", 66, "apartamento 204");
        Hospede beto = new Hospede("Carlos", "Trombini", 65, end2);
        hospedes[1] = beto;

        System.out.println();
        int qntHospedes = 0;
        Hospede aux = null;
        for(int i = 0; i < hospedes.length; i++) {
            qntHospedes++;
            System.out.println("\nHospede " + qntHospedes + ":");
            System.out.println("Nome........: " + hospedes[i].getNome());
            System.out.println("Sobrenome...: " + hospedes[i].getSobrenome());
            System.out.println("Idade.......: " + hospedes[i].getIdade());
            System.out.println("Endereco....: " + hospedes[i].getEndereco().getRua() + ", " + hospedes[i].getEndereco().getNumero() + ", " + hospedes[i].getEndereco().getComplemento());
        }



        //int twoDimensions[][] = new int[2][2];

        int twoDimensions[][] = new int[2][];
        twoDimensions[0] = new int[2];
        twoDimensions[1] = new int[5];

        //int twoDimensions[][] = new int[0][2]; Inválido!

        System.out.println();
//        System.out.println(twoDimensions.length);
//        System.out.println(twoDimensions[0].length);
//        System.out.println(twoDimensions[1].length);

        for(int i = 0; i < twoDimensions.length; i++){
            System.out.println();
            for(int j = 0; j < twoDimensions[i].length; j++){
                twoDimensions[i][j] = (int)(Math.random() * 10);
                System.out.println(twoDimensions[i][j]);
            }
        }
    }
}