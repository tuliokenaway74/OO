package filosofos;

public class Filosofo extends Thread{

    int id;

    // estados
    final int PENSANDO = 0;
    final int FAMINTO = 1;
    final int COMENDO = 2;

    public Filosofo(String nome, int id) {
        super(nome);
        this.id = id;
    }

    public void ComFome() {
        Main.estado[this.id] = 1;
        System.out.println("O Filósofo " + getName() + " está FAMINTO!");
    }

    public void Come() {
        Main.estado[this.id] = 2;
        System.out.println("O Filósofo " + getName() + " está COMENDO");
        try{
            Thread.sleep(1000L);
        }catch(InterruptedException ex){
            System.out.println("ERROR>" + ex.getMessage());
        }
    }

    public void Pensa() {
        Main.estado[this.id] = 0;
        System.out.println("O Filósofo " + getName() + " está PENSANDO!");
        try{
            Thread.sleep(1000L);
        }catch(InterruptedException ex){
            System.out.println("ERROR>" + ex.getMessage());
        }
    }

    public void LargarGarfo() throws InterruptedException {
        Main.mutex.acquire();
        Pensa();
        /*Quando um filosofo largar os garfos, o vizinho
        da esquerda e da direita podem tentar pegar os garfos*/
        Main.filosofos[VizinhoEsquerda()].TentarObterGarfos();
        Main.filosofos[VizinhoDireita()].TentarObterGarfos();
        Main.mutex.release();
    }

    public void PegarGarfo() throws InterruptedException {
        Main.mutex.acquire();
        ComFome();
        /*Caso a condicao for verdadeira, SEMAFORO(1),
        permitindo que o filosofo obtenha os garfos*/
        TentarObterGarfos();
        Main.mutex.release();
        /*Caso a condicao nao seja verdadeira, o filosofo vai ficar
        travado no seu respectivo indice do semaforo, ate chegar
        sua vez novamente para tentar pegar os garfos*/
        Main.semaphores[this.id].acquire(); // semaphores[this.id] = new Semaphore(0)
    }

    public void TentarObterGarfos() {
        /*Se o filosofo estiver faminto e o vizinho esquerdo e direito
        nao estiver comendo, chama o metodo come();*/
        if(Main.estado[this.id] == 1 && Main.estado[VizinhoEsquerda()] != 2 && Main.estado[VizinhoDireita()] != 2){
            Come();
            Main.semaphores[this.id].release(); // semaphores[this.id] = new Semaphore(1)
        }else{
            System.out.println(getName() + " não conseguiu comer!");
        }
    }

    @Override
    public void run() {
        try{
            Pensa();
            System.out.println();
            do{
                PegarGarfo();
                Thread.sleep(1000L);
                LargarGarfo();
            }while(true);
        }catch(InterruptedException ex){
            System.out.println("ERROR>" + ex.getMessage());
            return;
        }
    }

    public int VizinhoEsquerda() {
        /*Filosofo 0 recebe vizinho a esquerda 4,
        porque se calcularmos o resultado sera -1*/
        if(this.id == 0){
            return 4;
        }else{
            return(this.id-1)%5;
        }
    }

    public int VizinhoDireita() {
        return(this.id+1)%5;
    }
}
