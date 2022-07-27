package filosofos;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Tulio
 */
public class Main {

    static Semaphore mutex = new Semaphore(1);
    // semaforo para cada filosofo
    static Semaphore[] semaphores = new Semaphore[5];

    static Filosofo[] filosofos = new Filosofo[5];
    static int[] estado = new int[5];

    public static void main(String[] args) {


        // todos filosofos iniciam pensando
        for(int i=0; i < estado.length; i++){
            estado[i] = 0;
        }

        // inicializa todos filosofos
        filosofos[0] = new Filosofo("Platão", 0);
        filosofos[1] = new Filosofo("Aristóteles", 1);
        filosofos[2] = new Filosofo("Sócrates", 2);
        filosofos[3] = new Filosofo("Descartes", 3);
        filosofos[4] = new Filosofo("Kant", 4);

        // saber quais garfos pertence aos filosofos
        for(int i=0; i < filosofos.length; i++) {
            System.out.println("garfo " + i + " - filosofo " + i + " - garfo " + (i+1)%5);
        }
        System.out.println();

        for(int i=0; i < semaphores.length; i++){
            semaphores[i] = new Semaphore(0);
        }

        for(int i=0; i < filosofos.length; i++){
            filosofos[i].start();
        }

        try{
            Thread.sleep(10000);
            System.exit(0);
        }catch(InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}