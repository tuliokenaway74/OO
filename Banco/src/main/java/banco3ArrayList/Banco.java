package banco3ArrayList;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Cliente> clientes;

    public Banco() {
        this.clientes = new ArrayList<>();
//      this.clientes = new banco3.Cliente[5];
    }

    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
//      clientes[numeroDeClientes] = cliente;
//      numeroDeClientes++;
    }

    public Cliente getCliente(int indice) {
        return clientes.get(indice);
    }

    public int getNumeroDeClientes() {
        return this.clientes.size();
    }
}