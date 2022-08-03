package filosofos;

import javax.swing.*;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends JFrame{
    static Semaphore mutex = new Semaphore(1);
    static Semaphore[] semaphores = new Semaphore[5];
    static Filosofo[] filosofos = new Filosofo[5];
    static int[] estado = new int[5];

    private static long total = 0;
    private static int cont = 0;
    static void setTotal(long i){
        total = i;
    }
    static long getTotal(){
        return total;
    }
    static void incCont(){
        cont++;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setFocusable(true);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setResizable(false);

        filosofos[0] = new Filosofo("Platao", 0);
        filosofos[0].getPainel().setBounds(210,50, 80, 80);
        filosofos[1] = new Filosofo("Aristoteles", 1);
        filosofos[1].getPainel().setBounds(75,170, 80, 80);
        filosofos[2] = new Filosofo("Socrates", 2);
        filosofos[2].getPainel().setBounds(130,320, 80, 80);
        filosofos[3] = new Filosofo("Descartes", 3);
        filosofos[3].getPainel().setBounds(290,320, 80, 80);
        filosofos[4] = new Filosofo("Kant", 4);
        filosofos[4].getPainel().setBounds(345,170, 80, 80);

        for(int i = 0; i < estado.length; i++){
            estado[i] = 0;
        }

        for(int i = 0; i < semaphores.length; i++){
            semaphores[i] = new Semaphore(0);
        }

        for(int i = 0; i < filosofos.length; i++){
            System.out.println("garfo " + i + " - " + filosofos[i].getName() + " - garfo " + (i+1)%5);
            frame.add(filosofos[i].getPainel());
            filosofos[i].start();
        }
        System.out.println();

        try{
            Thread.sleep(20000);
            System.out.println((float)total/cont);
            System.exit(0);
        }catch(InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}