package banco3;

public class Banco {
    private Cliente clientes[];
    private int numeroDeClientes;

    public Banco() {
        this.clientes = new Cliente[5];
    }

    public void adicionarCliente(Cliente cliente){
        clientes[numeroDeClientes] = cliente;
        numeroDeClientes++;
    }

    public Cliente getCliente(int indice) {
        return clientes[indice];
    }

    public int getNumeroDeClientes() {
        return numeroDeClientes;
    }
}
