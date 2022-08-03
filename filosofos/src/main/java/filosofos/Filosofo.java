package filosofos;

import javax.swing.*;
import java.awt.*;
import java.time.*;

public class Filosofo extends Thread{
    private int id;

    // estados
    final int PENSANDO = 0;
    final int FAMINTO = 1;
    final int COMENDO = 2;

    private JPanel painel = new JPanel();
    private JLabel nomeLabel = new JLabel();
    private JLabel estadoLabel = new JLabel();
    private Instant start;

    public Filosofo(String nome, int id) {
        super(nome);
        this.id = id;
        painel.setLayout(new GridLayout(2,1));
        painel.setBorder(BorderFactory.createLineBorder(Color.black));
        nomeLabel.setText(nome);
        nomeLabel.setSize(30,30);
        nomeLabel.setVisible(true);
        estadoLabel.setSize(30,30);
        estadoLabel.setVisible(true);
        painel.add(nomeLabel);
        painel.add(estadoLabel);
    }

    public JPanel getPainel() {
        return painel;
    }

    public void comFome() {
        Main.estado[this.id] = FAMINTO;
        System.out.println("O filosofo " + getName() + " esta com fome");
        painel.setBackground(Color.red);
        estadoLabel.setText("Faminto");
        start = Instant.now();
    }

    public void come() {
        Main.estado[this.id] = COMENDO;
        System.out.println("O filosofo " + getName() + " esta comendo");
        painel.setBackground(Color.green);
        estadoLabel.setText("Comendo");
        Main.incCont();
        Main.setTotal(Main.getTotal() + Duration.between(start, Instant.now()).getSeconds());
        try{
            Thread.sleep(2000L);
        }catch(InterruptedException ex){
            System.out.println("ERROR>" + ex.getMessage());
        }
    }

    public void pensa() {
        Main.estado[this.id] = PENSANDO;
        System.out.println("O filosofo " + getName() + " esta pensando");
        painel.setBackground(Color.yellow);
        estadoLabel.setText("Pensando");
        try{
            Thread.sleep(2000L);
        }catch(InterruptedException ex){
            System.out.println("ERROR>" + ex.getMessage());
        }
    }

    public void largarGarfo() throws InterruptedException {
        Main.mutex.acquire();
        pensa();
        Main.filosofos[vizinhoEsquerda()].tentarObterGarfos();
        Main.filosofos[vizinhoDireita()].tentarObterGarfos();
        Main.mutex.release();
    }

    public void pegarGarfo() throws InterruptedException {
        Main.mutex.acquire();
        comFome();
        tentarObterGarfos();
        Main.mutex.release();
        Main.semaphores[this.id].acquire();
    }

    public void tentarObterGarfos() {
        if(Main.estado[this.id] == FAMINTO && Main.estado[vizinhoEsquerda()] != COMENDO && Main.estado[vizinhoDireita()] != COMENDO){
            come();
            Main.semaphores[this.id].release();
        }
    }

    @Override
    public void run() {
        try{
            pensa();
            System.out.println();
            do{
                pegarGarfo();
                Thread.sleep(2000L);
                largarGarfo();
            }while(true);
        }catch(InterruptedException ex){
            System.out.println("ERROR>" + ex.getMessage());
            return;
        }
    }

    public int vizinhoEsquerda() {
        if(this.id == 0){
            return 4;
        }else{
            return(this.id-1)%5;
        }
    }

    public int vizinhoDireita() {
        return(this.id+1)%5;
    }
}